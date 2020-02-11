/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.sequence.impl;

import org.abchip.mimo.biz.entity.sequence.SequencePackage;
import org.abchip.mimo.biz.entity.sequence.SequenceValueItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Value Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.impl.SequenceValueItemImpl#getSeqName <em>Seq Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.impl.SequenceValueItemImpl#getSeqId <em>Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.sequence.impl.SequenceValueItemImpl#getSequencePolicy <em>Sequence Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceValueItemImpl extends BizEntityImpl implements SequenceValueItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceValueItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.SEQUENCE_VALUE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSeqId() {
		return (Long)eGet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeqId(long newSeqId) {
		eSet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQ_ID, newSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequencePolicy() {
		return (String)eGet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequencePolicy(String newSequencePolicy) {
		eSet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY, newSequencePolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeqName() {
		return (String)eGet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQ_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeqName(String newSeqName) {
		eSet(SequencePackage.Literals.SEQUENCE_VALUE_ITEM__SEQ_NAME, newSeqName);
	}

} //SequenceValueItemImpl
