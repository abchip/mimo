/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.impl.ResourceSerializerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResource;

public class BaseResourceSerializerImpl<E extends Entity> extends ResourceSerializerImpl<E> {

	private ResourceReusable resource = null;

	public BaseResourceSerializerImpl(ContextProvider contextProvider, Frame<E> frame, SerializationType serializationType) {

		this.setContextProvider(contextProvider);
		this.setFrame(frame);

		switch (serializationType) {
		case JSON:
			this.resource = new JSONProxyResourceImpl(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
		case XMI:
			this.resource = new XMIProxyResourceImpl(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
		}
	}

	@Override
	public void add(E entity) {
		this.resource.getContents().add((EObject) entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addAll(List<E> entities) {
		this.resource.getContents().addAll((Collection<? extends EObject>) entities);
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get() {
		if (!this.resource.getContents().isEmpty())
			return (E) this.resource.getContents().get(0);
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> getAll() {
		return (List<E>) new ArrayList<EObject>(resource.getContents());
	}

	@Override
	public void clear() {
		// empty contents
		this.resource.clear();
	}

	@Override
	public void close() throws IOException {
		EcoreUtil.removeAll(this.resource.getContents());
		
		this.resource.unload();
		this.resource = null;
	}

	@Override
	public void load(InputStream inputStream, boolean append) throws IOException {
		this.resource.load(inputStream, append);
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {
		this.resource.save(outputStream);
	}

	private interface ResourceReusable {
		public void clear();

		public List<EObject> getContents();

		public void save(OutputStream outputStream) throws IOException;

		public void unload();

		public void load(InputStream inputStream, boolean append) throws IOException;
	}

	private class XMIProxyResourceImpl extends XMIResourceImpl implements ResourceReusable {

		public XMIProxyResourceImpl(URI uri) {
			super(uri);
		}

		@Override
		public void clear() {
			EcoreUtil.removeAll(this.getContents());
			this.getContents().clear();
			this.setLoaded(false);
		}

		@Override
		public void load(InputStream inputStream, boolean append) throws IOException {
			if (append)
				this.setLoaded(false);

			super.load(inputStream, Collections.EMPTY_MAP);
		}

		@Override
		public void save(OutputStream outputStream) throws IOException {
			super.save(outputStream, Collections.EMPTY_MAP);
		}
	}

	private class JSONProxyResourceImpl extends JsonResource implements ResourceReusable {

		public JSONProxyResourceImpl(URI uri) {
			super(uri, EMFModule.setupDefaultMapper());
		}

		@Override
		public void clear() {
			EcoreUtil.removeAll(this.getContents());
			this.getContents().clear();
			this.setLoaded(false);
		}

		@Override
		public void load(InputStream inputStream, boolean append) throws IOException {
			if (append)
				this.setLoaded(false);

			super.load(inputStream, Collections.EMPTY_MAP);
		}

		@Override
		public void save(OutputStream outputStream) throws IOException {
			super.save(outputStream, Collections.EMPTY_MAP);
		}
	}
}