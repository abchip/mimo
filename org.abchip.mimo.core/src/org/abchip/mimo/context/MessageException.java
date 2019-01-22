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
package org.abchip.mimo.context;

public class MessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String messageName;
	private String messageText;
	private int severity;

	public MessageException(String messageName, String messageText, int severity) {
		super(messageText);
		this.messageName = messageName;
		this.messageText = messageText;
		this.severity = severity;
	}

	public String getMessageName() {
		return messageName;
	}

	public String getMessageText() {
		return messageText;
	}

	public int getSeverity() {
		return severity;
	}

	@Override
	public String toString() {
		return messageName + " " + messageText;
	}
}
