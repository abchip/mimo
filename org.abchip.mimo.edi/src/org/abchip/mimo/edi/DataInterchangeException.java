/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

public class DataInterchangeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataInterchangeException(String message) {
		super(message);
	}

	public DataInterchangeException(Exception exception) {
		super(exception);
	}
}
