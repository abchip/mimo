/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.cmd.BaseCommands;

public abstract class BaseTestCommands extends BaseCommands {

	@Inject
	private Application application;

	protected ContextProvider login() throws AuthenticationException {

		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");

		ContextProvider contextProvider = application.getContext().get(AuthenticationManager.class).login(null, authentication);

		return contextProvider;
	}
}