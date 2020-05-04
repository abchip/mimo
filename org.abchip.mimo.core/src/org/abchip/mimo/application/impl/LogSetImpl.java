/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application.impl;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.application.ApplicationLogLevel;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.LogSet;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.admin.LoggerContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Log
 * Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.abchip.mimo.application.impl.LogSetImpl#getLogPattern <em>Log
 * Pattern</em>}</li>
 * <li>{@link org.abchip.mimo.application.impl.LogSetImpl#getLogLevel <em>Log
 * Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogSetImpl extends ServiceRequestImpl<ServiceResponse> implements LogSet {
	/**
	 * The default value of the '{@link #getLogPattern() <em>Log Pattern</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogPattern() <em>Log Pattern</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogPattern()
	 * @generated
	 * @ordered
	 */
	protected String logPattern = LOG_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationLogLevel LOG_LEVEL_EDEFAULT = ApplicationLogLevel.ERROR;

	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected ApplicationLogLevel logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.LOG_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLogPattern() {
		return logPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLogPattern(String newLogPattern) {
		String oldLogPattern = logPattern;
		logPattern = newLogPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOG_SET__LOG_PATTERN, oldLogPattern, logPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ApplicationLogLevel getLogLevel() {
		return logLevel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLogLevel(ApplicationLogLevel newLogLevel) {
		ApplicationLogLevel oldLogLevel = logLevel;
		logLevel = newLogLevel == null ? LOG_LEVEL_EDEFAULT : newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOG_SET__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ApplicationPackage.LOG_SET__LOG_PATTERN:
			return getLogPattern();
		case ApplicationPackage.LOG_SET__LOG_LEVEL:
			return getLogLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ApplicationPackage.LOG_SET__LOG_PATTERN:
			setLogPattern((String) newValue);
			return;
		case ApplicationPackage.LOG_SET__LOG_LEVEL:
			setLogLevel((ApplicationLogLevel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ApplicationPackage.LOG_SET__LOG_PATTERN:
			setLogPattern(LOG_PATTERN_EDEFAULT);
			return;
		case ApplicationPackage.LOG_SET__LOG_LEVEL:
			setLogLevel(LOG_LEVEL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ApplicationPackage.LOG_SET__LOG_PATTERN:
			return LOG_PATTERN_EDEFAULT == null ? logPattern != null : !LOG_PATTERN_EDEFAULT.equals(logPattern);
		case ApplicationPackage.LOG_SET__LOG_LEVEL:
			return logLevel != LOG_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (logPattern: ");
		result.append(logPattern);
		result.append(", logLevel: ");
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

	@Override
	public ServiceResponse call() throws Exception {

		this.getContext();
		ServiceResponse response = this.buildResponse();

		LoggerContext loggerContext = Logs.getLoggerContext();
		if (loggerContext == null) {
			response.setError(true);
			response.setErrorMessage("LoggerContext not found");
			return response;
		}

		Map<String, LogLevel> logLevels = new HashMap<>(loggerContext.getLogLevels());
		switch (getLogLevel()) {
		case DEBUG:
			logLevels.put(getLogPattern(), LogLevel.DEBUG);
			break;
		case ERROR:
			logLevels.put(getLogPattern(), LogLevel.ERROR);
			break;
		case INFO:
			logLevels.put(getLogPattern(), LogLevel.INFO);
			break;
		case TRACE:
			logLevels.put(getLogPattern(), LogLevel.TRACE);
			break;
		case WARNING:
			logLevels.put(getLogPattern(), LogLevel.WARN);
			break;
		}
		loggerContext.setLogLevels(logLevels);

		return response;
	}

} // LogSetImpl
