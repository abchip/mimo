/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.util.Strings;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ResourceCommands extends BaseCommands {

	@Inject
	public ResourceCommands(Application application) {
		super(application);
	}

	public <E extends EntityIdentifiable> void _find(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);

		String frameName = nextArgument(interpreter);
		String order = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) context.getResourceManager().getFrame(frameName);
		if (frame == null) {
			interpreter.println("Frame not found: " + frameName);
			return;
		}

		try (EntityIterator<E> entities = context.getResourceManager().getResourceReader(frame).find(null, null, order)) {
			for (E entity : entities) {
				interpreter.println(entity.getID());
			}
		}
	}

	public <E extends EntityIdentifiable> void _lookup(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);

		String frameName = Strings.firstToUpper(nextArgument(interpreter));

		String entityName = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) context.getResourceManager().getFrame(frameName);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName);

		E entity = context.getResourceManager().getResourceReader(frame).lookup(entityName);
		interpreter.println(entity);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
