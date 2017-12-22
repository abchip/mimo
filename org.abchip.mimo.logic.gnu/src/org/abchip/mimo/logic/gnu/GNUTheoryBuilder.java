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

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.logic.LogicFactory;
import org.abchip.mimo.logic.Term;
import org.abchip.mimo.logic.Theory;

public class GNUTheoryBuilder {

	public static <E extends Entity> Theory buildTheory(Frame<E> frame) {

		Theory theory = LogicFactory.eINSTANCE.createTheory();
		theory.getFacts().add(buildTerm(":- multifile(asup_frame/1)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_ako/2)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_slot/2)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_domain/3)."));

		theory.getFacts().add(buildTerm("asup_frame(" + frame.getName() + ")."));

		if (frame.ako() != null)
			theory.getFacts().add(buildTerm("asup_ako(" + frame.getName() + ", " + frame.ako().getName() + ")."));

		for (Slot slot : frame.getSlots())
			theory.getFacts().add(buildTerm("asup_slot(" + frame.getName() + ", " + slot.getName() + ")."));

/*		for (QSlot slot : frame.getSlots()) {
			if(slot.getDomain() != null)
				theory.getFacts().add(buildTerm("asup_domain(" + frame.getName() + ", " + slot.getName() + ", " + slot.getDomain().getName() + ")."));
		}*/
		
		return theory;
	}

	public static Term buildTerm(String s) {
		Term term = LogicFactory.eINSTANCE.createTerm();
		term.setName(s);
		return term;
	}
}