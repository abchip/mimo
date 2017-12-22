/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.logic.gnu;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.logic.MindManager;
import org.abchip.mimo.logic.Reasoner;
import org.abchip.mimo.logic.Theory;

public class GNUMindManagerImpl implements MindManager {

	@Override
	public <E extends Entity> Theory buildTheory(ContextProvider contextProvider, Frame<E> frame) {
		return GNUTheoryBuilder.buildTheory(frame);
	}

	@Override
	public Reasoner createReasoner(ContextProvider contextProvider) {
		
		Reasoner reasoner = new GNUReasonerImpl(contextProvider);
		reasoner.reload();
		
		return reasoner;
	}
}
