/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

public class ResourceException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceException(String message) {
		super(message);
	}

	public ResourceException(Exception exception) {
		super(exception);
	}
}
