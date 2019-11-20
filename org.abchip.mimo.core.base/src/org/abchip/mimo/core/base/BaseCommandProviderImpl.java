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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class BaseCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;

	protected Context createContext(String tenantId) {

		ContextDescription contextDescription = ContextFactory.eINSTANCE.createContextDescription();
		contextDescription.setAnonymous(true);

		return contextRoot.createChildContext(contextDescription);
	}
}