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

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.ui.menu.Menu;
import org.abchip.mimo.ui.menu.MenuAction;
import org.abchip.mimo.ui.menu.MenuGroup;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class LookupMenuServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private FrameManager frameManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");

		Menu menu = null;
		EntityReader<Menu> menuReader = resourceManager.getEntityReader(contextProvider, Menu.class);

		if (name == null || name.isEmpty()) {
			menu = frameManager.createEntity(Menu.class);
			menu.setName("List Menu");

			for (Menu elem : menuReader.find(null)) {
				// build upper level group from menu
				MenuGroup group = frameManager.createEntity(MenuGroup.class);
				group.setId(UUID.randomUUID().toString());
				group.setValue(elem.getName());
				group.setIcon(elem.getIcon());
				group.getData().addAll(elem.getElements());

				// append to root
				menu.getElements().add(group);
			}
		} else {
			menu = menuReader.lookup(name);
		}

		if (menu != null) {
			TreeIterator<EObject> features = ((EObject) menu).eAllContents();

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
		}

		try (ResourceSerializer<Menu> resourceSerializer = resourceManager.createResourceSerializer(contextProvider, Menu.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION)) {
			if (menu != null)
				resourceSerializer.add(menu);

			resourceSerializer.save(response.getOutputStream());
		}

		response.flushBuffer();
	}
}