/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.audit.impl;

import java.util.Date;

import org.abchip.mimo.biz.entity.audit.AuditPackage;
import org.abchip.mimo.biz.entity.audit.EntityAuditLog;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Audit Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getAuditHistorySeqId <em>Audit History Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getChangedByInfo <em>Changed By Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getChangedEntityName <em>Changed Entity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getChangedFieldName <em>Changed Field Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getChangedSessionInfo <em>Changed Session Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getNewValueText <em>New Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getOldValueText <em>Old Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl#getPkCombinedValueText <em>Pk Combined Value Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityAuditLogImpl extends BizEntityImpl implements EntityAuditLog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAuditHistorySeqId() <em>Audit History Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditHistorySeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIT_HISTORY_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditHistorySeqId() <em>Audit History Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditHistorySeqId()
	 * @generated
	 * @ordered
	 */
	protected String auditHistorySeqId = AUDIT_HISTORY_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedByInfo() <em>Changed By Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedByInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_BY_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedByInfo() <em>Changed By Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedByInfo()
	 * @generated
	 * @ordered
	 */
	protected String changedByInfo = CHANGED_BY_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedDate() <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedDate() <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedDate()
	 * @generated
	 * @ordered
	 */
	protected Date changedDate = CHANGED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedEntityName() <em>Changed Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedEntityName() <em>Changed Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedEntityName()
	 * @generated
	 * @ordered
	 */
	protected String changedEntityName = CHANGED_ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedFieldName() <em>Changed Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedFieldName() <em>Changed Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedFieldName()
	 * @generated
	 * @ordered
	 */
	protected String changedFieldName = CHANGED_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedSessionInfo() <em>Changed Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedSessionInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_SESSION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedSessionInfo() <em>Changed Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedSessionInfo()
	 * @generated
	 * @ordered
	 */
	protected String changedSessionInfo = CHANGED_SESSION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValueText() <em>New Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueText()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VALUE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewValueText() <em>New Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueText()
	 * @generated
	 * @ordered
	 */
	protected String newValueText = NEW_VALUE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldValueText() <em>Old Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValueText()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VALUE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldValueText() <em>Old Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValueText()
	 * @generated
	 * @ordered
	 */
	protected String oldValueText = OLD_VALUE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPkCombinedValueText() <em>Pk Combined Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkCombinedValueText()
	 * @generated
	 * @ordered
	 */
	protected static final String PK_COMBINED_VALUE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPkCombinedValueText() <em>Pk Combined Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkCombinedValueText()
	 * @generated
	 * @ordered
	 */
	protected String pkCombinedValueText = PK_COMBINED_VALUE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAuditLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuditPackage.Literals.ENTITY_AUDIT_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuditHistorySeqId() {
		return auditHistorySeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditHistorySeqId(String newAuditHistorySeqId) {
		String oldAuditHistorySeqId = auditHistorySeqId;
		auditHistorySeqId = newAuditHistorySeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID, oldAuditHistorySeqId, auditHistorySeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedByInfo() {
		return changedByInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedByInfo(String newChangedByInfo) {
		String oldChangedByInfo = changedByInfo;
		changedByInfo = newChangedByInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__CHANGED_BY_INFO, oldChangedByInfo, changedByInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangedDate() {
		return changedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedDate(Date newChangedDate) {
		Date oldChangedDate = changedDate;
		changedDate = newChangedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__CHANGED_DATE, oldChangedDate, changedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedEntityName() {
		return changedEntityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedEntityName(String newChangedEntityName) {
		String oldChangedEntityName = changedEntityName;
		changedEntityName = newChangedEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME, oldChangedEntityName, changedEntityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedFieldName() {
		return changedFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedFieldName(String newChangedFieldName) {
		String oldChangedFieldName = changedFieldName;
		changedFieldName = newChangedFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME, oldChangedFieldName, changedFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedSessionInfo() {
		return changedSessionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedSessionInfo(String newChangedSessionInfo) {
		String oldChangedSessionInfo = changedSessionInfo;
		changedSessionInfo = newChangedSessionInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO, oldChangedSessionInfo, changedSessionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewValueText() {
		return newValueText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValueText(String newNewValueText) {
		String oldNewValueText = newValueText;
		newValueText = newNewValueText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT, oldNewValueText, newValueText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldValueText() {
		return oldValueText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldValueText(String newOldValueText) {
		String oldOldValueText = oldValueText;
		oldValueText = newOldValueText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT, oldOldValueText, oldValueText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkCombinedValueText() {
		return pkCombinedValueText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkCombinedValueText(String newPkCombinedValueText) {
		String oldPkCombinedValueText = pkCombinedValueText;
		pkCombinedValueText = newPkCombinedValueText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT, oldPkCombinedValueText, pkCombinedValueText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuditPackage.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID:
				return getAuditHistorySeqId();
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_BY_INFO:
				return getChangedByInfo();
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_DATE:
				return getChangedDate();
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME:
				return getChangedEntityName();
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME:
				return getChangedFieldName();
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO:
				return getChangedSessionInfo();
			case AuditPackage.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT:
				return getNewValueText();
			case AuditPackage.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT:
				return getOldValueText();
			case AuditPackage.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT:
				return getPkCombinedValueText();
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
			case AuditPackage.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID:
				setAuditHistorySeqId((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_BY_INFO:
				setChangedByInfo((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_DATE:
				setChangedDate((Date)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME:
				setChangedEntityName((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME:
				setChangedFieldName((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO:
				setChangedSessionInfo((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT:
				setNewValueText((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT:
				setOldValueText((String)newValue);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT:
				setPkCombinedValueText((String)newValue);
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
			case AuditPackage.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID:
				setAuditHistorySeqId(AUDIT_HISTORY_SEQ_ID_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_BY_INFO:
				setChangedByInfo(CHANGED_BY_INFO_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_DATE:
				setChangedDate(CHANGED_DATE_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME:
				setChangedEntityName(CHANGED_ENTITY_NAME_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME:
				setChangedFieldName(CHANGED_FIELD_NAME_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO:
				setChangedSessionInfo(CHANGED_SESSION_INFO_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT:
				setNewValueText(NEW_VALUE_TEXT_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT:
				setOldValueText(OLD_VALUE_TEXT_EDEFAULT);
				return;
			case AuditPackage.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT:
				setPkCombinedValueText(PK_COMBINED_VALUE_TEXT_EDEFAULT);
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
			case AuditPackage.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID:
				return AUDIT_HISTORY_SEQ_ID_EDEFAULT == null ? auditHistorySeqId != null : !AUDIT_HISTORY_SEQ_ID_EDEFAULT.equals(auditHistorySeqId);
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_BY_INFO:
				return CHANGED_BY_INFO_EDEFAULT == null ? changedByInfo != null : !CHANGED_BY_INFO_EDEFAULT.equals(changedByInfo);
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_DATE:
				return CHANGED_DATE_EDEFAULT == null ? changedDate != null : !CHANGED_DATE_EDEFAULT.equals(changedDate);
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME:
				return CHANGED_ENTITY_NAME_EDEFAULT == null ? changedEntityName != null : !CHANGED_ENTITY_NAME_EDEFAULT.equals(changedEntityName);
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME:
				return CHANGED_FIELD_NAME_EDEFAULT == null ? changedFieldName != null : !CHANGED_FIELD_NAME_EDEFAULT.equals(changedFieldName);
			case AuditPackage.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO:
				return CHANGED_SESSION_INFO_EDEFAULT == null ? changedSessionInfo != null : !CHANGED_SESSION_INFO_EDEFAULT.equals(changedSessionInfo);
			case AuditPackage.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT:
				return NEW_VALUE_TEXT_EDEFAULT == null ? newValueText != null : !NEW_VALUE_TEXT_EDEFAULT.equals(newValueText);
			case AuditPackage.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT:
				return OLD_VALUE_TEXT_EDEFAULT == null ? oldValueText != null : !OLD_VALUE_TEXT_EDEFAULT.equals(oldValueText);
			case AuditPackage.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT:
				return PK_COMBINED_VALUE_TEXT_EDEFAULT == null ? pkCombinedValueText != null : !PK_COMBINED_VALUE_TEXT_EDEFAULT.equals(pkCombinedValueText);
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
		result.append(" (auditHistorySeqId: ");
		result.append(auditHistorySeqId);
		result.append(", changedByInfo: ");
		result.append(changedByInfo);
		result.append(", changedDate: ");
		result.append(changedDate);
		result.append(", changedEntityName: ");
		result.append(changedEntityName);
		result.append(", changedFieldName: ");
		result.append(changedFieldName);
		result.append(", changedSessionInfo: ");
		result.append(changedSessionInfo);
		result.append(", newValueText: ");
		result.append(newValueText);
		result.append(", oldValueText: ");
		result.append(oldValueText);
		result.append(", pkCombinedValueText: ");
		result.append(pkCombinedValueText);
		result.append(')');
		return result.toString();
	}

} //EntityAuditLogImpl
