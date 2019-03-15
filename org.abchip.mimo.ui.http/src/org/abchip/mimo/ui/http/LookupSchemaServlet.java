/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
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
import org.abchip.mimo.ui.schema.Schema;
import org.abchip.mimo.ui.schema.SchemaColumn;
import org.abchip.mimo.ui.schema.SchemaPackage;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LookupSchemaServlet extends BaseServlet {

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
		
		ResourceSerializer<Schema> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, Schema.class, SerializationType.JSON);
		
		Schema schema = resourceManager.getEntityReader(contextRoot, Schema.class, ResourceScope.CTX).lookup(name);
		
		if(schema == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			schema = (Schema) EcoreUtil.create(SchemaPackage.eINSTANCE.getSchema());
			schema.setName("prototype");
			
			Frame<?> frame = frameManager.getFrame(frameName);
			SchemaColumn currentColumn =  null;
			for(Slot slot: frame.getSlots()) {
				SchemaColumn column = buildColumn(slot);
				if(slot.isName()) {
					if(currentColumn == null)
						currentColumn = column;
					Lists.qINSTANCE.addFirst(schema.getColumns(), column);
				}
				else if(slot.getName().startsWith("created"))
					Lists.qINSTANCE.addLast(schema.getColumns(), column);
				else if(slot.getName().startsWith("lastUpdated"))
					Lists.qINSTANCE.addLast(schema.getColumns(), column);
				else {
					if(currentColumn == null)
						Lists.qINSTANCE.addFirst(schema.getColumns(), column);						
					else
						Lists.qINSTANCE.addAfter(schema.getColumns(), currentColumn, column);
					currentColumn = column;
				}
			}
		}
		
		if(schema != null)	
			resourceSerializer.add(schema);
			
		resourceSerializer.save(response.getOutputStream());

		response.flushBuffer();
		resourceSerializer.clear();
	}	
	
	private SchemaColumn buildColumn(Slot slot) {
		SchemaColumn column = (SchemaColumn) EcoreUtil.create(SchemaPackage.eINSTANCE.getSchemaColumn());
		column.setId(slot.getName());
		
		StringBuffer header = new StringBuffer();
		for(char c: slot.getName().toCharArray()) {			
			if(Character.isUpperCase(c) && header.length() != 0)
				header.append(" ");
			header.append(c);
		}
		column.setHeader(Strings.qINSTANCE.firstToUpper(header.toString()));
		column.setAdjust(true);
		return column;
	}
}