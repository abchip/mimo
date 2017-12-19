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
package org.abchip.mimo.core.base;

import java.net.URI;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.EntityNameable;

public class BaseLockManagerImpl implements LockManager {

	@Override
	public <N extends EntityNameable> EntityLocker<N> getLocker(ContextProvider contextProvider, URI address) {
		return new BaseLockerImpl<N>(address);
	}

	@Override
	public <N extends EntityNameable> EntityLocker<N> getLocker(ContextProvider contextProvider, N entity) {
		return getLocker(contextProvider, entity.getURI());
	}

	@Override
	public <E> BlockingQueue<E> getQueue(ContextProvider contextProvider, String name) {
		return new LinkedBlockingQueue<E>();
	}

	@Override
	public <K, V> ConcurrentMap<K, V> getConcurrentMap(ContextProvider contextProvider, String name) {
		return new ConcurrentHashMap<K, V>();
	}
}