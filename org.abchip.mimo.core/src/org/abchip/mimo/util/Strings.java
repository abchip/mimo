/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import org.apache.commons.lang.StringEscapeUtils;

public class Strings {

	public static String firstToUpper(String string) {
		StringBuffer s = new StringBuffer(string.length());
		CharacterIterator it = new StringCharacterIterator(string);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
			if (it.getIndex() == 0)
				s.append(String.valueOf(ch).toUpperCase());
			else
				s.append(ch);
		return s.toString();
	}

	public static String firstToLower(String string) {
		StringBuffer s = new StringBuffer(string.length());
		CharacterIterator it = new StringCharacterIterator(string);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
			if (it.getIndex() == 0)
				s.append(String.valueOf(ch).toLowerCase());
			else
				s.append(ch);
		return s.toString();
	}

	public static String appendChars(String string, String chars, int times, boolean before) {

		StringBuffer sb = new StringBuffer();

		if (!before)
			sb.append(string);

		for (int x = 0; x < times; x++)
			sb.append(chars);

		if (before)
			sb.append(string);

		sb.trimToSize();

		return sb.toString();
	}

	public static String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}

	public static String removeLastChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(0, str.length() - 1);
	}

	public static String trimL(String string) {
		int i = 0;
		while (i < string.length() && (Character.isWhitespace(string.charAt(i)) || string.charAt(i) == 0))
			i++;
		return string.substring(i);
	}

	public static String trimR(String string) {
		int i = string.length() - 1;
		while (i >= 0 && (Character.isWhitespace(string.charAt(i)) || string.charAt(i) == 0))
			i--;
		return string.substring(0, i + 1);
	}

	public static Boolean isEmpty(String string) {
		return string == null || string.trim().isEmpty();
	}

	public static boolean isNotEmpty(String string) {
		return !isEmpty(string);
	}

	public static String escapeJava(String string) {
		return StringEscapeUtils.escapeJava(string);
	}
}
