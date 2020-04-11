/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.util.Strings;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class EntityCommands extends BaseCommands {

	@Inject
	private ResourceManager resourceManager;

	public void _login(CommandInterpreter interpreter) throws Exception {
		this.login(nextArgument(interpreter));
	}

	public void _logout(CommandInterpreter interpreter) throws Exception {
		this.logout();

		interpreter.execute("disconnect");
	}

	public <E extends EntityIdentifiable> void _find(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String frameName = nextArgument(interpreter);
		String order = nextArgument(interpreter);
		String tenant = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) resourceManager.getFrame(context, frameName, tenant);
		if (frame == null) {
			interpreter.println("Frame not found: " + frameName + " on tenant " + tenant);
			return;
		}

		while (true) {
			try (EntityIterator<E> entities = resourceManager.getResourceReader(context, frame, tenant).find(null, null, order)) {
				for (E entity : entities) {
					interpreter.println(entity.getID());
				}
			}
		}
	}

	public <E extends EntityIdentifiable> void _lookup(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String frameName = Strings.firstToUpper(nextArgument(interpreter));
		String tenant = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) resourceManager.getFrame(context, frameName, tenant);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName + " on tenant " + tenant);

		String entityName = nextArgument(interpreter);

		E entity = resourceManager.getResourceReader(context, frame, tenant).lookup(entityName);
		interpreter.println(entity);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
