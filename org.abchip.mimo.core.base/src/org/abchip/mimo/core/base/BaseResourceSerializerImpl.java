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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.impl.ResourceSerializerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class BaseResourceSerializerImpl<E extends Entity> extends ResourceSerializerImpl<E> {

	private Resource resource = null;

	public BaseResourceSerializerImpl(SerializationType serializationType, Frame<E> frame) {

		this.setFrame(frame);

		switch (serializationType) {
		case JSON:
			this.resource = new JsonResourceFactory().createResource(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
		case XMI:
			this.resource = new XMIResourceFactoryImpl().createResource(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
		}
	}

	@Override
	public void close() throws IOException {
		this.resource.unload();
		this.resource = null;
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
		return (List<E>) this.resource.getContents();
	}

	@Override
	public void clear() {
		this.resource.getContents().clear();
	}

	@Override
	public void load(InputStream inputStream) throws IOException {
		this.resource.load(inputStream, Collections.EMPTY_MAP);
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {
		this.resource.save(outputStream, Collections.EMPTY_MAP);
	}
}

class EntitySerializer<E extends Entity> extends StdSerializer<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntitySerializer() {
		this(null);
	}

	public EntitySerializer(Class<E> t) {
		super(t);
	}

	@Override
	public void serialize(E value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {

		jgen.writeStartObject();
		// jgen.writeNumberField("id", value.id);
		// jgen.writeStringField("itemName", value.itemName);
		// jgen.writeNumberField("owner", value.owner.id);
		jgen.writeEndObject();
	}
}