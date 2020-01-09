/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceSerializerImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResource;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class BaseResourceSerializerImpl<E extends Entity> extends ResourceSerializerImpl<E> {

	private ReusableResource resource = null;

	public BaseResourceSerializerImpl(Frame<E> frame, SerializationType serializationType) {
		this.setFrame(frame);

		switch (serializationType) {
		case JAVA_SCRIPT_OBJECT_NOTATION:
		case JAVA_SCRIPT_MIMO_NOTATION:
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
		case XML_METADATA_INTERCHANGE:
			this.resource = new XMIProxyResourceImpl(URI.createURI("mimo:/" + getFrame().getName() + "s"));
			break;
//		case JAVA_SCRIPT_MIMO_NOTATION:
//			this.resource = new MIMOProxyResourceImpl(frame, URI.createURI("mimo:/" + getFrame().getName() + "s"));
//			break;
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

	private interface ReusableResource {
		public void clear();

		public List<EObject> getContents();

		public void save(OutputStream outputStream) throws IOException;

		public void unload();

		public void load(InputStream content, boolean append) throws IOException;
	}

	private class XMIProxyResourceImpl extends XMIResourceImpl implements ReusableResource {

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
		public void load(InputStream content, boolean append) throws IOException {
			if (append)
				this.setLoaded(false);

			super.load(content, Collections.EMPTY_MAP);
		}

		@Override
		public void save(OutputStream outputStream) throws IOException {
			super.save(outputStream, Collections.EMPTY_MAP);
		}
	}

	private class JSONProxyResourceImpl extends JsonResource implements ReusableResource {

		public JSONProxyResourceImpl(URI uri, ObjectMapper mapper) {
			super(uri, mapper);
		}

		@Override
		public void clear() {
			EcoreUtil.removeAll(this.getContents());
			this.getContents().clear();
			this.setLoaded(false);
		}

		@Override
		public void load(InputStream content, boolean append) throws IOException {
			if (append)
				this.setLoaded(false);

			super.load(content, Collections.EMPTY_MAP);
		}

		@Override
		public void save(OutputStream outputStream) throws IOException {
			super.save(outputStream, Collections.EMPTY_MAP);
		}
	}

	private class MIMOProxyResourceImpl extends ResourceImpl implements ReusableResource {

		private Frame<?> frame = null;
		
		public MIMOProxyResourceImpl(Frame<?> frame, URI uri) {
			super(uri);
			this.frame = frame;
		}

		@Override
		public void clear() {
			EcoreUtil.removeAll(this.getContents());
			this.getContents().clear();
			this.setLoaded(false);
		}

		@Override
		public void load(InputStream content, boolean append) throws IOException {
			if (append)
				this.setLoaded(false);

			BufferedReader bR = new BufferedReader(new InputStreamReader(content));
			String line = "";
			boolean first = true;
			boolean isArray = false;
			StringBuilder responseStrBuilder = new StringBuilder();

			while ((line = bR.readLine()) != null) {
				if (first && line.trim().startsWith("["))
					isArray = true;
				// System.out.println(line);
				responseStrBuilder.append(line);
				first = false;
			}
			content.close();

			if (isArray) {
				JSONArray array = new JSONArray(responseStrBuilder.toString());
				for (int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					EntityIdentifiable entityIdentifiable = jsonObject2Entityidentifiable(null, object);
					this.getContents().add((EObject)entityIdentifiable);
				}
			} else {
				JSONObject object = new JSONObject(responseStrBuilder.toString());
				EntityIdentifiable entityIdentifiable = jsonObject2Entityidentifiable(null, object);
				this.getContents().add((EObject)entityIdentifiable);				
			}
		}

		@SuppressWarnings("unchecked")
		private EntityIdentifiable jsonObject2Entityidentifiable(Domain domain, JSONObject jsonObject) {

			Frame<EntityIdentifiable> frame = null;
			if(domain == null) {
				frame = (Frame<EntityIdentifiable>) this.frame;				
			}
			else {
				domain.getFrame();
			}
			
			if(frame == null)
				return null;
				
			EntityIdentifiable entityIdentifiable = frame.createEntity();
			
			return entityIdentifiable;
		}

		@Override
		public void save(OutputStream outputStream) throws IOException {

			boolean isArray = this.getContents().size() > 1;

			PrintWriter pw = new PrintWriter(outputStream);

			if (isArray)
				pw.write("[");

			boolean first = true;
			for (EObject eObject : this.getContents()) {

				if (!(eObject instanceof EntityIdentifiable))
					continue;

				if (!first)
					pw.write(",");

				EntityIdentifiable entityIdentifiable = (EntityIdentifiable) eObject;
				String object = entityIdentifiable2String(entityIdentifiable);
				pw.write(object);
				first = false;
			}

			if (isArray)
				pw.write("]");

			pw.flush();
		}
	}

	private String entityIdentifiable2String(EntityIdentifiable entityIdentifiable) {

		switch (entityIdentifiable.getState()) {
		case DIRTY:
		case PROXY:
			return entityIdentifiable.getID();
		case TRANSIENT:
		case RESOLVED:
			Frame<EntityIdentifiable> frame = entityIdentifiable.isa();

			Map<String, Object> params = new HashMap<String, Object>();
			params.put("eClass", frame.getName());

			for (Slot slot : frame.getSlots()) {
				Object value = frame.getValue(entityIdentifiable, slot.getName(), false);
				if (value == null)
					continue;
				if (value instanceof EntityIdentifiable) {
					EntityIdentifiable valueIdentifiable = (EntityIdentifiable) value;
					params.put(slot.getName(), entityIdentifiable2String(valueIdentifiable));
				} else
					params.put(slot.getName(), value);
			}

			return new JSONObject(params).toString(1);
		}

		return null;
	}
}