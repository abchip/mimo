/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.ResourceHelper;
import org.abchip.mimo.resource.ResourceWriter;

public class BaseResourceWriterImpl<E extends EntityNameable> extends BaseResourceReaderImpl<E> implements ResourceWriter<E> {

	private LockManager lockManager;

	public BaseResourceWriterImpl(MimoResourceImpl<E> internal, LockManager lockManager) {
		super(internal);

		this.lockManager = lockManager;
	}

	@Override
	public String nextSequence() {

		Context context = internal.getContextProvider().getContext();
		EntityLocker<?> entityLocker = lock(context, this.getFrame());

		try {
			return this.internal.getResource().nextSequence();
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public void delete(E entity) {

		Context context = internal.getContextProvider().getContext();
		EntityLocker<?> entityLocker = lock(context, entity);

		try {
			ResourceHelper.firePreDeleteEvent(this, entity);

			this.internal.getResource().delete(entity);
			this.setInternalResource(entity);

			ResourceHelper.firePostDeleteEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public void create(E entity) {
		this.create(entity, false);
	}

	@Override
	public void create(E entity, boolean update) {

		Context context = internal.getContextProvider().getContext();
		EntityLocker<?> entityLocker = lock(context, entity);

		try {
			ResourceHelper.firePreSaveEvent(this, entity);

			this.internal.getResource().create(entity, update);
			this.setInternalResource(entity);

			ResourceHelper.firePostSaveEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public void update(E entity) {

		Context context = internal.getContextProvider().getContext();
		EntityLocker<?> entityLocker = lock(context, entity);

		try {
			ResourceHelper.firePreSaveEvent(this, entity);

			this.internal.getResource().update(entity);
			this.setInternalResource(entity);

			ResourceHelper.firePostSaveEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	private <N extends EntityNameable> EntityLocker<N> lock(Context context, N entity) {

		if (lockManager == null)
			return null;

		EntityLocker<N> entityLocker = lockManager.getLocker(context, entity);
		entityLocker.lock(LockType.WRITE);

		return entityLocker;
	}

	private void unlock(EntityLocker<?> entityLocker) {
		if (entityLocker != null)
			entityLocker.unlock(LockType.WRITE);
	}
}