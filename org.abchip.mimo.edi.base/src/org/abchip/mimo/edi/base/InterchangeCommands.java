/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.edi.base;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.MessageFactory;
import org.abchip.mimo.edi.message.MessageSent;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class InterchangeCommands extends BaseCommands {

	public void _testEdi(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		ResourceWriter<MessageSent> messageSentWriter = context.getResourceManager().getResourceWriter(MessageSent.class);
		MessageSent messageSent = MessageFactory.eINSTANCE.createMessageSent();
		messageSent.setMessageId("test-010");
		messageSent.setEvent(EntityEvent.CREATE);
		messageSent.setFrame("Party");
		messageSent.setMessageType("T10");
		messageSent.setSender("10000");
		messageSent.setStatus(MessageStatus.TRASMITTED);
		messageSentWriter.create(messageSent);

		if (messageSentWriter.lookup(messageSent.getMessageId(), true) != null) {
			System.out.println(messageSent);
			messageSentWriter.delete(messageSent);
			if (messageSentWriter.lookup(messageSent.getMessageId(), true) != null)
				interpreter.println("MessageSent not deleted");
		} else
			interpreter.println("MessageSent not found");
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
