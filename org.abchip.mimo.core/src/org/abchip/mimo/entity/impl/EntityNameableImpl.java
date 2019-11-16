/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Nameable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Object
 * Nameable</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityNameableImpl extends EntityImpl implements EntityNameable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityNameableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_NAMEABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(this).toString());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isProxy() {
		return eIsProxy();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getName() {

		StringBuffer name = new StringBuffer();

		Frame<?> frame = isa();
		for (String key : frame.getKeys()) {
			if (!name.toString().isEmpty())
				name.append("/");
			Object value = frame.getValue(this, key, false);
			if (value instanceof EntityNameable)
				name.append(((EntityNameable) value).getName());
			else
				name.append(value);
		}

		if (name.toString().isEmpty())
			throw new UnsupportedOperationException();

		return name.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Nameable.class) {
			switch (baseOperationID) {
				case EntityPackage.NAMEABLE___GET_NAME: return EntityPackage.ENTITY_NAMEABLE___GET_NAME;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EntityPackage.ENTITY_NAMEABLE___GET_URI:
				return getURI();
			case EntityPackage.ENTITY_NAMEABLE___IS_PROXY:
				return isProxy();
			case EntityPackage.ENTITY_NAMEABLE___GET_NAME:
				return getName();
		}
		return super.eInvoke(operationID, arguments);
	}

} // EntityNameableImpl
