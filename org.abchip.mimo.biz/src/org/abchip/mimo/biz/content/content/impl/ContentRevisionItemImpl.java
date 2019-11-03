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
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getNewDataResourceId <em>New Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionItemImpl#getOldDataResourceId <em>Old Data Resource Id</em>}</li>
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
	 * The default value of the '{@link #getNewDataResourceId() <em>New Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewDataResourceId() <em>New Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String newDataResourceId = NEW_DATA_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldDataResourceId() <em>Old Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldDataResourceId() <em>Old Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String oldDataResourceId = OLD_DATA_RESOURCE_ID_EDEFAULT;

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
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION_ITEM__CONTENT_ID, oldContentId, contentId));
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
		String oldContentRevisionSeqId = contentRevisionSeqId;
		contentRevisionSeqId = newContentRevisionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID, oldContentRevisionSeqId, contentRevisionSeqId));
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
		String oldItemContentId = itemContentId;
		itemContentId = newItemContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID, oldItemContentId, itemContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewDataResourceId() {
		return newDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewDataResourceId(String newNewDataResourceId) {
		String oldNewDataResourceId = newDataResourceId;
		newDataResourceId = newNewDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID, oldNewDataResourceId, newDataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldDataResourceId() {
		return oldDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldDataResourceId(String newOldDataResourceId) {
		String oldOldDataResourceId = oldDataResourceId;
		oldDataResourceId = newOldDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID, oldOldDataResourceId, oldDataResourceId));
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
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				return getNewDataResourceId();
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				return getOldDataResourceId();
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
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				setNewDataResourceId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				setOldDataResourceId((String)newValue);
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
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				setNewDataResourceId(NEW_DATA_RESOURCE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				setOldDataResourceId(OLD_DATA_RESOURCE_ID_EDEFAULT);
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
			case ContentPackage.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID:
				return NEW_DATA_RESOURCE_ID_EDEFAULT == null ? newDataResourceId != null : !NEW_DATA_RESOURCE_ID_EDEFAULT.equals(newDataResourceId);
			case ContentPackage.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID:
				return OLD_DATA_RESOURCE_ID_EDEFAULT == null ? oldDataResourceId != null : !OLD_DATA_RESOURCE_ID_EDEFAULT.equals(oldDataResourceId);
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
		result.append(", newDataResourceId: ");
		result.append(newDataResourceId);
		result.append(", oldDataResourceId: ");
		result.append(oldDataResourceId);
		result.append(')');
		return result.toString();
	}

} //ContentRevisionItemImpl
