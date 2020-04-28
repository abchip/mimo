/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

public class Numbers {

	public static String formatPaddedNumber(long number, int numericPadding) {
		StringBuilder outStrBfr = new StringBuilder(Long.toString(number));
		while (numericPadding > outStrBfr.length()) {
			outStrBfr.insert(0, '0');
		}
		return outStrBfr.toString();
	}
}