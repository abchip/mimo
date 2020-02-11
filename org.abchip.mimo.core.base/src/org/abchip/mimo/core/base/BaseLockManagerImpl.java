/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.net.URI;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.EntityIdentifiable;

public class BaseLockManagerImpl implements LockManager {

	@Override
	public <N extends EntityIdentifiable> EntityLocker<N> getLocker(Context context, URI address) {
		return new BaseLockerImpl<N>(address);
	}

	@Override
	public <N extends EntityIdentifiable> EntityLocker<N> getLocker(Context context, N entity) {
		return getLocker(context, entity.getURI());
	}

	@Override
	public <E> BlockingQueue<E> getQueue(Context context, String name) {
		return new LinkedBlockingQueue<E>();
	}

	@Override
	public <K, V> ConcurrentMap<K, V> getConcurrentMap(Context context, String name) {
		return new ConcurrentHashMap<K, V>();
	}
}