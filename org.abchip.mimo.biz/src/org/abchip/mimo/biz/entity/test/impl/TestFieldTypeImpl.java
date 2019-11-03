/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getTestFieldTypeId() <em>Test Field Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestFieldTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_FIELD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestFieldTypeId() <em>Test Field Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestFieldTypeId()
	 * @generated
	 * @ordered
	 */
	protected String testFieldTypeId = TEST_FIELD_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBlobField() <em>Blob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlobField()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOB_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBlobField() <em>Blob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlobField()
	 * @generated
	 * @ordered
	 */
	protected String blobField = BLOB_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getByteArrayField() <em>Byte Array Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArrayField()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_ARRAY_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getByteArrayField() <em>Byte Array Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArrayField()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteArrayField = BYTE_ARRAY_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getClobField() <em>Clob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClobField()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOB_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClobField() <em>Clob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClobField()
	 * @generated
	 * @ordered
	 */
	protected String clobField = CLOB_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateField() <em>Date Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateField()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateField() <em>Date Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateField()
	 * @generated
	 * @ordered
	 */
	protected Date dateField = DATE_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateTimeField() <em>Date Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeField()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateTimeField() <em>Date Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeField()
	 * @generated
	 * @ordered
	 */
	protected Date dateTimeField = DATE_TIME_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getFixedPointField() <em>Fixed Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPointField()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FIXED_POINT_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedPointField() <em>Fixed Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPointField()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fixedPointField = FIXED_POINT_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getFloatingPointField() <em>Floating Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingPointField()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOATING_POINT_FIELD_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFloatingPointField() <em>Floating Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingPointField()
	 * @generated
	 * @ordered
	 */
	protected double floatingPointField = FLOATING_POINT_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumericField() <em>Numeric Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericField()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERIC_FIELD_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getNumericField() <em>Numeric Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericField()
	 * @generated
	 * @ordered
	 */
	protected long numericField = NUMERIC_FIELD_EDEFAULT;
	/**
	 * The default value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected Object objectField = OBJECT_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeField() <em>Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeField()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeField() <em>Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeField()
	 * @generated
	 * @ordered
	 */
	protected Date timeField = TIME_FIELD_EDEFAULT;

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
		return blobField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlobField(String newBlobField) {
		String oldBlobField = blobField;
		blobField = newBlobField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__BLOB_FIELD, oldBlobField, blobField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getByteArrayField() {
		return byteArrayField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteArrayField(byte[] newByteArrayField) {
		byte[] oldByteArrayField = byteArrayField;
		byteArrayField = newByteArrayField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD, oldByteArrayField, byteArrayField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClobField() {
		return clobField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClobField(String newClobField) {
		String oldClobField = clobField;
		clobField = newClobField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__CLOB_FIELD, oldClobField, clobField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateField() {
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateField(Date newDateField) {
		Date oldDateField = dateField;
		dateField = newDateField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__DATE_FIELD, oldDateField, dateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeField() {
		return dateTimeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeField(Date newDateTimeField) {
		Date oldDateTimeField = dateTimeField;
		dateTimeField = newDateTimeField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__DATE_TIME_FIELD, oldDateTimeField, dateTimeField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedPointField() {
		return fixedPointField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedPointField(BigDecimal newFixedPointField) {
		BigDecimal oldFixedPointField = fixedPointField;
		fixedPointField = newFixedPointField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__FIXED_POINT_FIELD, oldFixedPointField, fixedPointField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloatingPointField() {
		return floatingPointField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatingPointField(double newFloatingPointField) {
		double oldFloatingPointField = floatingPointField;
		floatingPointField = newFloatingPointField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__FLOATING_POINT_FIELD, oldFloatingPointField, floatingPointField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumericField() {
		return numericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericField(long newNumericField) {
		long oldNumericField = numericField;
		numericField = newNumericField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__NUMERIC_FIELD, oldNumericField, numericField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getObjectField() {
		return objectField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectField(Object newObjectField) {
		Object oldObjectField = objectField;
		objectField = newObjectField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__OBJECT_FIELD, oldObjectField, objectField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestFieldTypeId() {
		return testFieldTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestFieldTypeId(String newTestFieldTypeId) {
		String oldTestFieldTypeId = testFieldTypeId;
		testFieldTypeId = newTestFieldTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID, oldTestFieldTypeId, testFieldTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimeField() {
		return timeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeField(Date newTimeField) {
		Date oldTimeField = timeField;
		timeField = newTimeField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD_TYPE__TIME_FIELD, oldTimeField, timeField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID:
				return getTestFieldTypeId();
			case TestPackage.TEST_FIELD_TYPE__BLOB_FIELD:
				return getBlobField();
			case TestPackage.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD:
				return getByteArrayField();
			case TestPackage.TEST_FIELD_TYPE__CLOB_FIELD:
				return getClobField();
			case TestPackage.TEST_FIELD_TYPE__DATE_FIELD:
				return getDateField();
			case TestPackage.TEST_FIELD_TYPE__DATE_TIME_FIELD:
				return getDateTimeField();
			case TestPackage.TEST_FIELD_TYPE__FIXED_POINT_FIELD:
				return getFixedPointField();
			case TestPackage.TEST_FIELD_TYPE__FLOATING_POINT_FIELD:
				return getFloatingPointField();
			case TestPackage.TEST_FIELD_TYPE__NUMERIC_FIELD:
				return getNumericField();
			case TestPackage.TEST_FIELD_TYPE__OBJECT_FIELD:
				return getObjectField();
			case TestPackage.TEST_FIELD_TYPE__TIME_FIELD:
				return getTimeField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID:
				setTestFieldTypeId((String)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__BLOB_FIELD:
				setBlobField((String)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD:
				setByteArrayField((byte[])newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__CLOB_FIELD:
				setClobField((String)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__DATE_FIELD:
				setDateField((Date)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__DATE_TIME_FIELD:
				setDateTimeField((Date)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__FIXED_POINT_FIELD:
				setFixedPointField((BigDecimal)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__FLOATING_POINT_FIELD:
				setFloatingPointField((Double)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__NUMERIC_FIELD:
				setNumericField((Long)newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__OBJECT_FIELD:
				setObjectField(newValue);
				return;
			case TestPackage.TEST_FIELD_TYPE__TIME_FIELD:
				setTimeField((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestPackage.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID:
				setTestFieldTypeId(TEST_FIELD_TYPE_ID_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__BLOB_FIELD:
				setBlobField(BLOB_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD:
				setByteArrayField(BYTE_ARRAY_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__CLOB_FIELD:
				setClobField(CLOB_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__DATE_FIELD:
				setDateField(DATE_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__DATE_TIME_FIELD:
				setDateTimeField(DATE_TIME_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__FIXED_POINT_FIELD:
				setFixedPointField(FIXED_POINT_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__FLOATING_POINT_FIELD:
				setFloatingPointField(FLOATING_POINT_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__NUMERIC_FIELD:
				setNumericField(NUMERIC_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__OBJECT_FIELD:
				setObjectField(OBJECT_FIELD_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD_TYPE__TIME_FIELD:
				setTimeField(TIME_FIELD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestPackage.TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID:
				return TEST_FIELD_TYPE_ID_EDEFAULT == null ? testFieldTypeId != null : !TEST_FIELD_TYPE_ID_EDEFAULT.equals(testFieldTypeId);
			case TestPackage.TEST_FIELD_TYPE__BLOB_FIELD:
				return BLOB_FIELD_EDEFAULT == null ? blobField != null : !BLOB_FIELD_EDEFAULT.equals(blobField);
			case TestPackage.TEST_FIELD_TYPE__BYTE_ARRAY_FIELD:
				return BYTE_ARRAY_FIELD_EDEFAULT == null ? byteArrayField != null : !BYTE_ARRAY_FIELD_EDEFAULT.equals(byteArrayField);
			case TestPackage.TEST_FIELD_TYPE__CLOB_FIELD:
				return CLOB_FIELD_EDEFAULT == null ? clobField != null : !CLOB_FIELD_EDEFAULT.equals(clobField);
			case TestPackage.TEST_FIELD_TYPE__DATE_FIELD:
				return DATE_FIELD_EDEFAULT == null ? dateField != null : !DATE_FIELD_EDEFAULT.equals(dateField);
			case TestPackage.TEST_FIELD_TYPE__DATE_TIME_FIELD:
				return DATE_TIME_FIELD_EDEFAULT == null ? dateTimeField != null : !DATE_TIME_FIELD_EDEFAULT.equals(dateTimeField);
			case TestPackage.TEST_FIELD_TYPE__FIXED_POINT_FIELD:
				return FIXED_POINT_FIELD_EDEFAULT == null ? fixedPointField != null : !FIXED_POINT_FIELD_EDEFAULT.equals(fixedPointField);
			case TestPackage.TEST_FIELD_TYPE__FLOATING_POINT_FIELD:
				return floatingPointField != FLOATING_POINT_FIELD_EDEFAULT;
			case TestPackage.TEST_FIELD_TYPE__NUMERIC_FIELD:
				return numericField != NUMERIC_FIELD_EDEFAULT;
			case TestPackage.TEST_FIELD_TYPE__OBJECT_FIELD:
				return OBJECT_FIELD_EDEFAULT == null ? objectField != null : !OBJECT_FIELD_EDEFAULT.equals(objectField);
			case TestPackage.TEST_FIELD_TYPE__TIME_FIELD:
				return TIME_FIELD_EDEFAULT == null ? timeField != null : !TIME_FIELD_EDEFAULT.equals(timeField);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testFieldTypeId: ");
		result.append(testFieldTypeId);
		result.append(", blobField: ");
		result.append(blobField);
		result.append(", byteArrayField: ");
		result.append(byteArrayField);
		result.append(", clobField: ");
		result.append(clobField);
		result.append(", dateField: ");
		result.append(dateField);
		result.append(", dateTimeField: ");
		result.append(dateTimeField);
		result.append(", fixedPointField: ");
		result.append(fixedPointField);
		result.append(", floatingPointField: ");
		result.append(floatingPointField);
		result.append(", numericField: ");
		result.append(numericField);
		result.append(", objectField: ");
		result.append(objectField);
		result.append(", timeField: ");
		result.append(timeField);
		result.append(')');
		return result.toString();
	}

} //TestFieldTypeImpl
