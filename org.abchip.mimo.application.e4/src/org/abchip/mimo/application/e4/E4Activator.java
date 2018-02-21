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
package org.abchip.mimo.application.e4;

import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.base.BaseApplicationManagerImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class E4Activator implements BundleActivator {

	private ServiceRegistration<ApplicationManager> applicationManagerRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		this.applicationManagerRegistration = context.registerService(ApplicationManager.class, new BaseApplicationManagerImpl(), null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());
	}

}
