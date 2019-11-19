/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.logic.gnu;

import java.io.IOException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.logic.MindManager;
import org.abchip.mimo.logic.Reasoner;
import org.abchip.mimo.logic.Theory;

public class GNUMindManagerImpl implements MindManager {

	@Override
	public <E extends Entity> Theory buildTheory(Context context, Frame<E> frame) {
		return GNUTheoryBuilder.buildTheory(frame);
	}

	@Override
	public Reasoner createReasoner(Context context) {
		
		Reasoner reasoner = new GNUReasonerImpl(context);
		try {
			reasoner.reload();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reasoner;
	}
}
