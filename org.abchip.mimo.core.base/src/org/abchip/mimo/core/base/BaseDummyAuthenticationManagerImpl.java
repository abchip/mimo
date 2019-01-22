/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import java.security.Principal;

import javax.management.remote.JMXPrincipal;

import org.abchip.mimo.context.Authentication;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Identity;
import org.abchip.mimo.context.impl.IdentityImpl;

public class BaseDummyAuthenticationManagerImpl implements AuthenticationManager {

	@Override
	public Identity<Authentication> authenticate(Authentication authentication) {

		if (authentication instanceof AuthenticationUserPassword) {
			AuthenticationUserPassword authenticationUserPassword = (AuthenticationUserPassword) authentication;

			Principal principal = new JMXPrincipal(authenticationUserPassword.getUser());
			return new IdentityImpl<Authentication>(principal);
		} else
			return null;
	}
}
