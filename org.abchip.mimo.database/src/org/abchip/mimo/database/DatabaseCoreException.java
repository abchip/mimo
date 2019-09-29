/**
 *  Copyright (c) 2017, 2019 ABChip and others. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http:/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database;

public class DatabaseCoreException extends Exception {

	private static final long serialVersionUID = 1L;

	public DatabaseCoreException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}

	public DatabaseCoreException(String message) {
		this(message, null);
	}

	public DatabaseCoreException(String message, Throwable cause) {
		super(message, cause);
	}
}
