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
import org.abchip.mimo.ui.UIFactory;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.Widget;
import org.abchip.mimo.ui.schema.Schema;
import org.abchip.mimo.ui.schema.SchemaColumn;
import org.abchip.mimo.ui.schema.SchemaFactory;
import org.abchip.mimo.util.Lists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LookupSchemaServlet extends BaseServlet {

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

		Schema schema = resourceManager.getResourceReader(context, Schema.class, Resource.TENANT_MASTER).lookup(name);

		if (schema == null && prototype != null && prototype.equalsIgnoreCase(Boolean.TRUE.toString())) {
			schema = SchemaFactory.eINSTANCE.createSchema();
			schema.setName("prototype");

			SchemaColumn currentColumn = null;
			SchemaColumn currentKey = null;
			for (Slot slot : frame.getSlots()) {

				// if (slot.isRoute())
				// continue;

				SchemaColumn column = buildColumn(slot);

				// field id
				if (slot.isKey()) {

					if (currentKey == null)
						Lists.qINSTANCE.addFirst(schema.getColumns(), column);
					else
						Lists.qINSTANCE.addAfter(schema.getColumns(), currentKey, column);

					if (currentColumn == null || currentColumn.equals(currentKey))
						currentColumn = column;

					currentKey = column;
				} else if (slot.getName().startsWith("created"))
					Lists.qINSTANCE.addLast(schema.getColumns(), column);
				else if (slot.getName().startsWith("lastUpdated"))
					Lists.qINSTANCE.addLast(schema.getColumns(), column);
				else {
					if (currentColumn == null)
						Lists.qINSTANCE.addFirst(schema.getColumns(), column);
					else
						Lists.qINSTANCE.addAfter(schema.getColumns(), currentColumn, column);
					currentColumn = column;
				}
			}
		}

		ResourceSerializer<Schema> entitySerializer = resourceManager.createResourceSerializer(context, Schema.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		if (schema != null) {
			completeSchema(context, schema);
			entitySerializer.add(schema);
		}
		entitySerializer.save(response.getOutputStream());
	}

	private SchemaColumn buildColumn(Slot slot) {

		SchemaColumn column = SchemaFactory.eINSTANCE.createSchemaColumn();
		column.setId(slot.getName());
		column.setHeader(slot.getText());
		column.setAdjust(true);
		column.setLeftSplit(slot.isKey());
		column.setGroup(slot.getGroup());
		if (slot.getDomain() != null)
			column.setDomain((Domain) EcoreUtil.copy((EObject) slot.getDomain()));

		// view
		Widget widget = null;
		switch (slot.getDataType()) {
		case STRING:
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		case ENTITY:
			column.setSort("string");
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		case ENUM:
			column.setSort("string");
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		case BOOLEAN:
			widget = UIFactory.eINSTANCE.createWidgetCheckBox();
			break;
		case BINARY:
			break;
		case DATE_TIME:
			column.setSort("raw");
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		case IDENTITY:
			column.setSort("int");
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		case NUMERIC:
			column.setSort("int");
			widget = UIFactory.eINSTANCE.createWidgetText();
			break;
		}

		column.setWidget(widget);
		
		return column;
	}

	private void completeSchema(Context context, Schema schema) {
		for (SchemaColumn column : schema.getColumns())
			completeSchemaColumn(context, column);
	}

	private void completeSchemaColumn(Context context, SchemaColumn column) {

		Domain domain = column.getDomain();

		if (domain == null)
			return;

		ResourceReader<UiFrameSetup> frameSetupReader = resourceManager.getResourceReader(context, UiFrameSetup.class, Resource.TENANT_MASTER);

		Frame<?> frame = resourceManager.getFrame(context, domain.getFrame());
		if (frame == null)
			return;

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.qINSTANCE.addFirst(frameNames, domain.getFrame());

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