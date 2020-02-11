/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.data.DataResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Revision Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getItemContentId <em>Item Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getNewDataResourceId <em>New Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getOldDataResourceId <em>Old Data Resource Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem()
 * @model annotation="mimo-ent-frame title='Content Revision'"
 * @generated
 */
public interface ContentRevisionItem extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem_ContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Content Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Revision Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #setContentRevisionSeqId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem_ContentRevisionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getContentRevisionSeqId <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #getContentRevisionSeqId()
	 * @generated
	 */
	void setContentRevisionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Item Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Content Id</em>' attribute.
	 * @see #setItemContentId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem_ItemContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getItemContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getItemContentId <em>Item Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Content Id</em>' attribute.
	 * @see #getItemContentId()
	 * @generated
	 */
	void setItemContentId(String value);

	/**
	 * Returns the value of the '<em><b>New Data Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data Resource Id</em>' reference.
	 * @see #setNewDataResourceId(DataResource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem_NewDataResourceId()
	 * @model keys="dataResourceId"
	 * @generated
	 */
	DataResource getNewDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getNewDataResourceId <em>New Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data Resource Id</em>' reference.
	 * @see #getNewDataResourceId()
	 * @generated
	 */
	void setNewDataResourceId(DataResource value);

	/**
	 * Returns the value of the '<em><b>Old Data Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Data Resource Id</em>' reference.
	 * @see #setOldDataResourceId(DataResource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevisionItem_OldDataResourceId()
	 * @model keys="dataResourceId"
	 * @generated
	 */
	DataResource getOldDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevisionItem#getOldDataResourceId <em>Old Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Data Resource Id</em>' reference.
	 * @see #getOldDataResourceId()
	 * @generated
	 */
	void setOldDataResourceId(DataResource value);

} // ContentRevisionItem
