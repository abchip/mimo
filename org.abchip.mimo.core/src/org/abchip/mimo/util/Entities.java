/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Entities {

	public static String getID(EObject eObject) {

		String id = EcoreUtil.getID(eObject);
		if (id != null)
			return id;

		if (!(eObject instanceof EntityIdentifiable))
			return null;

		EntityIdentifiable entityIdentifiable = (EntityIdentifiable) eObject;

		StringBuffer name = new StringBuffer();

		Frame<EntityIdentifiable> frame = entityIdentifiable.isa();
		for (String key : frame.getKeys()) {
			if (!name.toString().isEmpty())
				name.append("/");
			Object value = entityIdentifiable.eGet(frame.getSlot(key), false, false);
			if (value == null)
				break;

			if (value instanceof EntityIdentifiable)
				name.append(((EntityIdentifiable) value).getID());
			else {
				if (value instanceof Date) {
					Date date = (Date) value;
					DateFormat dateFormat = new SimpleDateFormat(MimoConstants.TIMESTAMP_FORMAT);
					value = dateFormat.format(date);
				}

				name.append(value);
			}
		}

		if (name.toString().isEmpty())
			return null;

		return name.toString();
	}
}
