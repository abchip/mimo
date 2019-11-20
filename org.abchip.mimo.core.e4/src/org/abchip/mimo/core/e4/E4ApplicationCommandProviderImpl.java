/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class E4ApplicationCommandProviderImpl extends BaseCommandProviderImpl {

	public void _mimo(CommandInterpreter interpreter) throws Exception {
		interpreter.println("Hello, world!");
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
