/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevision#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevision#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevision#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentRevision#getCommittedByPartyId <em>Committed By Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevision()
 * @model
 * @generated
 */
public interface ContentRevision extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevision_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevision#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Committed By Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Committed By Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed By Party Id</em>' attribute.
	 * @see #setCommittedByPartyId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevision_CommittedByPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getCommittedByPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevision#getCommittedByPartyId <em>Committed By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed By Party Id</em>' attribute.
	 * @see #getCommittedByPartyId()
	 * @generated
	 */
	void setCommittedByPartyId(String value);

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
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevision_ContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevision#getContentId <em>Content Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentRevision_ContentRevisionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getContentRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentRevision#getContentRevisionSeqId <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision Seq Id</em>' attribute.
	 * @see #getContentRevisionSeqId()
	 * @generated
	 */
	void setContentRevisionSeqId(String value);

} // ContentRevision
