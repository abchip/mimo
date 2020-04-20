/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.tester.base;

import java.lang.annotation.Annotation;

import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.impl.ContextImpl;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;

public class BaseTestContextImpl extends ContextImpl {

	private Context delegate;

	protected BaseTestContextImpl(Context delegate) {
		this.delegate = delegate;
	}

	@Override
	public void dispose() {
		this.delegate.dispose();
	}

/*	@Override
	public Context createChildContext(String name) {
		Context childContext = delegate.createChildContext(name);
		return new BaseTestContextImpl(childContext);
	}

	@Override
	public Context createChildContext(ContextDescription contextDescription) {
		Context childContext = delegate.createChildContext(contextDescription);
		return new BaseTestContextImpl(childContext);
	}*/

	@Override
	public <T> T get(Class<T> clazz) {
		return delegate.get(clazz);
	}

	@Override
	public ContextDescription getContextDescription() {
		return delegate.getContextDescription();
	}

	@Override
	public void inject(Object object) {
		delegate.inject(object);
	}

	@Override
	public boolean isClosed() {
		return delegate.isClosed();
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) {
		delegate.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) {
		return delegate.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object) {
		delegate.set(klass, object);
	}

	public void set(String name, Object object) {
		delegate.set(name, object);
	}

	public <T> T getAdapter(Object adaptable, Class<T> adapter) {
		return delegate.getAdapter(adaptable, adapter);
	}

	public <T> void registerAdapterFactory(AdapterFactory factory, Class<T> adapterType) {
		delegate.registerAdapterFactory(factory, adapterType);
	}

	@Override
	public void registerListener(ContextListener listener) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ResourceManager getResourceManager() {
		return delegate.getResourceManager();
	}

	@Override
	public <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return delegate.getFrame(klass);
	}

	@Override
	public <E extends EntityIdentifiable> E createProxy(Class<E> frame, String id) {
		return delegate.createProxy(frame, id);
	}

	@Override
	public <E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id) {
		return delegate.createProxy(frame, id);
	}
}
