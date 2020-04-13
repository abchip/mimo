/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.res.JSONProxyResourceImpl;
import org.abchip.mimo.core.base.res.MIMOProxyResourceImpl;
import org.abchip.mimo.core.base.res.ReusableResource;
import org.abchip.mimo.core.base.res.XMIProxyResourceImpl;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceSerializerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.emfjson.jackson.module.EMFModule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class BaseResourceSerializerImpl<E extends Entity> extends ResourceSerializerImpl<E> {

	private ReusableResource resource = null;

	public BaseResourceSerializerImpl(Context context, Frame<E> frame, SerializationType serializationType) {
		this.setFrame(frame);

		switch (serializationType) {
		case JSON:
			final ObjectMapper mapper = new ObjectMapper(null);
			// same as emf
			final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
			dateFormat.setTimeZone(TimeZone.getDefault());

			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			mapper.setDateFormat(dateFormat);
			mapper.setTimeZone(TimeZone.getDefault());
			EMFModule module = new EMFModule();
			module.configure(EMFModule.Feature.OPTION_SERIALIZE_DEFAULT_VALUE, true);
			mapper.registerModule(module);

			// mapper.
			this.resource = new JSONProxyResourceImpl(URI.createURI("mimo:/" + getFrame().getName() + "s"), mapper);
			break;
		case XMI:
			this.resource = new XMIProxyResourceImpl(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
		case MIMO:
			this.resource = new MIMOProxyResourceImpl(context, URI.createURI("mimo:/" + getFrame().getName() + "s"));
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
		if (!this.isEmpty())
			return (E) this.resource.getContents().get(0);
		else
			return null;
	}

	@Override
	public boolean isEmpty() {
		return this.resource.getContents().isEmpty();
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
	public void load(String content, boolean append) throws IOException {
		this.load(new ByteArrayInputStream(content.getBytes()), append);
	}

	@Override
	public void load(InputStream content, boolean append) throws IOException {
		this.resource.load(content, append);
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {
		this.resource.save(outputStream);
	}

}