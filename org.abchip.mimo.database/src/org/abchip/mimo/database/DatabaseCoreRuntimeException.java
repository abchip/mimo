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
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.database;

public class DatabaseCoreRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DatabaseCoreRuntimeException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}

	public DatabaseCoreRuntimeException(String message) {
		this(message, null);
	}

	public DatabaseCoreRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
