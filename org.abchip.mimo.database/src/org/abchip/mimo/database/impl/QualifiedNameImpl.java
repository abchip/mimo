/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.database.DatabasePackage;
import org.abchip.mimo.database.QualifiedName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Qualified Name</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.impl.QualifiedNameImpl#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedNameImpl extends MinimalEObjectImpl.Container implements QualifiedName {
	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> qualifiers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.QUALIFIED_NAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EDataTypeUniqueEList<String>(String.class, this, DatabasePackage.QUALIFIED_NAME__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getFirstQualifier() {

		if (getQualifiers().isEmpty())
			return null;

		return getQualifiers().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLastQualifier() {

		if (getQualifiers().isEmpty())
			return null;

		return getQualifiers().get(getQualifiers().size() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.QUALIFIED_NAME__QUALIFIERS:
				return getQualifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.QUALIFIED_NAME__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends String>)newValue);
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
			case DatabasePackage.QUALIFIED_NAME__QUALIFIERS:
				getQualifiers().clear();
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
			case DatabasePackage.QUALIFIED_NAME__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifiers: ");
		result.append(qualifiers);
		result.append(')');
		return result.toString();
	}

} // QualifiedNameImpl
