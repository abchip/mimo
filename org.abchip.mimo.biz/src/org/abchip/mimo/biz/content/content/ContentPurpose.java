/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurpose#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurpose#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurpose#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurpose()
 * @model
 * @generated
 */
public interface ContentPurpose extends BizEntityTyped<ContentPurposeType> {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' reference.
	 * @see #setContentId(Content)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurpose_ContentId()
	 * @model keys="contentId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	Content getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurpose#getContentId <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' reference.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Content Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Purpose Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #setContentPurposeTypeId(ContentPurposeType)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurpose_ContentPurposeTypeId()
	 * @model keys="contentPurposeTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	ContentPurposeType getContentPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurpose#getContentPurposeTypeId <em>Content Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #getContentPurposeTypeId()
	 * @generated
	 */
	void setContentPurposeTypeId(ContentPurposeType value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurpose_SequenceNum()
	 * @model annotation="mimo-ent-format type='numeric' precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurpose#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

} // ContentPurpose
