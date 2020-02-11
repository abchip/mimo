/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.sequence;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Value Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSeqName <em>Seq Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSeqId <em>Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSequencePolicy <em>Sequence Policy</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.sequence.SequencePackage#getSequenceValueItem()
 * @model
 * @generated
 */
public interface SequenceValueItem extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Id</em>' attribute.
	 * @see #setSeqId(long)
	 * @see org.abchip.mimo.biz.entity.sequence.SequencePackage#getSequenceValueItem_SeqId()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSeqId <em>Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Id</em>' attribute.
	 * @see #getSeqId()
	 * @generated
	 */
	void setSeqId(long value);

	/**
	 * Returns the value of the '<em><b>Sequence Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Policy</em>' attribute.
	 * @see #setSequencePolicy(String)
	 * @see org.abchip.mimo.biz.entity.sequence.SequencePackage#getSequenceValueItem_SequencePolicy()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSequencePolicy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSequencePolicy <em>Sequence Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Policy</em>' attribute.
	 * @see #getSequencePolicy()
	 * @generated
	 */
	void setSequencePolicy(String value);

	/**
	 * Returns the value of the '<em><b>Seq Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Name</em>' attribute.
	 * @see #setSeqName(String)
	 * @see org.abchip.mimo.biz.entity.sequence.SequencePackage#getSequenceValueItem_SeqName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSeqName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.sequence.SequenceValueItem#getSeqName <em>Seq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Name</em>' attribute.
	 * @see #getSeqName()
	 * @generated
	 */
	void setSeqName(String value);

} // SequenceValueItem
