/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.ui.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.schema.Schema;
import org.abchip.mimo.ui.schema.SchemaColumn;
import org.abchip.mimo.ui.schema.SchemaFactory;
import org.abchip.mimo.ui.widget.Widget;
import org.abchip.mimo.ui.widget.WidgetFactory;
import org.abchip.mimo.util.Lists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LookupSchemaServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String name = request.getParameter("name");
		String prototype = request.getParameter("prototype");

		Frame<?> frame = context.getResourceManager().getFrame(frameName);
		if (frame == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		try {
			Application application = context.get(Application.class);

			Schema schema = context.getResourceManager().getResourceReader(Schema.class).lookup(name);
			if (schema == null)
				schema = application.getContext().getResourceManager().getResourceReader(Schema.class).lookup(name);

			if (schema == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
				schema = SchemaFactory.eINSTANCE.createSchema();
				schema.setName("prototype");

				SchemaColumn currentColumn = null;
				SchemaColumn currentKey = null;
				for (Slot slot : frame.getAllSlots()) {

					// if (slot.isRoute())
					// continue;

					SchemaColumn column = buildColumn(slot);

					// field id
					if (slot.isKey()) {

						if (currentKey == null)
							Lists.addFirst(schema.getColumns(), column);
						else
							Lists.addAfter(schema.getColumns(), currentKey, column);

						if (currentColumn == null || currentColumn.equals(currentKey))
							currentColumn = column;

						currentKey = column;
					} else if (slot.getName().startsWith("created"))
						Lists.addLast(schema.getColumns(), column);
					else if (slot.getName().startsWith("lastUpdated"))
						Lists.addLast(schema.getColumns(), column);
					else {
						if (currentColumn == null)
							Lists.addFirst(schema.getColumns(), column);
						else
							Lists.addAfter(schema.getColumns(), currentColumn, column);
						currentColumn = column;
					}
				}
			}

			response.setStatus(HttpServletResponse.SC_OK);
			ResourceSerializer<Schema> entitySerializer = context.getResourceManager().createResourceSerializer(Schema.class, SerializationType.MIMO);
			if (schema != null) {
				completeSchema(application.getContext(), frame, schema);
				entitySerializer.add(schema);
			}
			entitySerializer.save(response.getOutputStream());
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}

	private SchemaColumn buildColumn(Slot slot) {

		SchemaColumn column = SchemaFactory.eINSTANCE.createSchemaColumn();
		column.setId(slot.getName());
		column.setHeader(slot.getText());
		column.setLeftSplit(slot.isKey());
		column.setGroup(slot.getGroup());
		column.setAdjust(true);
		if (slot.getDomain() != null)
			column.setDomain((Domain) EcoreUtil.copy((EObject) slot.getDomain()));

		// view
		Widget widget = null;
		switch (slot.getDataType()) {
		case STRING:
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		case ENTITY:
			column.setSort("string");
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		case ENUM:
			column.setSort("string");
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		case BOOLEAN:
			widget = WidgetFactory.eINSTANCE.createWidgetCheckBox();
			break;
		case BINARY:
		case OBJECT:
			break;
		case DATE_TIME:
			column.setSort("raw");
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		case IDENTITY:
			column.setSort("int");
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		case NUMERIC:
			column.setSort("int");
			widget = WidgetFactory.eINSTANCE.createWidgetText();
			break;
		}

		column.setWidget(widget);

		return column;
	}

	private void completeSchema(Context context, Frame<?> frame, Schema schema) throws ResourceException {


		List<SchemaColumn> columns = new ArrayList<SchemaColumn>();

		for (SchemaColumn column : schema.getColumns()) {

			Frame<?> frameInRole = frame;
			Slot slotInRole = null;

			String[] tokens = column.getId().split("->");
			switch (tokens.length) {
			case 0:
			case 1:
				columns.add(column);
				break;
			default:
				StringBuffer slotInRoleName = new StringBuffer();
				int i = 0;
				for (String token : tokens) {
					if(i>0)
						slotInRoleName.append("_");
					slotInRoleName.append(token);
					i++;

					slotInRole = frameInRole.getSlot(token);
					if (slotInRole == null)
						break;

					// shift entity
					if (tokens.length > i) {
						if (schema.getColumn(slotInRoleName.toString()) == null) {
							SchemaColumn hiddenColumn = SchemaFactory.eINSTANCE.createSchemaColumn();
							hiddenColumn.setId(slotInRoleName.toString());
							hiddenColumn.setHeader(slotInRole.getText());
							hiddenColumn.setHidden(true);
							columns.add(hiddenColumn);
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
						column.setId(slotInRoleName.toString());
						columns.add(column);
					}
				}
				break;
			}
		}

		schema.getColumns().clear();
		schema.getColumns().addAll(columns);
		
		for (SchemaColumn column : schema.getColumns())
			completeSchemaColumn(context, column);
	}

	private void completeSchemaColumn(Context context, SchemaColumn column) throws ResourceException {

		column.setAdjust(true);
		
		Domain domain = column.getDomain();
		if (domain == null)
			return;

		ResourceReader<UiFrameSetup> frameSetupReader = context.getResourceManager().getResourceReader(UiFrameSetup.class);

		Frame<?> frame = context.getResourceManager().getFrame(domain.getFrame());
		if (frame == null)
			return;

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.addFirst(frameNames, domain.getFrame());

		for (String domainName : frameNames) {
			UiFrameSetup frameSetup = frameSetupReader.lookup(domainName);
			if (frameSetup == null)
				continue;

			if (column.getIcon() == null)
				column.setIcon(frameSetup.getIcon());

			if (!column.isContextMenu())
				column.setContextMenu(frameSetup.isContextMenu());
		}
	}
}