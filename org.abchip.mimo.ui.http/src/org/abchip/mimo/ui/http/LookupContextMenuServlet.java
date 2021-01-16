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
import java.util.UUID;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
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

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		if (frameName == null)
			return;

		Frame<?> frame = context.getResourceManager().getFrame(frameName);
		if (frame == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		ContextMenu contextMenu = null;

		try {
			Application application = context.get(Application.class);
			ResourceReader<ContextMenu> contextMenuReader = application.getContext().getResourceManager().getResourceReader(ContextMenu.class);
			contextMenu = contextMenuReader.lookup(frameName);
			if (contextMenu == null) {
				contextMenu = MenuFactory.eINSTANCE.createContextMenu();
				contextMenu.setName(frameName);
			}

			if (contextMenu.getIcon() == null)
				contextMenu.setIcon(getIcon(application.getContext(), frameName));

			for (Frame<?> ako : frame.getSuperFrames()) {
				ContextMenu contextMenuAko = contextMenuReader.lookup(ako.getName());
				if (contextMenuAko == null)
					continue;

				if (contextMenu == null)
					contextMenu = contextMenuAko;
				else
					contextMenu.getElements().addAll(contextMenuAko.getElements());
			}
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}

		// routes
		MenuGroup groupRoutes = MenuFactory.eINSTANCE.createMenuGroup();
		groupRoutes.setValue("Routes");
		for (Slot slot : frame.getSlots()) {
			// if (!slot.isRoute())
			// continue;

			MenuAction routeAction = MenuFactory.eINSTANCE.createMenuAction();
			routeAction.setValue(slot.getText());
			groupRoutes.getData().add(routeAction);
		}

		if (!groupRoutes.getData().isEmpty())
			contextMenu.getElements().add(groupRoutes);

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

		response.setStatus(HttpServletResponse.SC_OK);
		ResourceSerializer<ContextMenu> entitySerializer = context.getResourceManager().createResourceSerializer(ContextMenu.class, SerializationType.MIMO);
		entitySerializer.add(contextMenu);
		entitySerializer.save(response.getOutputStream());
	}

	private String getIcon(Context context, String frameName) throws ResourceException {

		Frame<?> frame = context.getResourceManager().getFrame(frameName);
		if (frame == null)
			return null;

		String icon = null;
		ResourceReader<UiFrameSetup> frameSetupReader = context.getResourceManager().getResourceReader(UiFrameSetup.class);

		List<String> frameNames = new ArrayList<String>(frame.getSuperNames());
		Lists.addFirst(frameNames, frameName);

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