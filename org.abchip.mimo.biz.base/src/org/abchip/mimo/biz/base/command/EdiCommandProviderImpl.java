/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.command;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.MessageSent;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class EdiCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;

	public void _testEdi(CommandInterpreter interpreter) throws Exception {

		Frame<MessageSent> messageSentFrame = frameManager.getFrame(MessageSent.class);

		EntityWriter<MessageSent> messageSentWriter = resourceManager.getEntityWriter(contextRoot, messageSentFrame);
		MessageSent messageSent = frameManager.createEntity(messageSentFrame);
		messageSent.setMessageId("test-010");
		messageSent.setEvent(EntityEvent.CREATE);
		messageSent.setFrame("Party");
		messageSent.setMessageType("T10");
		messageSent.setSender("10000");
		messageSent.setStatus(MessageStatus.TRASMITTED);
		messageSentWriter.create(messageSent);

		if (messageSentWriter.lookup(messageSent.getMessageId()) != null) {
			System.out.println(messageSent);
			messageSentWriter.delete(messageSent);
			if (messageSentWriter.lookup(messageSent.getMessageId()) != null)
				System.err.println("MessageSent not deleted");
		} else
			System.err.println("MessageSent not found");

		try (EntityIterator<MessageSent> messageIterator = messageSentWriter.find(null, null, 0)) {
			for (MessageSent messageSent2 : messageIterator) {
				System.out.println(messageSent2);
			}
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}