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
package org.abchip.mimo.core.e4;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class E4ApplicationCommandProviderImpl implements CommandProvider {

	public void _mimo(CommandInterpreter interpreter) throws Exception {
		interpreter.println("Hello, world!");
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
