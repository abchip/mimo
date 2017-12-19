/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class EMFEntity2FrameAdapter extends AdapterImpl {

	private Frame<?> frame;

	public EMFEntity2FrameAdapter(Frame<?> frame) {
		this.frame = frame;
	}

	public Frame<?> getFrame() {
		return this.frame;
	}

	public void notifyChanged(Notification notification) {
		System.out.println("Notfication received from the data model. Data model has changed!!!");
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return EMFEntity2FrameAdapter.class.equals(type);
	}
}
