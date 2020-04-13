/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

public class AuthenticationException extends Exception {

	public AuthenticationException(String message) {
		super(message);
	}

	public AuthenticationException(Exception exception) {
		super(exception);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
