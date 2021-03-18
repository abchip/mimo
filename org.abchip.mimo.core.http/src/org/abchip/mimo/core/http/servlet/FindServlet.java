/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.E4FrameClassAdapter;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityState;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class FindServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String proxy = request.getParameter("proxy");
		if (proxy == null || proxy.trim().isEmpty())
			proxy = "false";
		String limit = request.getParameter("limit");
		if (limit == null)
			limit = "0";
		String filter = request.getParameter("filter");
		String fields = request.getParameter("fields");
		String order = request.getParameter("order");

		String[] keys = request.getParameterValues("keys");

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) context.getResourceManager().getFrame(frameName);
		if (frame == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		if (keys != null && keys.length > 0) {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			for (String slotKey : frame.getAllKeys()) {
				if (keys.length == i)
					break;

				Slot slot = frame.getSlot(slotKey);
				switch (slot.getDataType()) {
				case STRING:
				case DATE_TIME:
				case ENUM:
					sb.append(slotKey + " = \"" + keys[i] + "\"");
					break;
				case IDENTITY:
				case NUMERIC:
				case BOOLEAN:
					sb.append(slotKey + " = " + keys[i] + "");
					break;
				case BINARY:
				case ENTITY:
					sb.append(slotKey + " = \"" + keys[i] + "\"");
					break;
				case OBJECT:
					break;
				}

				i++;
			}

			if (filter != null)
				filter = sb.toString() + " and " + filter;
			else
				filter = sb.toString();
		}

		try {
			// TODO remove me
			if (frame.getName().equalsIgnoreCase(Frame.class.getSimpleName()))
				TimeUnit.MILLISECONDS.sleep(10);

			Frame<?> flatFrame = createFlatFrame(context, frame, fields);

			ResourceReader<E> entityReader = context.getResourceManager().getResourceReader(frame);
			ResourceSerializer<E> entitySerializer = context.getResourceManager().createResourceSerializer(frame, SerializationType.MIMO);
			try (EntityIterator<E> entities = entityReader.find(filter, fields, order, Integer.parseInt(limit), Boolean.parseBoolean(proxy))) {
				response.setStatus(HttpServletResponse.SC_OK);
				for (E entity : entities) {
					if (flatFrame != null)
						entity = copyEntity(context, flatFrame, entity);

					entitySerializer.add(entity);
				}
			}

			if (!entitySerializer.isEmpty())
				entitySerializer.save(response.getOutputStream());
			else
				response.getWriter().write("[]");
			entitySerializer.clear();

		} catch (ResourceException | InterruptedException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}

	private <E extends EntityIdentifiable> E copyEntity(Context context, Frame<?> frameTo, E entity) {

		@SuppressWarnings("unchecked")
		E flatEntity = (E) EcoreUtil.create((EClass) frameTo.getEClassifier());

		List<Slot> proxySlots = new ArrayList<Slot>();
		for (Slot slotTo : frameTo.getAllSlots()) {
			if (!slotTo.getName().contains("_")) {
				Object valueFrom = entity.eGet(slotTo, false, false);
				if (valueFrom == null)
					continue;
				flatEntity.eSet(slotTo, valueFrom);
				if (valueFrom instanceof EntityIdentifiable) {
					EntityIdentifiable entityValue = (EntityIdentifiable) valueFrom;
					if (entityValue.getState() != EntityState.PROXY)
						proxySlots.add(slotTo);
				}
				continue;
			}

			Frame<?> frameInRole = frameTo;
			Slot slotInRole = null;
			EntityIdentifiable entityInRole = flatEntity;

			String[] tokens = slotTo.getName().split("_");

			StringBuffer eFeatureInRoleName = new StringBuffer();
			int i = 0;
			for (String token : tokens) {
				if (i > 0)
					eFeatureInRoleName.append("_");
				eFeatureInRoleName.append(token);
				i++;

				slotInRole = frameInRole.getSlot(token);
				if (slotInRole == null)
					break;

				// shift entity
				if (tokens.length > i) {
					Domain domain = slotInRole.getDomain();
					if (domain == null) {
						slotInRole = null;
						break;
					}
					Object slotValue = entityInRole.eGet(slotInRole, false, false);
					if (slotValue == null || !(slotValue instanceof EntityIdentifiable)) {
						entityInRole = null;
						slotInRole = null;
						frameInRole = null;
						break;
					}
					entityInRole = (EntityIdentifiable) slotValue;
					frameInRole = entityInRole.isa();
				} else {
					Object eFeatureValue = entityInRole.eGet(slotInRole, false, false);
					if (eFeatureValue != null)
						flatEntity.eSet(slotTo, eFeatureValue.toString());
				}
			}
		}

		// remove not proxy references
		for (Slot slotTo : proxySlots) {
			EntityIdentifiable entityValue = (EntityIdentifiable) flatEntity.eGet(slotTo, false, false);
			Frame<EntityIdentifiable> frameValue = entityValue.isa();
			EntityIdentifiable proxyValue = context.createProxy(frameValue, entityValue.getID());
			flatEntity.eSet(slotTo, proxyValue);
		}

		return flatEntity;
	}

	private Frame<?> createFlatFrame(Context context, Frame<?> ako, String fields) {

		if (fields == null || fields.trim().isEmpty())
			return null;

		List<String> fieldsToFlat = new ArrayList<String>();
		String[] tokenFields = fields.split(",");
		for (String tokenField : tokenFields) {
			if (tokenField.contains("->"))
				fieldsToFlat.add(tokenField);
		}

		if (fieldsToFlat.isEmpty())
			return null;

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName("TEMP");
		ePackage.setNsPrefix("mimo");
		ePackage.setNsURI("http://mimo");

		EClass eClass = ecoreFactory.createEClass();
		eClass.setName(ako.getName());
		eClass.getESuperTypes().add((EClass) ako.getEClassifier());

		ePackage.getEClassifiers().add(eClass);

		for (String fieldToFlat : fieldsToFlat) {

			Frame<?> frameInRole = ako;
			Slot slotInRole = null;

			String[] tokens = fieldToFlat.split("->");

			StringBuffer slotInRoleName = new StringBuffer();
			int i = 0;
			for (String token : tokens) {
				if (i > 0)
					slotInRoleName.append("_");
				slotInRoleName.append(token);
				i++;

				slotInRole = frameInRole.getSlot(token);
				if (slotInRole == null)
					break;

				// shift entity
				if (tokens.length > i) {
					if (ako.getSlot(slotInRoleName.toString()) == null) {
						EAttribute eAttribute = ecoreFactory.createEAttribute();
						eAttribute.setName(slotInRoleName.toString());
						eAttribute.setEType(EcorePackage.eINSTANCE.getEString());
						eClass.getEStructuralFeatures().add(eAttribute);
					}

					Domain domain = slotInRole.getDomain();
					if (domain == null) {
						slotInRole = null;
						break;
					}
					frameInRole = context.getFrame(domain.getFrame());
					if (frameInRole == null) {
						slotInRole = null;
						break;
					}
				} else {
					if (ako.getSlot(slotInRoleName.toString()) == null) {
						EAttribute eAttribute = ecoreFactory.createEAttribute();
						eAttribute.setName(slotInRoleName.toString());
						eAttribute.setEType(EcorePackage.eINSTANCE.getEString());
						eClass.getEStructuralFeatures().add(eAttribute);
					}
				}
			}
		}

		return new E4FrameClassAdapter<>(ako, eClass);
	}
}