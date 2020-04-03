/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class BaseCommandProviderImpl implements CommandProvider {

	protected static final String NULL = "@NULL";

	@Inject
	private Application application;

	private ThreadLocal<Context> threadLocalContext = new ThreadLocal<Context>();

	protected String nextArgument(CommandInterpreter interpreter) {

		String argument = interpreter.nextArgument();
		if (argument != null && argument.equals(NULL))
			argument = null;

		return argument;
	}

	protected Context getContext() {

		Context context = threadLocalContext.get();
		if (context != null)
			return context;

		if (application.getAdminKey() == null)
			return login(null);

		throw new RuntimeException("You need a login, please use first command 'login'");
	}

	protected Context login(String adminKey) {

		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);
		if (authenticationManager == null)
			return null;

		AuthenticationAdminKey authAdminKey = ContextFactory.eINSTANCE.createAuthenticationAdminKey();
		authAdminKey.setAdminKey(adminKey);

		@SuppressWarnings("resource")
		Context context = authenticationManager.login(null, authAdminKey).get();

		threadLocalContext.set(context);

		return context;
	}
}