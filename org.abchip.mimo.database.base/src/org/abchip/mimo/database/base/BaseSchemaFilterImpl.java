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
package org.abchip.mimo.database.base;

import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilterImpl;

public class BaseSchemaFilterImpl extends ConnectionFilterImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BaseSchemaFilterImpl() {
		clear();
	}

	public void clear() {
		setPredicate("NOT IN ('')");
	}

	public void setSchemaName(String name) {
		setPredicate("IN ('" + name + "')");
	}
}
