/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilterImpl;

public class BaseViewFilterImpl extends ConnectionFilterImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseViewFilterImpl() {
		clear();
	}

	public void clear() {
		setPredicate("NOT IN ('')");
	}

	public void setViewName(String name) {
		setPredicate("IN ('" + name + "')");
	}
}
