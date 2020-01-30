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
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.data.StringDef;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.UIFactory;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.View;
import org.abchip.mimo.ui.ViewNumber;
import org.abchip.mimo.ui.ViewNumberAttribute;
import org.abchip.mimo.ui.ViewText;
import org.abchip.mimo.ui.ViewTextAttribute;
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

		ResourceSerializer<Form> entitySerializer = resourceManager.createResourceSerializer(context, Form.class, SerializationType.JAVA_SCRIPT_MIMO_NOTATION);
		if (form != null) {
			completeForm(context, form);
			entitySerializer.add(form);
		}
		entitySerializer.save(response.getOutputStream());
	}

	private FormField buildFormField(Slot slot) {

		FormField field = FormFactory.eINSTANCE.createFormField();
		field.setGroup(slot.getGroup());
		field.setKey(slot.isKey());

		// view
		View view = null;

		if (slot.isContainment())
			view = UIFactory.eINSTANCE.createViewForm();
		else if (slot.getDomain() != null)
			view = UIFactory.eINSTANCE.createViewComboBox();
		else if (slot.getText().toLowerCase().contains("level"))
			view = UIFactory.eINSTANCE.createViewCounter();
		else if (slot.getText().toLowerCase().contains("image"))
			view = UIFactory.eINSTANCE.createViewImage();

		else {
			switch (slot.getDataType()) {
			case BINARY:
				break;
			case BOOLEAN:
				view = UIFactory.eINSTANCE.createViewCheckBox();
				break;
			case DATE_TIME:
				view = UIFactory.eINSTANCE.createViewDatePicker();
				break;
			case ENTITY:
				view = UIFactory.eINSTANCE.createViewComboBox();
				break;
			case ENUM:
				view = UIFactory.eINSTANCE.createViewComboBox();
				break;
			case IDENTITY:
				break;
			case NUMERIC:
				view = UIFactory.eINSTANCE.createViewNumber();
				NumericDef numericDef = (NumericDef) slot.getDataDef();
				// numericDef.setPrecision(50);
				if (numericDef.getPrecision() > 0) {
					ViewNumberAttribute attributes = UIFactory.eINSTANCE.createViewNumberAttribute();
					attributes.setMaxlength(numericDef.getPrecision());
					((ViewNumber) view).setAttributes(attributes);
				}

				// field.setPrecision(numericDef.getPrecision());
				// field.setScale(numericDef.getScale());
				view.setPattern(null);
				break;
			case STRING:
				view = UIFactory.eINSTANCE.createViewText();
				StringDef stringDef = (StringDef) slot.getDataDef();
				// stringDef.setLength(50);
				if (stringDef.getLength() > 0) {
					ViewTextAttribute attributes = UIFactory.eINSTANCE.createViewTextAttribute();
					attributes.setMaxlength(stringDef.getLength());
					((ViewText) view).setAttributes(attributes);
				}
				break;
			}
		}

		view.setName(slot.getName());
		view.setDomain((Domain) EcoreUtil.copy((EObject) slot.getDomain()));

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		view.setLabel(Strings.qINSTANCE.firstToUpper(label.toString()));

		field.setView(view);

		return field;
	}

	private void completeForm(Context context, Form form) {
		for (FormField formField : form.getFields())
			completeFormField(context, formField);
	}

	private void completeFormField(Context context, FormField formField) {

		Domain domain = formField.getView().getDomain();

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

			if (formField.getView().getIcon() == null)
				formField.getView().setIcon(frameSetup.getIcon());

			if (!formField.isContextMenu())
				formField.setContextMenu(frameSetup.isContextMenu());
		}
	}
}