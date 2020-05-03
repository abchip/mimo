/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.context.Context;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class BaseCommands implements CommandProvider {

	protected static final String NULL = "@NULL";

	private Application application;
	private ThreadLocal<Context> threadLocalContext = new ThreadLocal<Context>();

	public BaseCommands(Application application) {
		this.application = application;
	}

	protected String nextArgument(CommandInterpreter interpreter) {
		return this.nextArgument(interpreter, null);
	}

	protected String nextArgument(CommandInterpreter interpreter, String default_) {

		String argument = interpreter.nextArgument();

		// default
		if (argument == null)
			argument = default_;

		// @NULL
		if (argument != null && argument.equals(NULL))
			argument = null;

		return argument;
	}

	protected Context getContext() {

		Context context = threadLocalContext.get();
		if (context != null)
			return context;

		if (application.getAdminKey() == null)
			try {
				return login(null);
			} catch (AuthenticationException e) {
				throw new RuntimeException(e);
			}

		throw new RuntimeException("You need a login, please use first command 'login'");
	}

	protected Context login(String adminKey) throws AuthenticationException {

		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);
		if (authenticationManager == null)
			return null;

		AuthenticationAdminKey authAdminKey = AuthenticationFactory.eINSTANCE.createAuthenticationAdminKey();
		authAdminKey.setAdminKey(adminKey);

		@SuppressWarnings("resource")
		Context context = authenticationManager.login(null, authAdminKey).get();

		threadLocalContext.set(context);

		return context;
	}

	protected void logout() {
		this.getContext().dispose();
	}
}