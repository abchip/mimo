/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.edi.base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.edi.DataInterchangeException;
import org.abchip.mimo.edi.EdiManager;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.MessageSent;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

public class BaseEdiManagerImpl implements EdiManager {

	@Override
	public <E extends EntityIdentifiable> void writeMessage(Context context, E entity, EntityEvent event) throws DataInterchangeException {

		ContextDescription contextDescription = context.getContextDescription();

		ResourceSerializer<E> entitySerializer = context.getResourceManager().createResourceSerializer(entity.isa(), SerializationType.MIMO);

		try (EntityIterator<EdiFrameSetup> setups = context.getResourceManager().getResourceReader(EdiFrameSetup.class).find("frame='" + entity.isa().getName() + "'")) {
			ResourceWriter<MessageSent> messageSentWriter = context.getResourceManager().getResourceWriter(MessageSent.class);

			for (EdiFrameSetup setup : setups) {

				// TODO removeme
				if(!entity.isa().getName().equals(setup.getFrame()))
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
				entitySerializer.add(entity);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try {
					entitySerializer.save(baos);
				} catch (IOException e) {
					messageSent.setStatus(MessageStatus.ERROR);
				}
				messageSent.setBody(baos.toString());
				entitySerializer.clear();
				messageSentWriter.create(messageSent);
			}
		} catch (ResourceException e) {
			throw new DataInterchangeException(e);
		}
	}
}
