/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.form.Form;
import org.abchip.mimo.ui.form.FormFactory;
import org.abchip.mimo.ui.form.FormField;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LookupFormServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String name = request.getParameter("name");
		String prototype = request.getParameter("prototype");

		Frame<?> frame = resourceManager.getFrame(context, frameName);
		if (frame == null)
			return;

		Form form = resourceManager.getResourceReader(context, Form.class, Resource.TENANT_MASTER).lookup(name);

		if (form == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			form = FormFactory.eINSTANCE.createForm();
			form.setName("prototype");

			FormField currentField = null;
			FormField currentKey = null;
			for (Slot slot : frame.getSlots()) {

				// derived exclusion
				if (slot.isDerived())
					continue;

				if (slot.getGroup() != null && slot.getGroup().equals("info"))
					continue;

				FormField field = buildFormField(slot);
				if (slot.isKey()) {

					if (currentKey == null)
						Lists.qINSTANCE.addFirst(form.getFields(), field);
					else
						Lists.qINSTANCE.addAfter(form.getFields(), currentKey, field);

					if (currentField == null || currentField.equals(currentKey))
						currentField = field;

					currentKey = field;
				} else if (slot.getName().startsWith("created"))
					Lists.qINSTANCE.addLast(form.getFields(), field);
				else if (slot.getName().startsWith("lastUpdated"))
					Lists.qINSTANCE.addLast(form.getFields(), field);
				else {
					if (currentField == null)
						Lists.qINSTANCE.addFirst(form.getFields(), field);
					else
						Lists.qINSTANCE.addAfter(form.getFields(), currentField, field);
					currentField = field;
				}
			}
		}

		ResourceSerializer<Form> entitySerializer = resourceManager.createResourceSerializer(context, Form.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		if (form != null) {
			completeForm(context, form);
			entitySerializer.add(form);
		}
		entitySerializer.save(response.getOutputStream());
	}

	private FormField buildFormField(Slot slot) {
		FormField field = FormFactory.eINSTANCE.createFormField();
		field.setName(slot.getName());

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		field.setLabel(Strings.qINSTANCE.firstToUpper(label.toString()));

		field.setGroup(slot.getGroup());

		field.setTopSplit(slot.isKey());

		if (slot.getDomain() != null) {
			field.setDomain((Domain) EcoreUtil.copy((EObject) slot.getDomain()));
		}

		// view
		if ((slot.getDomain() != null)) {
			// if (slot.getDomain().getFrame().equals("BizEntityNoteData"))
			// field.setView("note");
		}

		if (field.getView() == null) {
			if (slot.isContainment())
				field.setView("form");
			else if (slot.getDomain() != null)
				field.setView("combo");
			else if (slot.isBoolean())
				field.setView("checkbox");
			else if (slot.isDate())
				field.setView("datepicker");
			else if (slot.getText().toLowerCase().contains("level"))
				field.setView("counter");
			else if (slot.getText().toLowerCase().contains("image"))
				field.setView("photo");
			else
				field.setView("text");
		}

		return field;
	}

	private void completeForm(Context context, Form form) {
		for (FormField formField : form.getFields())
			completeFormField(context, formField);
	}

	private void completeFormField(Context context, FormField formField) {

		Domain domain = formField.getDomain();

		if (domain == null)
			return;

		ResourceReader<UiFrameSetup> frameSetupReader = resourceManager.getResourceReader(context, UiFrameSetup.class);

		Frame<?> frame = resourceManager.getFrame(context, domain.getFrame());
		if (frame == null)
			return;

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.qINSTANCE.addFirst(frameNames, domain.getFrame());

		for (String domainName : frameNames) {
			UiFrameSetup frameSetup = frameSetupReader.lookup(domainName);
			if (frameSetup == null)
				continue;

			if (formField.getIcon() == null)
				formField.setIcon(frameSetup.getIcon());

			if (!formField.isContextMenu())
				formField.setContextMenu(frameSetup.isContextMenu());
		}
	}
}