/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import java.lang.reflect.Field;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.context.Context;
import org.apache.felix.service.command.CommandSession;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class BaseCommands implements CommandProvider {

	private static final String NULL = "@NULL";
	private static final String MIMO_CONTEXT = "mimo.context";
	private Application application;

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

	@SuppressWarnings("resource")
	protected Context getContext(CommandInterpreter interpreter) {

		try {
			Field field = interpreter.getClass().getDeclaredField("commandSession");
			field.setAccessible(true);
			CommandSession commandSession = (CommandSession) field.get(interpreter);

			Context context = (Context) commandSession.get(MIMO_CONTEXT);
			if (context != null)
				return context;

			if (application.getAdminKey() == null) {
				context = login(null);
				commandSession.put(MIMO_CONTEXT, context);
				return context;
			}
		} catch (Exception e) {
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

		return context;
	}

	protected void logout(CommandInterpreter interpreter) {
		this.getContext(interpreter).dispose();
	}
}