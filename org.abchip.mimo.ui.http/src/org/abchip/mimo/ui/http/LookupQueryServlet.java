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

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.ui.query.Query;
import org.abchip.mimo.ui.query.QueryFactory;
import org.abchip.mimo.ui.query.QueryField;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;

public class LookupQueryServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String name = request.getParameter("name");
		String prototype = request.getParameter("prototype");

		Query query = resourceManager.getResourceReader(contextProvider, Query.class, Resource.TENANT_MASTER).lookup(name);

		if (query == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			query = QueryFactory.eINSTANCE.createQuery();
			query.setName("prototype");

			Frame<?> frame = frameManager.getFrame(frameName);
			QueryField currentField = null;
			QueryField currentKey = null;
			for (Slot slot : frame.getSlots()) {
				QueryField field = buildField(slot);
				if (slot.isKey()) {

					if (currentKey == null)
						Lists.qINSTANCE.addFirst(query.getFields(), field);
					else
						Lists.qINSTANCE.addAfter(query.getFields(), currentKey, field);

					if (currentField == null || currentField.equals(currentKey))
						currentField = field;

					currentKey = field;
				} else if (slot.getName().startsWith("created"))
					Lists.qINSTANCE.addLast(query.getFields(), field);
				else if (slot.getName().startsWith("lastUpdated"))
					Lists.qINSTANCE.addLast(query.getFields(), field);
				else {
					if (currentField == null)
						Lists.qINSTANCE.addFirst(query.getFields(), field);
					else
						Lists.qINSTANCE.addAfter(query.getFields(), currentField, field);
					currentField = field;
				}
			}
		}

		ResourceSerializer<Query> entitySerializer = resourceManager.createResourceSerializer(Query.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		if (query != null)
			entitySerializer.add(query);
		entitySerializer.save(response.getOutputStream());
	}

	private QueryField buildField(Slot slot) {
		QueryField field = QueryFactory.eINSTANCE.createQueryField();
		field.setId(slot.getName());

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		field.setValue(Strings.qINSTANCE.firstToUpper(label.toString()));

		if (slot.isString()) {
			field.setType("string");
		} else if (slot.isBoolean()) {
			field.setType("string");
		} else if (slot.isNumeric()) {
			field.setType("number");
		} else if (slot.isDate()) {
			field.setType("date");
		} else {
			System.out.println("Unexpected condition: 873we65r87ewtr");
			field.setType("string");
		}

		return field;
	}
}