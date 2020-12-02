/**
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osgi.service.log.Logger;

public class MimoJSONResourceImpl extends ResourceImpl implements ReusableResource, ContextProvider {

	private static final Logger LOGGER = Logs.getLogger(MimoJSONResourceImpl.class);

	private Context context = null;
	private Frame<?> frame = null;

	public MimoJSONResourceImpl(Context context, Frame<?> frame, URI uri) {
		super(uri);

		this.context = context;
		this.frame = frame;
	}

	public Context getContext() {
		return this.context;
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

		if (responseStrBuilder.toString().isEmpty())
			return;

		try {
			if (isArray) {
				JSONArray array = new JSONArray(responseStrBuilder.toString());
				for (int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					jsonObject2Entity(this.getContents(), this.frame, object);

				}
			} else {
				JSONObject object = new JSONObject(responseStrBuilder.toString());
				jsonObject2Entity(this.getContents(), this.frame, object);
			}
		} catch (ResourceException e) {
			throw new IOException(e);
		}
	}

	private Entity jsonObject2Entity(List<EObject> container, Frame<?> frame, JSONObject jsonObject) throws ResourceException {
		
		if (jsonObject.has("isa")) {
			String isa = jsonObject.getString("isa");
			frame = context.getResourceManager().getFrame(isa);
			jsonObject.remove("isa");
		}

		Entity entity = context.make(frame);

		if (container != null)
			container.add((EObject) entity);

		for (String slotName : JSONObject.getNames(jsonObject)) {
			Slot slot = this.getSlot(frame, slotName);

			if (jsonObject.isNull(slotName))
				continue;

			Object slotValue = jsonObject.get(slotName);
			if (slotValue instanceof JSONObject) {
				if (slot.getDomain() != null) {
					Frame<?> slotDomain = context.getResourceManager().getFrame(slot.getDomain().getFrame());
					slotValue = jsonObject2Entity(null, slotDomain, (JSONObject) slotValue);
				} else {
					LOGGER.warn("Invalid domain for slot {}.{}", frame.getName(), slot.getName());
					continue;
				}
			}
			entity.eSet(slot, slotValue);
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
		case OBJECT:
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

	private Slot getSlot(Frame<?> frame, String field) {

		Slot slot = frame.getSlot(field);
		if (slot == null && field.endsWith("Id")) {
			slot = frame.getSlot(field.substring(0, field.length() - 2));
			if (slot != null && slot.getDomain() == null)
				slot = null;
		}

		return slot;
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