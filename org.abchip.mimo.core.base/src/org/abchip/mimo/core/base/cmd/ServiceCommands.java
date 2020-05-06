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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.util.Strings;
import org.abchip.mimo.util.URIs;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ServiceCommands extends BaseCommands {

	@Inject
	public ServiceCommands(Application application) {
		super(application);
	}

	public <R extends ServiceRequest<V>, V extends ServiceResponse> void _mm(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String serviceId = this.nextArgument(interpreter);
		serviceId = Strings.firstToUpper(serviceId);

		boolean submit = false;
		String tenant = null;

		StringBuffer query = new StringBuffer();

		String argument = this.nextArgument(interpreter);
		while (argument != null) {

			// concatenate service name
			if (!argument.contains("=")) {
				serviceId = serviceId + Strings.firstToUpper(argument);
				argument = interpreter.nextArgument();
				continue;
			}

			if (query.length() != 0)
				query.append("&");
			query.append(argument);
			argument = interpreter.nextArgument();
		}

		Map<String, String> parameters = URIs.parseQuery(query.toString());

		// tenant
		if (parameters.containsKey("tenant")) {
			tenant = parameters.get("tenant");
			parameters.remove("tenant");
		}

		R request = serviceManager.prepare(serviceId, tenant);
		Frame<R> frame = request.isa();
		for (Entry<String, String> parameter : parameters.entrySet()) {
			frame.setValue(request, parameter.getKey(), parameter.getValue());
		}

		V response = null;
		if (submit)
			serviceManager.submit(request);
		else
			serviceManager.execute(request);

		interpreter.println(response);
	}

	public <R extends ServiceRequest<V>, V extends ServiceResponse> void _mm_help(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String serviceId = this.nextArgument(interpreter);
		serviceId = Strings.firstToUpper(serviceId);

		String argument = this.nextArgument(interpreter);
		while (argument != null) {

			// concatenate service name
			if (!argument.contains("=")) {
				serviceId = serviceId + Strings.firstToUpper(argument);
				argument = interpreter.nextArgument();
				continue;
			}
		}

		Service<?, ?> service = serviceManager.getService(serviceId);
		if (service == null) {
			interpreter.println("Service not found " + serviceId);
			return;
		}

		interpreter.println();
		ServiceRequest<?> request = service.getRequest();
		interpreter.println("Service: " + request.getServiceName());

		interpreter.println("Input parameters");
		for (Slot slot : request.isa().getSlots()) {
			interpreter.print("\tName: " + slot.getName() + " ");
			interpreter.print("\tText: " + slot.getText() + " ");
			interpreter.print("\tOptional: " + !slot.getCardinality().isMandatory() + " ");
			interpreter.print("\tType: " + slot.getDataType() + " ");
			interpreter.print("\tDomain: " + slot.getDomain() + " ");
			interpreter.print("\tDefault: " + slot.getDefaultValue() + " ");
			interpreter.println();
		}

		ServiceResponse response = (ServiceResponse) EcoreUtil.create(context.createProxy(Frame.class, request.getResponse().getSimpleName()).getEClass());

		interpreter.println("Output parameters");
		for (Slot slot : response.isa().getSlots()) {
			interpreter.print("\tName: " + slot.getName() + " ");
			interpreter.print("\tText: " + slot.getText() + " ");
			interpreter.print("\tOptional: " + !slot.getCardinality().isMandatory() + " ");
			interpreter.print("\tType: " + slot.getDataType() + " ");
			interpreter.print("\tDomain: " + slot.getDomain() + " ");
			interpreter.print("\tDefault: " + slot.getDefaultValue() + " ");
			interpreter.println();
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
