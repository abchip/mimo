/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.database.DatabaseManager;

public class BaseDatabaseActivator {

	@ComponentStarted
	public void start(DatabaseManager databaseManager) {		
		databaseManager.start();
	}	
}
