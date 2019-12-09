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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class BaseCommandProviderImpl implements CommandProvider {

	@Inject
	private Application application;

	private ThreadLocal<Context> threadLocalContext = new ThreadLocal<Context>();

	@SuppressWarnings("resource")
	protected void login(String user, String password) {

		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);
		if(authenticationManager == null)
			return;
			
		AuthenticationUserPassword userPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		userPassword.setUser(user);
		userPassword.setPassword(password);

		Context context = authenticationManager.login(null, userPassword);
		if (context == null)
			return;

		threadLocalContext.set(context);
	}

	protected Context getContext() {

		Context context = threadLocalContext.get();
		if (context == null)
			throw new RuntimeException("You need a login, please use command 'login' before execute any command");

		return context;
	}
}