/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.util.Strings;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SaveServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frame = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String json = request.getParameter("json");

		try (ResourceSerializer<E> resourceSerializer = resourceManager.createResourceSerializer(contextProvider, frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION)) {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, Object> map = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
			});
			if (!map.containsKey("eClass")) {
				String eClass = resourceSerializer.getFrame().getURI().toString();
				map.put("eClass", eClass);
				json = objectMapper.writeValueAsString(map);
			}

			resourceSerializer.load(new ByteArrayInputStream(json.getBytes()), false);
			E entity = resourceSerializer.get();

			EntityWriter<EntityNameable> entityWriter = resourceManager.getEntityWriter(contextProvider, frame, ResourceScope.ROOT);
			entityWriter.create(entity, true);
			
			response.setStatus(HttpServletResponse.SC_OK);
		}
	}
}