/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.base;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.Textable;
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

	public <E extends EntityNameable>void _find(CommandInterpreter interpreter) throws Exception {

		String frameName = Strings.qINSTANCE.firstToUpper(interpreter.nextArgument());
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextRoot).lookup(frameName);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName);
		
		for(E entity: resourceManager.getEntityReader(contextRoot, frame, ResourceScope.CONTEXT).find(null)) {
			StringBuffer sb = new StringBuffer();
			sb.append(entity.isa().getName());
			sb.append(" (");
			sb.append(entity.getName());
			if(entity instanceof Textable) {
				sb.append(" (");
				sb.append(((Textable) entity).getText());
				sb.append(")");
			}				
			sb.append(")");
			System.out.println(sb.toString());
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
