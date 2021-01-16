/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationLogs;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ResetLog;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.ServiceResponse;

import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.EClass;
import org.osgi.service.log.admin.LoggerContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResetLogImpl extends ServiceRequestImpl<ServiceResponse> implements ResetLog {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.RESET_LOG;
	}

	@Override
	public ServiceResponse call() throws Exception {

		Context context = this.getContext();
		ServiceResponse response = this.buildResponse();

		LoggerContext loggerContext = Logs.getLoggerContext();
		if (loggerContext == null) {
			response.setErrorMessage("LoggerContext not found");
			return response;
		}

		ApplicationLogs applicationLogs = context.get(Application.class).getLogs();
		Logs.reset(applicationLogs);
		
		return response;
	}

} //ResetLogImpl
