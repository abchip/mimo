/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.cmd;

import java.util.HashMap;
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
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ServiceCommands extends BaseCommands {

	@Inject
	public ServiceCommands(Application application) {
		super(application);
	}

	public void _mm_login(CommandInterpreter interpreter) throws Exception {

		Map<String, String> arguments = new HashMap<String, String>();

		String argument = this.nextArgument(interpreter);
		while (argument != null) {

			int i = argument.indexOf("=");

			// concatenate service name
			if (i < 0) {
				throw new RuntimeException("Invalid argument: " + argument);
			}
			// parameter
			else {
				String key = argument.substring(0, i);
				String value = argument.substring(i + 1);
				arguments.put(key, value);
			}

			argument = interpreter.nextArgument();
		}

		Context context = null;

		String tenant = arguments.get("tenant");
		String user = arguments.get("user");
		if (user != null) {
			String password = arguments.get("password");
			context = this.loginByUserPassword(interpreter, tenant, user, password);
		} else {
			String adminKey = arguments.get("adminKey");
			if (Strings.isEmpty(adminKey))
				adminKey = this.getApplication().getAdminKey();

			context = this.loginByAdminKey(interpreter, tenant, adminKey);
		}

		interpreter.println(context.getContextDescription());
	}

	public void _mm_logout(CommandInterpreter interpreter) throws Exception {
		this.logout(interpreter);

		interpreter.execute("disconnect");
	}

	public <R extends ServiceRequest<V>, V extends ServiceResponse> void _mm(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		String serviceId = this.nextArgument(interpreter);
		serviceId = Strings.firstToUpper(serviceId);

		boolean submit = false;

		Map<String, String> parameters = new HashMap<String, String>();

		String argument = this.nextArgument(interpreter);
		while (argument != null) {

			int i = argument.indexOf("=");

			// concatenate service name
			if (i < 0) {
				serviceId = serviceId + Strings.firstToUpper(argument);
			}
			// parameter
			else {
				String key = argument.substring(0, i);
				String value = argument.substring(i + 1);
				parameters.put(key, value);
			}

			argument = interpreter.nextArgument();
		}

		R request = serviceManager.prepare(serviceId);
		Frame<R> frame = request.isa();
		for (Entry<String, String> parameter : parameters.entrySet()) {
			frame.setValue(request, parameter.getKey(), parameter.getValue());
		}

		V response = null;
		if (submit)
			serviceManager.submit(request);
		else
			response = serviceManager.execute(request);

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

		interpreter.println("Output parameters");
		for (Slot slot : context.getFrame(request.getResponse()).getSlots()) {
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
