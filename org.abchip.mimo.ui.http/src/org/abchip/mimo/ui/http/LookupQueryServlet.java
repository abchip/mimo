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

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.ui.query.Query;
import org.abchip.mimo.ui.query.QueryField;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;

public class LookupQueryServlet extends BaseServlet {

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

		ResourceSerializer<Query> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, Query.class, SerializationType.JSON);

		Query query = resourceManager.getEntityReader(contextRoot, Query.class, ResourceScope.CTX).lookup(name);

		if (query == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			query = frameManager.createEntity(Query.class);
			query.setName("prototype");

			Frame<?> frame = frameManager.getFrame(frameName);
			QueryField currentField = null;
			for (Slot slot : frame.getSlots()) {
				QueryField field = buildField(slot);
				if (slot.equals(frame.getSlotName())) {
					if (currentField == null)
						currentField = field;
					Lists.qINSTANCE.addFirst(query.getFields(), field);
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

		if (query != null)
			resourceSerializer.add(query);

		resourceSerializer.save(response.getOutputStream());

		response.flushBuffer();
		resourceSerializer.clear();
	}

	private QueryField buildField(Slot slot) {
		QueryField field = frameManager.createEntity(QueryField.class);
		field.setId(slot.getName());

		StringBuffer label = new StringBuffer();
		for (char c : slot.getName().toCharArray()) {
			if (Character.isUpperCase(c) && label.length() != 0)
				label.append(" ");
			label.append(c);
		}
		field.setValue(Strings.qINSTANCE.firstToUpper(label.toString()));

		switch (slot.getDataClassName()) {
		case "java.lang.String":
		case "char":
			field.setType("string");
			break;
		case "java.util.Date":
			field.setType("date");
			break;
		case "java.math.BigDecimal":
		case "long":
			field.setType("number");
			break;
		default:
			System.out.println("Unexpected condition: 873we65r87ewtr" + slot.getDataClassName());
			field.setType("string");
			break;
		}

		return field;
	}
}