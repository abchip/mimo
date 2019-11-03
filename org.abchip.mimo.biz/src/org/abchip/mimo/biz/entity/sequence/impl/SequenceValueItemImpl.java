/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.sequence.impl;

import org.abchip.mimo.biz.entity.sequence.SequencePackage;
import org.abchip.mimo.biz.entity.sequence.SequenceValueItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getSeqName() <em>Seq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeqName() <em>Seq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqName()
	 * @generated
	 * @ordered
	 */
	protected String seqName = SEQ_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeqId() <em>Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQ_ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getSeqId() <em>Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqId()
	 * @generated
	 * @ordered
	 */
	protected long seqId = SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequencePolicy() <em>Sequence Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_POLICY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSequencePolicy() <em>Sequence Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencePolicy()
	 * @generated
	 * @ordered
	 */
	protected String sequencePolicy = SEQUENCE_POLICY_EDEFAULT;

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
		return seqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeqId(long newSeqId) {
		long oldSeqId = seqId;
		seqId = newSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_ID, oldSeqId, seqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequencePolicy() {
		return sequencePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequencePolicy(String newSequencePolicy) {
		String oldSequencePolicy = sequencePolicy;
		sequencePolicy = newSequencePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY, oldSequencePolicy, sequencePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeqName() {
		return seqName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeqName(String newSeqName) {
		String oldSeqName = seqName;
		seqName = newSeqName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_NAME, oldSeqName, seqName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_NAME:
				return getSeqName();
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_ID:
				return getSeqId();
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY:
				return getSequencePolicy();
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
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_NAME:
				setSeqName((String)newValue);
				return;
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_ID:
				setSeqId((Long)newValue);
				return;
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY:
				setSequencePolicy((String)newValue);
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
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_NAME:
				setSeqName(SEQ_NAME_EDEFAULT);
				return;
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_ID:
				setSeqId(SEQ_ID_EDEFAULT);
				return;
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY:
				setSequencePolicy(SEQUENCE_POLICY_EDEFAULT);
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
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_NAME:
				return SEQ_NAME_EDEFAULT == null ? seqName != null : !SEQ_NAME_EDEFAULT.equals(seqName);
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQ_ID:
				return seqId != SEQ_ID_EDEFAULT;
			case SequencePackage.SEQUENCE_VALUE_ITEM__SEQUENCE_POLICY:
				return SEQUENCE_POLICY_EDEFAULT == null ? sequencePolicy != null : !SEQUENCE_POLICY_EDEFAULT.equals(sequencePolicy);
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
		result.append(" (seqName: ");
		result.append(seqName);
		result.append(", seqId: ");
		result.append(seqId);
		result.append(", sequencePolicy: ");
		result.append(sequencePolicy);
		result.append(')');
		return result.toString();
	}

} //SequenceValueItemImpl
