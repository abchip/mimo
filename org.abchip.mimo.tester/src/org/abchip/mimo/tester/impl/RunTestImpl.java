/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.tester.impl;

import java.util.List;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.tester.AssertionFailed;
import org.abchip.mimo.tester.AssertionResult;
import org.abchip.mimo.tester.AssertionSuccess;
import org.abchip.mimo.tester.RunTest;
import org.abchip.mimo.tester.RunTestResponse;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestResult;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.TesterPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run
 * Test</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.tester.impl.RunTestImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunTestImpl extends ServiceRequestImpl<RunTestResponse> implements RunTest {
	/**
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RunTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesterPackage.Literals.RUN_TEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesterPackage.RUN_TEST__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TesterPackage.RUN_TEST__COMPONENT:
				return getComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TesterPackage.RUN_TEST__COMPONENT:
				setComponent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TesterPackage.RUN_TEST__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TesterPackage.RUN_TEST__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (component: ");
		result.append(component);
		result.append(')');
		return result.toString();
	}

	@Override
	public RunTestResponse call() throws Exception {

		RunTestResponse response = buildResponse();

		TestManager testManager = getContext().get(TestManager.class);
		for (ApplicationComponent component : getContext().get(Application.class).getActiveComponents()) {
			if (!component.getName().equalsIgnoreCase(this.getComponent()))
				continue;

			List<TestSuiteRunner> runners = testManager.prepareSuiteRunner(getContext(), component.getName());
			for (TestSuiteRunner runner : runners) {
				List<TestResult> results = runner.call();
				for (TestResult result : results) {
					for (AssertionResult assertionResult : result.getAssertResults()) {
						switch (assertionResult.getAssertionState()) {
						case FAILED:
							AssertionFailed assertionFailed = (AssertionFailed) assertionResult;
							response.getAssertions().add((AssertionResult) EcoreUtil.copy((EObject) assertionFailed));
							break;
						case SUCCESS:
							AssertionSuccess assertionSuccess = (AssertionSuccess) assertionResult;
							response.getAssertions().add((AssertionResult) EcoreUtil.copy((EObject) assertionSuccess));
							break;
						}
					}
				}
			}
		}

		return response;
	}
} // RunTestImpl
