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

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.form.Form;
import org.abchip.mimo.ui.form.FormField;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LookupFormServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;

	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String name = request.getParameter("name");
		String prototype = request.getParameter("prototype");

		ResourceSerializer<Form> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, Form.class, SerializationType.JSON);

		Form form = resourceManager.getEntityReader(contextRoot, Form.class, ResourceScope.CTX).lookup(name);

		if (form == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			form = frameManager.createEntity(Form.class);
			form.setName("prototype");

			Frame<?> frame = frameManager.getFrame(frameName);
			FormField currentField = null;
			for (Slot slot : frame.getSlots()) {
				FormField field = buildFormField(slot);
				if (slot.equals(frame.getSlotName())) {
					if (currentField == null)
						currentField = field;
					Lists.qINSTANCE.addFirst(form.getFields(), field);
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

		if (form != null) {
			completeForm(form);
			resourceSerializer.add(form);
		}

		resourceSerializer.save(response.getOutputStream());

		response.flushBuffer();
		resourceSerializer.clear();

	}

	private FormField buildFormField(Slot slot) {
		FormField field = frameManager.createEntity(FormField.class);
		field.setName(slot.getName());

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		field.setLabel(Strings.qINSTANCE.firstToUpper(label.toString()));
		
		if(slot.getDomain() != null) {
			field.setDomain((Domain)EcoreUtil.copy((EObject) slot.getDomain()));
			field.setView("combo");
		}
		else
			field.setView("text");
		
		return field;
	}

	private void completeForm(Form form) {
		for (FormField formField : form.getFields())
			completeFormField(formField);
	}

	private void completeFormField(FormField formField) {

		Domain domain = formField.getDomain();

		if (domain == null)
			return;

		EntityReader<UiFrameSetup> frameSetupReader = resourceManager.getEntityReader(contextRoot, UiFrameSetup.class, ResourceScope.CTX);
		
		Frame<?> frame = frameManager.getFrame(domain.getFrame());
		if(frame == null)
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