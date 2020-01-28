/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.data.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Slot</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Slot#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getDataDef <em>Data Def</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isKey <em>Key</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Slot#isToString <em>To String</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getSlot()
 * @model abstract="true"
 * @generated
 */
public interface Slot extends EntityIdentifiable {

	public final static String NS_PREFIX_SLOT = EntityPackage.eNS_PREFIX + "-slot";
	public final static String NS_PREFIX_SLOT_MAPPING = NS_PREFIX_SLOT + "-mapping";
	public final static String NS_PREFIX_FORMAT = EntityPackage.eNS_PREFIX + "-format";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>To String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To String</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To String</em>' attribute.
	 * @see #setToString(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_ToString()
	 * @model
	 * @generated
	 */
	boolean isToString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#isToString <em>To String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String</em>' attribute.
	 * @see #isToString()
	 * @generated
	 */
	void setToString(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Cardinality()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#isContainment
	 * <em>Containment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Def</em>' containment reference.
	 * @see #setDataDef(DataDef)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_DataDef()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	DataDef<?> getDataDef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getDataDef <em>Data Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Def</em>' containment reference.
	 * @see #getDataDef()
	 * @generated
	 */
	void setDataDef(DataDef<?> value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getDefaultValue
	 * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(Domain)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Domain()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getSlot_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Slot#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);
} // Slot
