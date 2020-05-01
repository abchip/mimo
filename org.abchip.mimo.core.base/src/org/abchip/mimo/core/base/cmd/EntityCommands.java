/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.util.Strings;
import org.abchip.mimo.util.URIs;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class EntityCommands extends BaseCommands {

	@Inject
	private ServiceManager serviceManager;

	public <R extends ServiceRequest<V>, V extends ServiceResponse> void _mm(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String serviceId = this.nextArgument(interpreter);
		String tenant = null;

		StringBuffer query = new StringBuffer();

		String argument = this.nextArgument(interpreter);
		while (argument != null) {
			if (query.length() != 0)
				query.append("&");
			query.append(argument);
			argument = interpreter.nextArgument();
		}

		Map<String, String> parameters = URIs.parseQuery(query.toString());
		if (parameters.containsKey("tenant")) {
			tenant = parameters.get("tenant");
			parameters.remove("tenant");
		}

		R request = serviceManager.prepare(context, serviceId, tenant);
		Frame<R> frame = request.isa();
		for (Entry<String, String> parameter : parameters.entrySet()) {
			frame.setValue(request, parameter.getKey(), parameter.getValue());
		}

		V response = serviceManager.execute(request);

		interpreter.println(response);
	}

	public <R extends ServiceRequest<V>, V extends ServiceResponse> void _mm_help(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String serviceId = this.nextArgument(interpreter);

		Service<?, ?> service = serviceManager.getService(context, serviceId);
		if (service == null) {
			interpreter.println("Service not found " + serviceId);
			return;
		}

		ServiceRequest<?> request = service.getRequest();
		interpreter.println("Service: " + request.getServiceName());

		interpreter.println("Input parameters");
		for (Slot slot : request.isa().getSlots()) {
			interpreter.print("Name: " + slot.getName() + " ");
			interpreter.print("Text: " + slot.getText() + " ");
			interpreter.print("Optional: " + !slot.getCardinality().isMandatory() + " ");
			interpreter.print("Type: " + slot.getDataType() + " ");
			interpreter.print("Domain: " + slot.getDomain() + " ");
			interpreter.print("Default: " + slot.getDefaultValue() + " ");
			interpreter.println();
		}

		ServiceResponse response = this.getContext().getFrame(request.getResponse()).createEntity();

		interpreter.println("Output parameters");
		for (Slot slot : response.isa().getSlots()) {
			interpreter.print("Name: " + slot.getName() + " ");
			interpreter.print("Text: " + slot.getText() + " ");
			interpreter.print("Optional: " + !slot.getCardinality().isMandatory() + " ");
			interpreter.print("Type: " + slot.getDataType() + " ");
			interpreter.print("Domain: " + slot.getDomain() + " ");
			interpreter.print("Default: " + slot.getDefaultValue() + " ");
			interpreter.println();
		}
	}

	public void _login(CommandInterpreter interpreter) throws Exception {
		this.login(nextArgument(interpreter));
	}

	public void _logout(CommandInterpreter interpreter) throws Exception {
		this.logout();

		interpreter.execute("disconnect");
	}

	public <E extends EntityIdentifiable> void _find(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String frameName = nextArgument(interpreter);
		String order = nextArgument(interpreter);
		String tenant = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) context.getResourceManager().getFrame(frameName, tenant);
		if (frame == null) {
			interpreter.println("Frame not found: " + frameName + " on tenant " + tenant);
			return;
		}

		try (EntityIterator<E> entities = context.getResourceManager().getResourceReader(frame, tenant).find(null, null, order)) {
			for (E entity : entities) {
				interpreter.println(entity.getID());
			}
		}
	}

	public <E extends EntityIdentifiable> void _lookup(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String frameName = Strings.firstToUpper(nextArgument(interpreter));

		String entityName = nextArgument(interpreter);

		String tenant = nextArgument(interpreter);

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) context.getResourceManager().getFrame(frameName, tenant);
		if (frame == null)
			interpreter.print("Frame not found: " + frameName + " on tenant " + tenant);

		E entity = context.getResourceManager().getResourceReader(frame, tenant).lookup(entityName);
		interpreter.println(entity);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
