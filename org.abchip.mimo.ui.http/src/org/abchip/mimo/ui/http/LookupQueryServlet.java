/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.query.Query;
import org.abchip.mimo.ui.query.QueryFactory;
import org.abchip.mimo.ui.query.QueryField;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;

public class LookupQueryServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		String name = request.getParameter("name");
		String prototype = request.getParameter("prototype");

		Frame<?> frame = resourceManager.getFrame(context, frameName);
		if (frame == null)
			return;

		Query query = resourceManager.getResourceReader(context, Query.class, Resource.TENANT_MASTER).lookup(name);

		if (query == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			query = QueryFactory.eINSTANCE.createQuery();
			query.setName("prototype");

			QueryField currentField = null;
			QueryField currentKey = null;
			for (Slot slot : frame.getSlots()) {
				QueryField field = buildField(slot);
				if (slot.isKey()) {

					if (currentKey == null)
						Lists.addFirst(query.getFields(), field);
					else
						Lists.addAfter(query.getFields(), currentKey, field);

					if (currentField == null || currentField.equals(currentKey))
						currentField = field;

					currentKey = field;
				} else if (slot.getName().startsWith("created"))
					Lists.addLast(query.getFields(), field);
				else if (slot.getName().startsWith("lastUpdated"))
					Lists.addLast(query.getFields(), field);
				else {
					if (currentField == null)
						Lists.addFirst(query.getFields(), field);
					else
						Lists.addAfter(query.getFields(), currentField, field);
					currentField = field;
				}
			}
		}

		ResourceSerializer<Query> entitySerializer = resourceManager.createResourceSerializer(context, Query.class, SerializationType.JSON);
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
		field.setValue(Strings.firstToUpper(label.toString()));
		
		switch (slot.getDataType()) {
		case BOOLEAN:
		case STRING:
		case ENTITY:
		case ENUM:
			field.setType("string");
			break;
		case BINARY:
			break;
		case DATE_TIME:
			field.setType("date");
			break;
		case IDENTITY:
		case NUMERIC:
			field.setType("number");
			break;
		}
		
		return field;
	}
}