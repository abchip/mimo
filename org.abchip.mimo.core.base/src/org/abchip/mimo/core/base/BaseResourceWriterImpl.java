/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.Resources;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

public class BaseResourceWriterImpl<E extends EntityIdentifiable> extends BaseResourceReaderImpl<E> implements ResourceWriter<E> {

	private LockManager lockManager = null;

	public BaseResourceWriterImpl(MimoResourceImpl<E> internal, LockManager lockManager) {
		super(internal);

		this.lockManager = lockManager;
	}

	@Override
	public E make() {
		try {
			return make(false);
		} catch (ResourceException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public E make(boolean sequence) throws ResourceException {

		E entityIdentifiable = this.getFrame().createEntity();

		if (sequence) {

			EntityLocker<?> entityLocker = lock(this.getContext(), this.getFrame());

			try {
				String id = this.getResource().nextSequence();

				Frame<?> domainFrame = entityIdentifiable.isa();
				for (String key : domainFrame.getKeys()) {
					domainFrame.setValue(entityIdentifiable, key, id);
					break;
				}

			} finally {
				unlock(entityLocker);
			}
		}

		return entityIdentifiable;
	}

	@Override
	public void delete(E entity) throws ResourceException {

		EntityLocker<?> entityLocker = lock(this.getContext(), entity);

		try {
			Resources.firePreDeleteEvent(this, entity);

			this.getResource().delete(entity);
			this.setInternalResource(entity);

			Resources.firePostDeleteEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public void create(E entity) throws ResourceException {
		this.create(entity, false);
	}

	@Override
	public void create(E entity, boolean update) throws ResourceException {

		EntityLocker<?> entityLocker = lock(this.getContext(), entity);

		try {
			Resources.firePreSaveEvent(this, entity);

			this.getResource().create(entity, update);
			this.setInternalResource(entity);

			Resources.firePostSaveEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public void update(E entity) throws ResourceException {

		EntityLocker<?> entityLocker = lock(this.getContext(), entity);

		try {
			Resources.firePreSaveEvent(this, entity);

			this.getResource().update(entity);
			this.setInternalResource(entity);

			Resources.firePostSaveEvent(this, entity);
		} finally {
			unlock(entityLocker);
		}
	}

	@Override
	public boolean validate(E entity) {
		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(MimoConstants.VALIDATOR_WRITE, null);
		Diagnostic diagnostic = this.getDiagnostician().validate((EObject) entity, context);
		return diagnostic.getSeverity() <= 0;
	}

	private <N extends EntityIdentifiable> EntityLocker<N> lock(Context context, N entity) {

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