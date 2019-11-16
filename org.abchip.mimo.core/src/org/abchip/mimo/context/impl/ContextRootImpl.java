/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Dictionary;
import java.util.List;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.ContextRoot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ContextRootImpl extends ContextImpl implements ContextRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createChildContext(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createChildContext(ContextDescription contextDescription) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> T get(Class<T> klass, String filter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> List<T> getAll(Class<T> klass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> List<T> getAll(Class<T> klass, String filter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<?> loadClass(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set(String name, Object object, boolean remoteExport, Dictionary<String, String> dictionary) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContextPackage.CONTEXT_ROOT___CREATE_CHILD_CONTEXT__STRING:
				return createChildContext((String)arguments.get(0));
			case ContextPackage.CONTEXT_ROOT___CREATE_CHILD_CONTEXT__CONTEXTDESCRIPTION:
				return createChildContext((ContextDescription)arguments.get(0));
			case ContextPackage.CONTEXT_ROOT___GET__CLASS_STRING:
				return get((Class)arguments.get(0), (String)arguments.get(1));
			case ContextPackage.CONTEXT_ROOT___GET_ALL__CLASS:
				return getAll((Class)arguments.get(0));
			case ContextPackage.CONTEXT_ROOT___GET_ALL__CLASS_STRING:
				return getAll((Class)arguments.get(0), (String)arguments.get(1));
			case ContextPackage.CONTEXT_ROOT___LOAD_CLASS__STRING:
				return loadClass((String)arguments.get(0));
			case ContextPackage.CONTEXT_ROOT___SET__STRING_OBJECT_BOOLEAN_DICTIONARY:
				set((String)arguments.get(0), arguments.get(1), (Boolean)arguments.get(2), (Dictionary<String, String>)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContextRootImpl
