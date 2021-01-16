/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.util.WeakHashMap;

import org.abchip.mimo.context.Context;

public class ContextUtils {

	private static WeakHashMap<String, Context> contexts = new WeakHashMap<String, Context>();

	public static Context getContext(String contextId) {
		return contexts.get(contextId);
	}

	public static void addContext(Context context) {
		if (context == null)
			return;

		contexts.put(context.getContextDescription().getId(), context);
	}

	public static void removeContext(String contextId) {
		if (contextId == null)
			return;

		contexts.remove(contextId);
	}
}
