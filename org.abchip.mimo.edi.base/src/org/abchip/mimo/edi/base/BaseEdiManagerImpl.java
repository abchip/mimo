/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.edi.base;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.edi.DataInterchangeException;
import org.abchip.mimo.edi.EdiManager;
import org.abchip.mimo.edi.Transmitter;
import org.abchip.mimo.edi.TransmitterRegistry;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageBody;
import org.abchip.mimo.edi.message.MessageFactory;
import org.abchip.mimo.edi.message.MessageSent;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;

public class BaseEdiManagerImpl implements EdiManager {

	@Inject
	private TransmitterRegistry transmitterRegistry;

	@Override
	public <E extends EntityIdentifiable> void writeMessage(Context context, E entity, EntityEvent event) throws DataInterchangeException {

		ContextDescription contextDescription = context.getContextDescription();

		try (EntityIterator<EdiFrameSetup> setups = context.getResourceManager().getResourceReader(EdiFrameSetup.class).find("frame='" + entity.isa().getName() + "'")) {
			ResourceWriter<MessageSent> messageSentWriter = context.getResourceManager().getResourceWriter(MessageSent.class);

			for (EdiFrameSetup setup : setups) {

				// TODO remove me
				if (!entity.isa().getName().equals(setup.getFrame()))
					continue;

				switch (setup.getEntityEvent()) {
				case ALL:
					break;
				case CREATE:
				case DELETE:
				case UPDATE:
					if (setup.getEntityEvent() != event)
						continue;
					break;
				}

				MessageSent messageSent = messageSentWriter.make(true);

				messageSent.setMessageType(setup.getMessageType());
				messageSent.setSender(contextDescription.getUser());
				messageSent.setFrameId(entity.isa().getName());
				messageSent.setEntityId(entity.getID());
				messageSent.setEvent(event);
				messageSent.setStatus(MessageStatus.READY);

				MessageBody body = MessageFactory.eINSTANCE.createMessageBody();
				body.getContents().add(entity);
				messageSent.setBody(body);

				messageSentWriter.create(messageSent);

				if (messageSent.getMessageType().isTransmissionOnWrite())
					transmitMessage(context, messageSent);
			}
		} catch (ResourceException e) {
			throw new DataInterchangeException(e);
		}
	}

	@Override
	public void transmitMessage(Context context, Message message) throws DataInterchangeException {

		String provider = message.getMessageType().getTransmissionType().getProvider();
		Transmitter transmitter = transmitterRegistry.lookup(provider);
		if (transmitter == null)
			throw new DataInterchangeException("Transmitter " + provider + " not found");
		
		transmitter.transmitMessage(context, message);
	}
}
