/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 */
package org.abchip.mimo.tester.base;

import java.lang.annotation.Annotation;
import java.util.List;

import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.impl.ContextImpl;

public class BaseTestContextImpl extends ContextImpl {

	private Context delegate;

	protected BaseTestContextImpl(Context delegate) {
		this.delegate = delegate;
	}

	@Override
	public void close() {
		this.delegate.close();
	}

	@Override
	public Context createChildContext(String name) {
		Context childContext = delegate.createChildContext(name);
		return new BaseTestContextImpl(childContext);
	}

	@Override
	public Context createChildContext(ContextDescription contextDescription) {
		Context childContext = delegate.createChildContext(contextDescription);
		return new BaseTestContextImpl(childContext);
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return delegate.get(clazz);
	}

	@Override
	public ContextDescription getContextDescription() {
		return delegate.getContextDescription();
	}

	@Override
	public String getID() {
		return delegate.getID();
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
	public Class<?> loadClass(String address) {
		return delegate.loadClass(address);
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
	public String resolveAlias(String value) {
		return delegate.resolveAlias(value);
	}

	@Override
	public List<String> resolveAliases(List<String> values) {
		return delegate.resolveAliases(values);
	}

	@Override
	public <T> void set(Class<T> klass, T object) {
		delegate.set(klass, object);
	}

	public void set(String name, Object object) {
		delegate.set(name, object);
	}
	
	@Override
	public Context getContext() {
		return this;
	}

	public <T> T getAdapter(Object adaptable, Class<T> adapter) {
		return delegate.getAdapter(adaptable, adapter);
	}

	public <T> void registerAdapterFactory(AdapterFactory factory, Class<T> adapterType) {
		delegate.registerAdapterFactory(factory, adapterType);
	}
}
