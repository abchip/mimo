/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import java.util.Date;

public class ServerHelper {


	public static boolean isStartable(System system) {

		boolean startable = false;

		// check system status
		switch (system.getStatus()) {
		case STOPPED:
			startable = true;
			break;
		case STARTED:
			break;
		case ACTIVATING:
			break;
		case ENDING:
			break;
		default:
			break;
		}

		return startable;
	}

	public static boolean isStoppable(System system) {

		boolean stoppable = false;

		// check system status
		switch (system.getStatus()) {
		case STOPPED:
			break;
		case STARTED:
			stoppable = true;
			break;
		case ACTIVATING:
			break;
		case ENDING:
			break;
		default:
			break;
		}

		return stoppable;
	}

	public static Date now() {
		return new Date();
	}
}
