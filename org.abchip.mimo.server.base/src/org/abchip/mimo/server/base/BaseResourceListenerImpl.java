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
package org.abchip.mimo.server.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceEvent;
import org.abchip.mimo.entity.ResourceEventType;
import org.abchip.mimo.entity.ResourceListener;
import org.abchip.mimo.entity.ResourceManager;

public class BaseResourceListenerImpl implements ResourceListener<Resource> {

	@Inject
	private ResourceManager resourceManager;

	@PostConstruct
	public void init() {
		resourceManager.registerListener(Resource.class, this);
	}

	@Override
	public void handleEvent(ResourceEvent<Resource> event) {

		if (event.getEventType() != ResourceEventType.PRESAVE && event.getEventType() != ResourceEventType.PREDLT)
			return;

		switch (event.getEventType()) {
		case PRESAVE:
			break;
		case PREDLT:
			break;
		default:
			break;
		}
	}
}
