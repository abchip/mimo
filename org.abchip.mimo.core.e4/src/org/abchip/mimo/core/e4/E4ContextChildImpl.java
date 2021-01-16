/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import org.abchip.mimo.context.ContextDescription;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;

public class E4ContextChildImpl extends E4ContextImpl {

	private IEclipseContext eclipseContext;

	public E4ContextChildImpl(BundleContext bundleContext, ContextDescription contextDescription, IEclipseContext eclipseContext) {
		super(bundleContext, contextDescription);

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
}
