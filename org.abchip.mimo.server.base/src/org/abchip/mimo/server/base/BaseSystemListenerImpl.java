/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.server.SystemEvent;
import org.abchip.mimo.server.SystemListener;
import org.abchip.mimo.server.SystemManager;

public class BaseSystemListenerImpl implements SystemListener {

	@Inject
	private SystemManager systemManager;
	
	@PostConstruct
	public void init() {
		systemManager.registerListener(this);
	}

	@Override
	public void handleEvent(SystemEvent event) {

		switch (event.getType()) {
		case STARTED:
			break;
		case STARTING:
			break;
		case STATUS_CHANGED:
			break;
		case STOPPED:
			break;
		case STOPPING:
			break;
		}

	}
}
