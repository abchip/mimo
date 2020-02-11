/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.entity.test.TestFieldType;
import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getTestFieldTypeId <em>Test Field Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getBlobField <em>Blob Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getByteArrayField <em>Byte Array Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getClobField <em>Clob Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getDateField <em>Date Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getDateTimeField <em>Date Time Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getFixedPointField <em>Fixed Point Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getFloatingPointField <em>Floating Point Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getNumericField <em>Numeric Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl#getTimeField <em>Time Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestFieldTypeImpl extends BizEntityImpl implements TestFieldType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_FIELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlobField() {
		return (String)eGet(TestPackage.Literals.TEST_FIELD_TYPE__BLOB_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlobField(String newBlobField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__BLOB_FIELD, newBlobField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getByteArrayField() {
		return (byte[])eGet(TestPackage.Literals.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteArrayField(byte[] newByteArrayField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD, newByteArrayField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClobField() {
		return (String)eGet(TestPackage.Literals.TEST_FIELD_TYPE__CLOB_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClobField(String newClobField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__CLOB_FIELD, newClobField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateField() {
		return (Date)eGet(TestPackage.Literals.TEST_FIELD_TYPE__DATE_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateField(Date newDateField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__DATE_FIELD, newDateField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeField() {
		return (Date)eGet(TestPackage.Literals.TEST_FIELD_TYPE__DATE_TIME_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeField(Date newDateTimeField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__DATE_TIME_FIELD, newDateTimeField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedPointField() {
		return (BigDecimal)eGet(TestPackage.Literals.TEST_FIELD_TYPE__FIXED_POINT_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedPointField(BigDecimal newFixedPointField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__FIXED_POINT_FIELD, newFixedPointField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloatingPointField() {
		return (Double)eGet(TestPackage.Literals.TEST_FIELD_TYPE__FLOATING_POINT_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatingPointField(double newFloatingPointField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__FLOATING_POINT_FIELD, newFloatingPointField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumericField() {
		return (Long)eGet(TestPackage.Literals.TEST_FIELD_TYPE__NUMERIC_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericField(long newNumericField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__NUMERIC_FIELD, newNumericField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getObjectField() {
		return (Object)eGet(TestPackage.Literals.TEST_FIELD_TYPE__OBJECT_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectField(Object newObjectField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__OBJECT_FIELD, newObjectField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestFieldTypeId() {
		return (String)eGet(TestPackage.Literals.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestFieldTypeId(String newTestFieldTypeId) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID, newTestFieldTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimeField() {
		return (Date)eGet(TestPackage.Literals.TEST_FIELD_TYPE__TIME_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeField(Date newTimeField) {
		eSet(TestPackage.Literals.TEST_FIELD_TYPE__TIME_FIELD, newTimeField);
	}

} //TestFieldTypeImpl
