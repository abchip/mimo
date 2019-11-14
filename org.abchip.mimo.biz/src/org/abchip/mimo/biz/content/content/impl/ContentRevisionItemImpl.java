/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentRevisionItem;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Revision Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getItemContentId <em>Item Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getOldDataResourceId <em>Old Data ResourceDriver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getNewDataResourceId <em>New Data ResourceDriver Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentRevisionItemImpl extends BizEntityImpl implements ContentRevisionItem {
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
	 * The default value of the '{@link #getContentRevisionSeqId() <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_REVISION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentRevisionSeqId() <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String contentRevisionSeqId = CONTENT_REVISION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemContentId() <em>Item Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemContentId() <em>Item Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemContentId()
	 * @generated
	 * @ordered
	 */
	protected String itemContentId = ITEM_CONTENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOldDataResourceId() <em>Old Data ResourceDriver Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected DataResource oldDataResourceId;

	/**
	 * The cached value of the '{@link #getNewDataResourceId() <em>New Data ResourceDriver Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected DataResource newDataResourceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentRevisionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_REVISION_ITEM;
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
		contentId = newContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentRevisionSeqId() {
		return contentRevisionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentRevisionSeqId(String newContentRevisionSeqId) {
		contentRevisionSeqId = newContentRevisionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemContentId() {
		return itemContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemContentId(String newItemContentId) {
		itemContentId = newItemContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getNewDataResourceId() {
		if (newDataResourceId != null && ((EObject)newDataResourceId).eIsProxy()) {
			InternalEObject oldNewDataResourceId = (InternalEObject)newDataResourceId;
			newDataResourceId = (DataResource)eResolveProxy(oldNewDataResourceId);
			if (newDataResourceId != oldNewDataResourceId) {
			}
		}
		return newDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource basicGetNewDataResourceId() {
		return newDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewDataResourceId(DataResource newNewDataResourceId) {
		newDataResourceId = newNewDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getOldDataResourceId() {
		if (oldDataResourceId != null && ((EObject)oldDataResourceId).eIsProxy()) {
			InternalEObject oldOldDataResourceId = (InternalEObject)oldDataResourceId;
			oldDataResourceId = (DataResource)eResolveProxy(oldOldDataResourceId);
			if (oldDataResourceId != oldOldDataResourceId) {
			}
		}
		return oldDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource basicGetOldDataResourceId() {
		return oldDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldDataResourceId(DataResource newOldDataResourceId) {
		oldDataResourceId = newOldDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID:
				return getContentRevisionSeqId();
			case ContentPackage.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID:
				return getItemContentId();
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				if (resolve) return getOldDataResourceId();
				return basicGetOldDataResourceId();
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				if (resolve) return getNewDataResourceId();
				return basicGetNewDataResourceId();
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
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID:
				setItemContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				setOldDataResourceId((DataResource)newValue);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				setNewDataResourceId((DataResource)newValue);
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
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId(CONTENT_REVISION_SEQ_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID:
				setItemContentId(ITEM_CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				setOldDataResourceId((DataResource)null);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				setNewDataResourceId((DataResource)null);
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
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID:
				return CONTENT_REVISION_SEQ_ID_EDEFAULT == null ? contentRevisionSeqId != null : !CONTENT_REVISION_SEQ_ID_EDEFAULT.equals(contentRevisionSeqId);
			case ContentPackage.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID:
				return ITEM_CONTENT_ID_EDEFAULT == null ? itemContentId != null : !ITEM_CONTENT_ID_EDEFAULT.equals(itemContentId);
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				return oldDataResourceId != null;
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				return newDataResourceId != null;
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
		result.append(", contentRevisionSeqId: ");
		result.append(contentRevisionSeqId);
		result.append(", itemContentId: ");
		result.append(itemContentId);
		result.append(')');
		return result.toString();
	}

} //ContentRevisionItemImpl
