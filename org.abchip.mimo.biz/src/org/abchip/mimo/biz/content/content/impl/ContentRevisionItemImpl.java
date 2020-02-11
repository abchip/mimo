/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
		return (String)eGet(ContentPackage.Literals.CONTENT_REVISION_ITEM__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(ContentPackage.Literals.CONTENT_REVISION_ITEM__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentRevisionSeqId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentRevisionSeqId(String newContentRevisionSeqId) {
		eSet(ContentPackage.Literals.CONTENT_REVISION_ITEM__CONTENT_REVISION_SEQ_ID, newContentRevisionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemContentId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemContentId(String newItemContentId) {
		eSet(ContentPackage.Literals.CONTENT_REVISION_ITEM__ITEM_CONTENT_ID, newItemContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getNewDataResourceId() {
		return (DataResource)eGet(ContentPackage.Literals.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewDataResourceId(DataResource newNewDataResourceId) {
		eSet(ContentPackage.Literals.CONTENT_REVISION_ITEM__NEW_DATA_RESOURCE_ID, newNewDataResourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getOldDataResourceId() {
		return (DataResource)eGet(ContentPackage.Literals.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldDataResourceId(DataResource newOldDataResourceId) {
		eSet(ContentPackage.Literals.CONTENT_REVISION_ITEM__OLD_DATA_RESOURCE_ID, newOldDataResourceId);
	}

} //ContentRevisionItemImpl
