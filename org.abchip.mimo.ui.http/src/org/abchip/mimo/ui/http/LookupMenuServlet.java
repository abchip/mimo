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
import java.util.UUID;
import java.util.function.Consumer;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.menu.Menu;
import org.abchip.mimo.ui.menu.MenuAction;
import org.abchip.mimo.ui.menu.MenuFactory;
import org.abchip.mimo.ui.menu.MenuGroup;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class LookupMenuServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");

		Menu menu = null;

		ResourceReader<Menu> menuReader = resourceManager.getResourceReader(context, Menu.class, Resource.TENANT_MASTER);
		if (name == null || name.isEmpty()) {
			menu = MenuFactory.eINSTANCE.createMenu();
			menu.setName("List Menu");

			try (EntityIterator<Menu> menus = menuReader.find()) {
				for (Menu elem : menus) {
					// build upper level group from menu
					MenuGroup group = MenuFactory.eINSTANCE.createMenuGroup();
					group.setId(UUID.randomUUID().toString());
					group.setValue(elem.getName());
					group.setIcon(elem.getIcon());
					group.getData().addAll(elem.getElements());

					// append to root
					menu.getElements().add(group);
				}
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

		ResourceSerializer<Menu> entitySerializer = resourceManager.createResourceSerializer(context, Menu.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		if (menu != null)
			entitySerializer.add(menu);
		entitySerializer.save(response.getOutputStream());
	}
}