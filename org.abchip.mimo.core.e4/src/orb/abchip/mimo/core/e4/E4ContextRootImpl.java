/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package orb.abchip.mimo.core.e4;

import java.util.Dictionary;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;

public class E4ContextRootImpl extends E4ContextImpl implements ContextRoot {

	private IEclipseContext eclipseContext;

	public E4ContextRootImpl(BundleContext bundleContext, String contextID, ContextDescription contextDescription) {
		super(bundleContext, contextID, contextDescription);

		this.eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);

		initializeContext(this.eclipseContext);
	}

	@Override
	public IEclipseContext getEclipseContext() {
		return eclipseContext;
	}
	
	@Override
	void removeEclipseContext() {
		this.eclipseContext = null;
	}

	@Override
	public Context getContext() {
		return this;
	}

	@Override
	public void set(String name, Object object, Dictionary<String, ?> dictionary) {
		getBundleContext().registerService(name, object, dictionary);
	}
}