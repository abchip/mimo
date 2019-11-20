/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.util.Strings;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class BaseEntityCommandProviderImpl extends BaseCommandProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _find(CommandInterpreter interpreter) throws Exception {

		try (Context context = this.createContext(null)) {

			String frameName = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());
			String order = interpreter.nextArgument();

			@SuppressWarnings("unchecked")
			Frame<E> frame = (Frame<E>) resourceManager.getFrame(context, frameName);
			if (frame == null)
				interpreter.print("Frame not found: " + frameName);

			for (E entity : resourceManager.getResourceReader(context, frame).find(null, null, order)) {
				System.out.println(entity.getID());
			}
		}
	}

	public <E extends EntityIdentifiable> void _lookup(CommandInterpreter interpreter) throws Exception {

		try (Context context = this.createContext(null)) {

			String frameName = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());
			@SuppressWarnings("unchecked")
			Frame<E> frame = (Frame<E>) resourceManager.getFrame(context, frameName);
			if (frame == null)
				interpreter.print("Frame not found: " + frameName);

			String entityName = interpreter.nextArgument();

			E entity = resourceManager.getResourceReader(context, frame).lookup(entityName);
			System.out.println(entity);
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
