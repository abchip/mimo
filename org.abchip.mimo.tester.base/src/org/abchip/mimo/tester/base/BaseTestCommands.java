/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public abstract class BaseTestCommands extends BaseCommands {

	public BaseTestCommands(Application application) {
		super(application);
	}

	protected ContextProvider login(CommandInterpreter interpreter) throws AuthenticationException {

		Context context = this.getContext(interpreter);

		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");

		ContextProvider contextProvider = context.get(AuthenticationManager.class).login(null, authentication);

		return contextProvider;
	}
}