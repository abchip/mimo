/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document.impl;

import org.abchip.mimo.biz.content.document.Document;
import org.abchip.mimo.biz.content.document.DocumentAttribute;
import org.abchip.mimo.biz.content.document.DocumentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentAttributeImpl#getDocumentId <em>Document Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentAttributeImpl extends BizEntityImpl implements DocumentAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected String attrDescription = ATTR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentId() <em>Document Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected Document documentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.DOCUMENT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrDescription() {
		return attrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrDescription(String newAttrDescription) {
		attrDescription = newAttrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		attrName = newAttrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		attrValue = newAttrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document getDocumentId() {
		if (documentId != null && ((EObject)documentId).eIsProxy()) {
			InternalEObject oldDocumentId = (InternalEObject)documentId;
			documentId = (Document)eResolveProxy(oldDocumentId);
			if (documentId != oldDocumentId) {
			}
		}
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocumentId() {
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentId(Document newDocumentId) {
		documentId = newDocumentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_NAME:
				return getAttrName();
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_DESCRIPTION:
				return getAttrDescription();
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_VALUE:
				return getAttrValue();
			case DocumentPackage.DOCUMENT_ATTRIBUTE__DOCUMENT_ID:
				if (resolve) return getDocumentId();
				return basicGetDocumentId();
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
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription((String)newValue);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_VALUE:
				setAttrValue((String)newValue);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__DOCUMENT_ID:
				setDocumentId((Document)newValue);
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
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription(ATTR_DESCRIPTION_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT_ATTRIBUTE__DOCUMENT_ID:
				setDocumentId((Document)null);
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
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_DESCRIPTION:
				return ATTR_DESCRIPTION_EDEFAULT == null ? attrDescription != null : !ATTR_DESCRIPTION_EDEFAULT.equals(attrDescription);
			case DocumentPackage.DOCUMENT_ATTRIBUTE__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
			case DocumentPackage.DOCUMENT_ATTRIBUTE__DOCUMENT_ID:
				return documentId != null;
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
		result.append(" (attrName: ");
		result.append(attrName);
		result.append(", attrDescription: ");
		result.append(attrDescription);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(')');
		return result.toString();
	}

} //DocumentAttributeImpl
