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
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.data.StringDef;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.form.Form;
import org.abchip.mimo.ui.form.FormFactory;
import org.abchip.mimo.ui.form.FormField;
import org.abchip.mimo.ui.widget.Widget;
import org.abchip.mimo.ui.widget.WidgetComboBox;
import org.abchip.mimo.ui.widget.WidgetComboBoxEntry;
import org.abchip.mimo.ui.widget.WidgetFactory;
import org.abchip.mimo.ui.widget.WidgetNumber;
import org.abchip.mimo.ui.widget.WidgetNumberAttribute;
import org.abchip.mimo.ui.widget.WidgetText;
import org.abchip.mimo.ui.widget.WidgetTextAttribute;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;

public class LookupFormServlet extends BaseServlet {

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

			Form form = application.getContext().getResourceManager().getResourceReader(Form.class).lookup(name);

			if (form == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
				form = FormFactory.eINSTANCE.createForm();
				form.setName("prototype");

				FormField currentField = null;
				FormField currentKey = null;
				for (Slot slot : frame.getAllSlots()) {

					// derived exclusion
					if (slot.isDerived())
						continue;

					if (slot.getGroup() != null && slot.getGroup().equals("info"))
						continue;

					FormField field = buildFormField(context, slot);
					if (slot.isKey()) {

						if (currentKey == null)
							Lists.addFirst(form.getFields(), field);
						else
							Lists.addAfter(form.getFields(), currentKey, field);

						if (currentField == null || currentField.equals(currentKey))
							currentField = field;

						currentKey = field;
					} else if (slot.getName().startsWith("created"))
						Lists.addLast(form.getFields(), field);
					else if (slot.getName().startsWith("lastUpdated"))
						Lists.addLast(form.getFields(), field);
					else {
						if (currentField == null)
							Lists.addFirst(form.getFields(), field);
						else
							Lists.addAfter(form.getFields(), currentField, field);
						currentField = field;
					}
				}
			}

			response.setStatus(HttpServletResponse.SC_OK);
			ResourceSerializer<Form> entitySerializer = context.getResourceManager().createResourceSerializer(Form.class, SerializationType.MIMO);
			if (form != null) {
				entitySerializer.add(form);
			}
			entitySerializer.save(response.getOutputStream());
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}

	private FormField buildFormField(Context context, Slot slot) throws ResourceException {

		FormField field = FormFactory.eINSTANCE.createFormField();
		field.setGroup(slot.getGroup());
		field.setKey(slot.isKey());
		field.setTopSplit(slot.isKey());

		// view
		Widget widget = null;

		if (slot.isContainment())
			widget = WidgetFactory.eINSTANCE.createWidgetForm();
		else if (slot.getDomain() != null)
			widget = WidgetFactory.eINSTANCE.createWidgetComboBox();
		else if (slot.getText().toLowerCase().contains("level"))
			widget = WidgetFactory.eINSTANCE.createWidgetCounter();
		else if (slot.getText().toLowerCase().contains("image"))
			widget = WidgetFactory.eINSTANCE.createWidgetImage();
		else {
			switch (slot.getDataType()) {
			case BINARY:
			case OBJECT:
				break;
			case BOOLEAN:
				widget = WidgetFactory.eINSTANCE.createWidgetCheckBox();
				break;
			case DATE_TIME:
				widget = WidgetFactory.eINSTANCE.createWidgetDatePicker();
				break;
			case ENTITY:
				widget = WidgetFactory.eINSTANCE.createWidgetComboBox();
				break;
			case ENUM:
				widget = WidgetFactory.eINSTANCE.createWidgetComboBox();
				break;
			case IDENTITY:
				break;
			case NUMERIC:
				widget = WidgetFactory.eINSTANCE.createWidgetNumber();
				NumericDef numericDef = (NumericDef) slot.getDataDef();
				if (numericDef.getPrecision() > 0) {
					WidgetNumberAttribute attributes = WidgetFactory.eINSTANCE.createWidgetNumberAttribute();
					attributes.setMaxlength(numericDef.getPrecision());
					((WidgetNumber) widget).setAttributes(attributes);
				}
				break;
			case STRING:
				widget = WidgetFactory.eINSTANCE.createWidgetText();
				StringDef stringDef = (StringDef) slot.getDataDef();
				// stringDef.setLength(50);
				if (stringDef.getLength() > 0) {
					WidgetTextAttribute attributes = WidgetFactory.eINSTANCE.createWidgetTextAttribute();
					attributes.setMaxlength(stringDef.getLength());
					((WidgetText) widget).setAttributes(attributes);
				}
				break;
			}
		}
		field.setWidget(widget);

		widget.setName(slot.getName());

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		widget.setLabel(Strings.firstToUpper(label.toString()));

		switch (widget.getView()) {
		case COMBO_BOX:
			if (slot.getDomain() != null) {
				WidgetComboBox widgetComboBox = (WidgetComboBox) widget;
				WidgetComboBoxEntry entry = WidgetFactory.eINSTANCE.createWidgetComboBoxEntry();
				entry.setFrame(slot.getDomain().getFrame());
				widgetComboBox.setEntry(entry);

				completeFormField(context, field, slot.getDomain().getFrame());
			}
			break;
		case CHECK_BOX:
			break;
		case COUNTER:
			break;
		case DASHBOARD:
			break;
		case DATE_PICKER:
			break;
		case FORM:
			break;
		case IMAGE:
			break;
		case LAYOUT:
			break;
		case NUMBER:
			break;
		case SWITCH:
			break;
		case TEXT:
			break;
		case TEXT_AREA:
			break;
		case REVIEW:
			break;
		case TOOLBAR:
			break;
		case BROWSER:
			break;
		case MENU:
			break;
		case PROPERTY:
			break;
		case QUERY:
			break;
		case TAB:
			break;
		case TABLE:
			break;
		case UPLOADER:
			break;
		case VIEW:
			break;
		}

		return field;
	}

	private void completeFormField(Context context, FormField formField, String frameName) throws ResourceException {

		ResourceReader<UiFrameSetup> frameSetupReader = context.getResourceManager().getResourceReader(UiFrameSetup.class);

		Frame<?> frame = context.getResourceManager().getFrame(frameName);
		if (frame == null)
			return;

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.addFirst(frameNames, frameName);

		for (String domainName : frameNames) {
			UiFrameSetup frameSetup = frameSetupReader.lookup(domainName);
			if (frameSetup == null)
				continue;

			if (formField.getWidget().getIcon() == null)
				formField.getWidget().setIcon(frameSetup.getIcon());

			if (!formField.isContextMenu())
				formField.setContextMenu(frameSetup.isContextMenu());
		}
	}
}