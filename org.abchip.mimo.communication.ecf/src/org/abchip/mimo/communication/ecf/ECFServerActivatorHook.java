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
package org.abchip.mimo.communication.ecf;

import java.net.UnknownHostException;
import java.util.Dictionary;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.abchip.mimo.application.ServiceRegistering;
import org.eclipse.ecf.osgi.services.distribution.IDistributionConstants;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;


@SuppressWarnings("restriction")
public class ECFServerActivatorHook {
	
	@PostConstruct
	private void init() {
		Bundle bundle = FrameworkUtil.getBundle(IDistributionConstants.class);
		try {
			bundle.start();
		} catch (BundleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ServiceRegistering
	public void completeRegistration(@Named("org.abchip.mimo.application.service.name") String name, 
									 @Named("org.abchip.mimo.application.service.object") Object service,
									 @Named("org.abchip.mimo.application.service.properties") Dictionary<String, Object> properties, 
									 @Named("org.abchip.mimo.application.service.remoteExport") boolean remoteExport) throws UnknownHostException {

		if (remoteExport) {
			properties.put(IDistributionConstants.SERVICE_EXPORTED_INTERFACES, IDistributionConstants.SERVICE_EXPORTED_INTERFACES_WILDCARD);
			properties.put(IDistributionConstants.SERVICE_EXPORTED_CONFIGS, "ecf.generic.server");			
			properties.put(IDistributionConstants.SERVICE_EXPORTED_CONTAINER_FACTORY_ARGUMENTS, "ecftcp://localhost:30001/server");				
		}
	}
}
