/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.service.ServiceManager;

public class BaseServiceManagerFactoryImpl implements Factory<ServiceManager> {

	@Override
	public ServiceManager create(Context context) {
		return new BaseServiceManagerImpl(context);
	}

	@Override
	public Class<ServiceManager> getInterfaceClass() {
		return ServiceManager.class;
	}
}
