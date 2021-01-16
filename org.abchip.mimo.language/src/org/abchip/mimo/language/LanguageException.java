/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

public class LanguageException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanguageException(String message) {
		super(message);
	}

	public LanguageException(Exception exception) {
		super(exception);
	}
}
