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
import java.util.UUID;
import java.util.function.Consumer;

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
import org.abchip.mimo.ui.menu.ContextMenu;
import org.abchip.mimo.ui.menu.MenuAction;
import org.abchip.mimo.ui.menu.MenuGroup;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class LookupContextMenuServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String frameName = request.getParameter("frame");
		if(frameName == null)
			return ;
		
		Frame<?> frame = frameManager.getFrame(frameName);
		if(frame == null)
			return;
		
		ContextMenu contextMenu = resourceManager.getEntityReader(contextRoot, ContextMenu.class, ResourceScope.CTX).lookup(frameName);
		
		for(Frame<?> ako: frame.getSuperFrames()) {
			ContextMenu contextMenuAko = resourceManager.getEntityReader(contextRoot, ContextMenu.class, ResourceScope.CTX).lookup(ako.getName());;
			if(contextMenuAko == null)
				continue;
			
			if(contextMenu == null)
				contextMenu = contextMenuAko;
			else 
				contextMenu.getElements().addAll(contextMenuAko.getElements());
		}

		ResourceSerializer<ContextMenu> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, ContextMenu.class, SerializationType.JSON);
		if(contextMenu != null) {
			
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

			resourceSerializer.add(contextMenu);
		}

		resourceSerializer.save(response.getOutputStream());
		resourceSerializer.close();

		response.flushBuffer();		
	}	
}