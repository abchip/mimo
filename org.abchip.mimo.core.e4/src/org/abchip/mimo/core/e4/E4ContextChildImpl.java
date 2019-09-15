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
package org.abchip.mimo.core.e4;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class E4ContextChildImpl extends E4ContextImpl {

	private IEclipseContext eclipseContext;
	private Context contextParent;

	public E4ContextChildImpl(Context contextParent, IEclipseContext eclipseContext, ContextDescription contextDescription) {
		super(contextDescription);

		this.contextParent = contextParent;
		this.eclipseContext = eclipseContext;
	}

	@Override
	protected IEclipseContext getEclipseContext() {
		return eclipseContext;
	}

	@Override
	protected void removeEclipseContext() {
		this.eclipseContext = null;
	}

	protected ContextRoot getContextRoot() {
		if (contextParent instanceof ContextRoot)
			return (ContextRoot) contextParent;
		else if (contextParent instanceof E4ContextChildImpl)
			return ((E4ContextChildImpl) contextParent).getContextRoot();
		else
			return null;
	}
}
