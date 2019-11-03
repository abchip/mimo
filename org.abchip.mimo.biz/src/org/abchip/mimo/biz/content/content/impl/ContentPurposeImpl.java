/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentPurpose;
import org.abchip.mimo.biz.content.content.ContentPurposeType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeImpl#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentPurposeImpl extends BizEntityTypedImpl<ContentPurposeType> implements ContentPurpose {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PURPOSE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contentPurposeTypeId = CONTENT_PURPOSE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentPurposeTypeId() {
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(String newContentPurposeTypeId) {
		String oldContentPurposeTypeId = contentPurposeTypeId;
		contentPurposeTypeId = newContentPurposeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE_ID, oldContentPurposeTypeId, contentPurposeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_PURPOSE__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				return getContentPurposeTypeId();
			case ContentPackage.CONTENT_PURPOSE__SEQUENCE_NUM:
				return getSequenceNum();
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
			case ContentPackage.CONTENT_PURPOSE__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case ContentPackage.CONTENT_PURPOSE__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId(CONTENT_PURPOSE_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case ContentPackage.CONTENT_PURPOSE__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				return CONTENT_PURPOSE_TYPE_ID_EDEFAULT == null ? contentPurposeTypeId != null : !CONTENT_PURPOSE_TYPE_ID_EDEFAULT.equals(contentPurposeTypeId);
			case ContentPackage.CONTENT_PURPOSE__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", contentPurposeTypeId: ");
		result.append(contentPurposeTypeId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //ContentPurposeImpl
