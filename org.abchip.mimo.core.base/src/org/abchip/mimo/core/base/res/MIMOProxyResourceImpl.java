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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONObject;

public class MIMOProxyResourceImpl extends ResourceImpl implements ReusableResource {

	private Context context = null;
	private ResourceManager resourceManager = null;

	public MIMOProxyResourceImpl(Context context, URI uri) {
		super(uri);

		this.context = context;
		this.resourceManager = context.get(ResourceManager.class);
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
	}

	private Entity jsonObject2Entity(JSONObject jsonObject) {

		Frame<?> frame = resourceManager.getFrame(context, jsonObject.getString("isa"));

		Entity entity = frame.createEntity();

		for (String slotName : JSONObject.getNames(jsonObject)) {
			frame.setValue(entity, slotName, jsonObject.get(slotName));
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
			String object = entity2String(entity, true);

//			System.err.println(object);

			pw.write(object);
			first = false;
		}

		if (isArray)
			pw.write("]");

		pw.flush();
	}

	private String entity2String(Entity entity, boolean resolve) {

		if (entity instanceof EntityIdentifiable && !resolve) {
			EntityIdentifiable entityIdentifiable = (EntityIdentifiable) entity;
			switch (entityIdentifiable.getState()) {
			case DIRTY:
			case PROXY:
				return entityIdentifiable.getID();
			case TRANSIENT:
			case RESOLVED:
			}
		}

		Frame<Entity> frame = entity.isa();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("isa", frame.getName());

		for (Slot slot : frame.getSlots()) {
			Object value = frame.getValue(entity, slot.getName(), false);
			if (isEmpty(value))
				continue;

			params.put(slot.getName(), value2String(slot, value));
		}

		return new JSONObject(params).toString(1);
	}

	private String value2String(Slot slot, Object value) {

		StringBuilder sb = new StringBuilder();

		if (value instanceof List<?>) {
			List<?> list = (List<?>) value;
			sb.append("[");
			boolean first = true;
			for (Object element : list) {
				if (!first)
					sb.append(", ");
				sb.append(value2String(slot, element));
				first = false;
			}
			sb.append("]");
		} else if (value instanceof Entity) {
			Entity valueIdentifiable = (Entity) value;
			sb.append(entity2String(valueIdentifiable, slot.isContainment()));
		} else {
			sb.append(value);
		}

		return sb.toString();
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