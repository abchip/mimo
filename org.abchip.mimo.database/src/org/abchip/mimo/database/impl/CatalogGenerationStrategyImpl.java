/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.impl;

import org.abchip.mimo.database.CatalogGenerationStrategy;
import org.abchip.mimo.database.DatabasePackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Catalog Generation Strategy</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl#isCreateIndexOnView <em>Create Index On View</em>}</li>
 *   <li>{@link org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogGenerationStrategyImpl extends EntityImpl implements CatalogGenerationStrategy {

	/**
	 * The default value of the '{@link #isCreateIndexOnView() <em>Create Index On View</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isCreateIndexOnView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_INDEX_ON_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateIndexOnView() <em>Create Index On View</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isCreateIndexOnView()
	 * @generated
	 * @ordered
	 */
	protected boolean createIndexOnView = CREATE_INDEX_ON_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateRelativeRecordNumber() <em>Create Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #isCreateRelativeRecordNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_RELATIVE_RECORD_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateRelativeRecordNumber() <em>Create Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #isCreateRelativeRecordNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean createRelativeRecordNumber = CREATE_RELATIVE_RECORD_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogGenerationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.CATALOG_GENERATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateIndexOnView() {
		return createIndexOnView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateIndexOnView(boolean newCreateIndexOnView) {
		boolean oldCreateIndexOnView = createIndexOnView;
		createIndexOnView = newCreateIndexOnView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW, oldCreateIndexOnView, createIndexOnView));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateRelativeRecordNumber() {
		return createRelativeRecordNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateRelativeRecordNumber(boolean newCreateRelativeRecordNumber) {
		boolean oldCreateRelativeRecordNumber = createRelativeRecordNumber;
		createRelativeRecordNumber = newCreateRelativeRecordNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER, oldCreateRelativeRecordNumber, createRelativeRecordNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW:
				return isCreateIndexOnView();
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER:
				return isCreateRelativeRecordNumber();
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
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW:
				setCreateIndexOnView((Boolean)newValue);
				return;
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER:
				setCreateRelativeRecordNumber((Boolean)newValue);
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
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW:
				setCreateIndexOnView(CREATE_INDEX_ON_VIEW_EDEFAULT);
				return;
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER:
				setCreateRelativeRecordNumber(CREATE_RELATIVE_RECORD_NUMBER_EDEFAULT);
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
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW:
				return createIndexOnView != CREATE_INDEX_ON_VIEW_EDEFAULT;
			case DatabasePackage.CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER:
				return createRelativeRecordNumber != CREATE_RELATIVE_RECORD_NUMBER_EDEFAULT;
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
		result.append(" (createIndexOnView: ");
		result.append(createIndexOnView);
		result.append(", createRelativeRecordNumber: ");
		result.append(createRelativeRecordNumber);
		result.append(')');
		return result.toString();
	}

} // CatalogGenerationStrategyImpl
