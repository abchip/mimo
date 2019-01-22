/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.abchip.mimo.core.base;

import java.util.regex.Matcher;

import javax.inject.Inject;
import javax.inject.Named;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ExceptionManager;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.context.MessageException;
import org.abchip.mimo.context.MessageFile;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceScope;

public class BaseExceptionManagerImpl implements ExceptionManager {

	@Inject
	private ResourceManager resourceManager;

	@Override
	public <E extends Enum<E>> MessageException prepareException(ContextProvider contextProvider, Enum<E> message) {
		return prepareException(contextProvider, message, null);
	}

	@Override
	public <E extends Enum<E>> MessageException prepareException(ContextProvider contextProvider, Enum<E> message, Object variable) {
		if (variable == null)
			return prepareException(contextProvider, message, null);
		else
			return prepareException(contextProvider, message, new Object[] { variable });
	}

	@Override
	public MessageException prepareException(ContextProvider contextProvider, String messageName, String messageFileName, String messageFileLib, Object[] variables) {
		MessageDescription messageDescription = findMessageDescription(contextProvider, messageName, messageFileName, reader(contextProvider, messageFileLib));

		String messageText = "Invalid message file: " + messageFileName;
		String name = messageFileName.toString();
		int severity = -1;

		if (messageDescription != null) {
			messageText = messageDescription.getMessageText();
			name = messageDescription.getName();
			severity = messageDescription.getSeverity();
		}

		for (int i = 0; i < variables.length; i++)
			messageText = messageText.replaceFirst("&" + (i + 1), Matcher.quoteReplacement("" + variables[i]));

		MessageException messageException = new MessageException(name, messageText, severity);

		return messageException;
	}

	private EntityReader<MessageFile> reader(ContextProvider contextProvider, String messageFileLib) {
		try {
			ResourceScope resourceScope = ResourceScope.get(messageFileLib);
			return resourceManager.getEntityReader(contextProvider, MessageFile.class, resourceScope);
		} catch (Exception e) {
			return resourceManager.getEntityReader(contextProvider, MessageFile.class, messageFileLib);
		}
	}

	@Override
	public <E extends Enum<E>> MessageException prepareException(ContextProvider contextProvider, Enum<E> message, Object[] variables) {

		if (variables == null)
			variables = new Object[] {};

		String messageFileName = null;
		if (message.getClass().getAnnotation(Named.class) != null)
			messageFileName = message.getClass().getAnnotation(Named.class).value();
		else
			messageFileName = message.getClass().getSimpleName();

		String messageName = message.name();

		return prepareException(contextProvider, messageName, messageFileName, "*LIBL", variables);
	}

	private MessageDescription findMessageDescription(ContextProvider contextProvider, String messageName, String messageFileName, EntityReader<MessageFile> messageFileReader) {

		MessageFile messageFile = messageFileReader.lookup(messageFileName);

		MessageDescription messageDescription = null;
		if (messageFile != null)
			messageDescription = messageFile.lookup(messageName);

		return messageDescription;
	}
}