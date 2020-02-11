/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTestFieldTypeId <em>Test Field Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getBlobField <em>Blob Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getByteArrayField <em>Byte Array Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getClobField <em>Clob Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateField <em>Date Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateTimeField <em>Date Time Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFixedPointField <em>Fixed Point Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFloatingPointField <em>Floating Point Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getNumericField <em>Numeric Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTimeField <em>Time Field</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType()
 * @model annotation="mimo-ent-frame help='An entity for testing the field data types' title='Entity for testing the field data types'"
 * @generated
 */
public interface TestFieldType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Blob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blob Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blob Field</em>' attribute.
	 * @see #setBlobField(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_BlobField()
	 * @model
	 * @generated
	 */
	String getBlobField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getBlobField <em>Blob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob Field</em>' attribute.
	 * @see #getBlobField()
	 * @generated
	 */
	void setBlobField(String value);

	/**
	 * Returns the value of the '<em><b>Byte Array Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array Field</em>' attribute.
	 * @see #setByteArrayField(byte[])
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_ByteArrayField()
	 * @model
	 * @generated
	 */
	byte[] getByteArrayField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getByteArrayField <em>Byte Array Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array Field</em>' attribute.
	 * @see #getByteArrayField()
	 * @generated
	 */
	void setByteArrayField(byte[] value);

	/**
	 * Returns the value of the '<em><b>Clob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clob Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clob Field</em>' attribute.
	 * @see #setClobField(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_ClobField()
	 * @model
	 * @generated
	 */
	String getClobField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getClobField <em>Clob Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clob Field</em>' attribute.
	 * @see #getClobField()
	 * @generated
	 */
	void setClobField(String value);

	/**
	 * Returns the value of the '<em><b>Date Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Field</em>' attribute.
	 * @see #setDateField(Date)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_DateField()
	 * @model
	 * @generated
	 */
	Date getDateField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateField <em>Date Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Field</em>' attribute.
	 * @see #getDateField()
	 * @generated
	 */
	void setDateField(Date value);

	/**
	 * Returns the value of the '<em><b>Date Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Field</em>' attribute.
	 * @see #setDateTimeField(Date)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_DateTimeField()
	 * @model
	 * @generated
	 */
	Date getDateTimeField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateTimeField <em>Date Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Field</em>' attribute.
	 * @see #getDateTimeField()
	 * @generated
	 */
	void setDateTimeField(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Point Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Point Field</em>' attribute.
	 * @see #setFixedPointField(BigDecimal)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_FixedPointField()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getFixedPointField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFixedPointField <em>Fixed Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Point Field</em>' attribute.
	 * @see #getFixedPointField()
	 * @generated
	 */
	void setFixedPointField(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Floating Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Point Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Point Field</em>' attribute.
	 * @see #setFloatingPointField(double)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_FloatingPointField()
	 * @model
	 * @generated
	 */
	double getFloatingPointField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFloatingPointField <em>Floating Point Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Point Field</em>' attribute.
	 * @see #getFloatingPointField()
	 * @generated
	 */
	void setFloatingPointField(double value);

	/**
	 * Returns the value of the '<em><b>Numeric Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Field</em>' attribute.
	 * @see #setNumericField(long)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_NumericField()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumericField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getNumericField <em>Numeric Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Field</em>' attribute.
	 * @see #getNumericField()
	 * @generated
	 */
	void setNumericField(long value);

	/**
	 * Returns the value of the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Field</em>' attribute.
	 * @see #setObjectField(Object)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_ObjectField()
	 * @model
	 * @generated
	 */
	Object getObjectField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getObjectField <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Field</em>' attribute.
	 * @see #getObjectField()
	 * @generated
	 */
	void setObjectField(Object value);

	/**
	 * Returns the value of the '<em><b>Test Field Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Field Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Field Type Id</em>' attribute.
	 * @see #setTestFieldTypeId(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_TestFieldTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestFieldTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTestFieldTypeId <em>Test Field Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Field Type Id</em>' attribute.
	 * @see #getTestFieldTypeId()
	 * @generated
	 */
	void setTestFieldTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Field</em>' attribute.
	 * @see #setTimeField(Date)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestFieldType_TimeField()
	 * @model
	 * @generated
	 */
	Date getTimeField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTimeField <em>Time Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Field</em>' attribute.
	 * @see #getTimeField()
	 * @generated
	 */
	void setTimeField(Date value);

} // TestFieldType
