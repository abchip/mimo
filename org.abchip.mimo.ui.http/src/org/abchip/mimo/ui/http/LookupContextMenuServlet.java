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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.menu.ContextMenu;
import org.abchip.mimo.ui.menu.MenuAction;
import org.abchip.mimo.ui.menu.MenuFactory;
import org.abchip.mimo.ui.menu.MenuGroup;
import org.abchip.mimo.util.Lists;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class LookupContextMenuServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		if (frameName == null)
			return;

		Frame<?> frame = resourceManager.getFrame(context, frameName);
		if (frame == null)
			return;

		ContextMenu contextMenu = resourceManager.getResourceReader(context, ContextMenu.class, Resource.TENANT_MASTER).lookup(frameName);
		if (contextMenu == null) {
			contextMenu = MenuFactory.eINSTANCE.createContextMenu();
			contextMenu.setName(frameName);
		}

		if (contextMenu.getIcon() == null)
			contextMenu.setIcon(getIcon(context, frameName));

		/*
		 * ContextMenu contextMenuFrame = resourceManager.getEntityReader(contextRoot,
		 * ContextMenu.class, ResourceScope.CONTEXT).lookup("Frame"); if
		 * (contextMenuFrame != null) {
		 * 
		 * MenuGroup groupFrame = MenuFactory.eINSTANCE.createMenuGroup();
		 * groupFrame.setValue(frame.getName());
		 * groupFrame.getData().addAll(contextMenuFrame.getElements());
		 * groupFrame.setIcon(getIcon("Frame"));
		 * 
		 * Lists.qINSTANCE.addFirst(contextMenu.getElements(), groupFrame); }
		 */

		for (Frame<?> ako : frame.getSuperFrames()) {
			ContextMenu contextMenuAko = resourceManager.getResourceReader(context, ContextMenu.class, Resource.TENANT_MASTER).lookup(ako.getName());
			if (contextMenuAko == null)
				continue;

			if (contextMenu == null)
				contextMenu = contextMenuAko;
			else
				contextMenu.getElements().addAll(contextMenuAko.getElements());
		}

		// routes
		MenuGroup groupRoutes = MenuFactory.eINSTANCE.createMenuGroup();
		groupRoutes.setValue("Routes");
		for (Slot slot : frame.getSlots()) {
//			if (!slot.isRoute())
//				continue;

			MenuAction routeAction = MenuFactory.eINSTANCE.createMenuAction();
			routeAction.setValue(slot.getText());
			groupRoutes.getData().add(routeAction);
		}

		if (!groupRoutes.getData().isEmpty())
			contextMenu.getElements().add(groupRoutes);

		ResourceSerializer<ContextMenu> entitySerializer = resourceManager.createResourceSerializer(context, ContextMenu.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		TreeIterator<EObject> features = ((EObject) contextMenu).eAllContents();

		features.forEachRemaining(new Consumer<EObject>() {

			@Override
			public void accept(EObject element) {
				if (element instanceof MenuGroup) {
					MenuGroup menuGroup = (MenuGroup) element;
					if (menuGroup.getId() == null || menuGroup.getId().trim().isEmpty()) {
						menuGroup.setId(UUID.randomUUID().toString());
					}
				} else if (element instanceof MenuAction) {
					MenuAction menuAction = (MenuAction) element;
					if (menuAction.getFilter() != null)
						menuAction.setFilter(menuAction.getFilter().replaceAll("=", "%3D"));
					if (menuAction.getId() == null || menuAction.getId().trim().isEmpty()) {
						menuAction.setId(menuAction.getAction() + "&r=" + UUID.randomUUID().toString());
					}
				}
			}
		});

		entitySerializer.add(contextMenu);
		entitySerializer.save(response.getOutputStream());
	}

	private String getIcon(Context context, String frameName) {

		Frame<?> frame = resourceManager.getFrame(context, frameName);
		if (frame == null)
			return null;

		String icon = null;
		ResourceReader<UiFrameSetup> frameSetupReader = resourceManager.getResourceReader(context, UiFrameSetup.class, Resource.TENANT_MASTER);

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.qINSTANCE.addFirst(frameNames, frameName);

		for (String domainName : frameNames) {
			UiFrameSetup frameSetup = frameSetupReader.lookup(domainName);
			if (frameSetup == null)
				continue;

			icon = frameSetup.getIcon();
			if (icon != null)
				break;
		}

		return icon;
	}
}