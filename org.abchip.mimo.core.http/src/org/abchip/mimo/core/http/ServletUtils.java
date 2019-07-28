/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.util.WeakHashMap;

import org.abchip.mimo.context.ContextProvider;

public class ServletUtils {

	private static WeakHashMap<String, ContextProvider> contexts = new WeakHashMap<String, ContextProvider>();

	// ContextProvider in HttpSession
	public static final String CONTEXT_ATTR = "contexProvider";

	public static ContextProvider getContextProvider(String contextId) {
		return contexts.get(contextId);
	}

	public static void addContextProvider(ContextProvider contextProvider) {
		if (contextProvider == null)
			return;

		contexts.put(contextProvider.getContextDescription().getId(), contextProvider);
	}

	public static void removeContextProvider(String contextId) {
		if (contextId == null)
			return;

		contexts.remove(contextId);
	}
}
