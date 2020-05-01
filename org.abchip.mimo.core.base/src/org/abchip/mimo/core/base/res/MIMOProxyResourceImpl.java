/**
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.res;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONObject;

public class MIMOProxyResourceImpl extends ResourceImpl implements ReusableResource {

	private Context context = null;

	public MIMOProxyResourceImpl(Context context, URI uri) {
		super(uri);

		this.context = context;
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

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
		String line = "";
		boolean first = true;
		boolean isArray = false;
		StringBuilder responseStrBuilder = new StringBuilder();

		while ((line = bufferedReader.readLine()) != null) {
			if (first && line.trim().startsWith("["))
				isArray = true;
			responseStrBuilder.append(line);
			first = false;
		}
		content.close();

		try {
			if (isArray) {
				JSONArray array = new JSONArray(responseStrBuilder.toString());
				for (int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					Entity entityIdentifiable = jsonObject2Entity(object);
					this.getContents().add((EObject) entityIdentifiable);
				}
			} else {
				JSONObject object = new JSONObject(responseStrBuilder.toString());
				Entity entity = jsonObject2Entity(object);
				this.getContents().add((EObject) entity);
			}
		} catch (ResourceException e) {
			throw new IOException(e);
		}
	}

	private Entity jsonObject2Entity(JSONObject jsonObject) throws ResourceException {

		Resource<?> resource = context.getResourceManager().getResource(jsonObject.getString("isa"));

		Entity entity = resource.make();
		Frame<?> frame = entity.isa();
		for (String slotName : JSONObject.getNames(jsonObject)) {
			Object slotValue = jsonObject.get(slotName);
			if (slotValue instanceof JSONObject) {
				slotValue = jsonObject2Entity((JSONObject) slotValue);
			}
			frame.setValue(entity, slotName, slotValue);
		}

		return entity;
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {

		boolean isArray = this.getContents().size() > 1;

		PrintWriter pw = new PrintWriter(outputStream);

		if (isArray)
			pw.write("[");

		boolean first = true;
		for (EObject eObject : this.getContents()) {

			if (!(eObject instanceof Entity))
				continue;

			if (!first)
				pw.write(",");

			Entity entity = (Entity) eObject;

			/*
			 * if (entity instanceof EntityIdentifiable) { EntityIdentifiable
			 * entityIdentifiable = (EntityIdentifiable) entity; switch
			 * (entityIdentifiable.getState()) { case DIRTY: case PROXY: pw.write("\"" +
			 * Strings..escape(entityIdentifiable.getID()) + "\""); first = false; continue;
			 * case TRANSIENT: case RESOLVED: break; } }
			 */

			JSONObject object = entity2JSON(entity);

			pw.write(object.toString());
			first = false;
		}

		if (isArray)
			pw.write("]");

		pw.flush();
	}

	private JSONObject entity2JSON(Entity entity) {

		JSONObject object = new JSONObject();

		Frame<Entity> frame = entity.isa();

		object.put("isa", frame.getName());

		for (Slot slot : frame.getSlots()) {
			if (slot.isTransient())
				continue;

			Object value = frame.getValue(entity, slot.getName(), true, false);
			if (isEmpty(value))
				continue;

			object.put(slot.getName(), value2Object(slot, value));
		}

		return object;
	}

	private Object value2Object(Slot slot, Object value) {

		Object object = null;

		if (value instanceof List<?>) {
			List<?> list = (List<?>) value;

			JSONArray array = new JSONArray();
			for (Object element : list) {
				array.put(value2Object(slot, element));
			}

			object = array;
		} else if (value instanceof Entity) {
			Entity entity = (Entity) value;

			if (entity instanceof EntityIdentifiable) {
				EntityIdentifiable entityIdentifiable = (EntityIdentifiable) entity;
				switch (entityIdentifiable.getState()) {
				case DIRTY:
				case PROXY:
					object = value2Raw(slot, entityIdentifiable.getID());
					break;
				case TRANSIENT:
				case RESOLVED:
				case CHAINED:
					break;
				}
			}

			if (object == null) {
				if (slot.isContainment()) {
					object = entity2JSON(entity);
				} else
					object = value2Raw(slot, value);
			}
		} else {
			object = value2Raw(slot, value);
		}

		return object;
	}

	private Object value2Raw(Slot slot, Object value) {

		Object raw = null;

		switch (slot.getDataType()) {
		case BINARY:
			raw = value;
			break;
		case BOOLEAN:
			raw = Boolean.parseBoolean(value.toString());
			break;
		case DATE_TIME:
			DateFormat dateFormat = new SimpleDateFormat(MimoConstants.TIMESTAMP_FORMAT);
			raw = dateFormat.format(value);
			break;
		case ENTITY:
			if (value instanceof EntityIdentifiable) {
				EntityIdentifiable entityIdentifiable = (EntityIdentifiable) value;
				raw = entityIdentifiable.getID();
			} else
				raw = value;
			break;
		case ENUM:
			Enumerator enumerator = (Enumerator) value;
			raw = enumerator.getLiteral();
			break;
		case IDENTITY:
		case NUMERIC:
			raw = value;
		case STRING:
			raw = value;
			break;
		}

		return raw;
	}

	private boolean isEmpty(Object value) {

		if (value == null)
			return true;

		if (value instanceof String)
			return ((String) value).isEmpty();

		if (value instanceof Number)
			return ((Number) value).intValue() == 0;

		if (value instanceof List<?>)
			return ((List<?>) value).isEmpty();

		return false;
	}
}