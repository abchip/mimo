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

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.util.Strings;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class BaseEntityCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManger;
	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityNameable> void _find(CommandInterpreter interpreter) throws Exception {

		String frameName = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextRoot).lookup(frameName);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName);

		for (E entity : resourceManager.getEntityReader(contextRoot, frame).find())
			System.out.println(entity);
	}

	public <E extends EntityNameable> void _lookup(CommandInterpreter interpreter) throws Exception {

		String frameName = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextRoot).lookup(frameName);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName);

		String entityName = interpreter.nextArgument();

		E entity = resourceManager.getEntityReader(contextRoot, frame).lookup(entityName);
		System.out.println(entity);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
