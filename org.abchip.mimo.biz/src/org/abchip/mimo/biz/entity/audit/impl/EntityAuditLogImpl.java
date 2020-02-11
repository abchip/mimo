/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditHistorySeqId(String newAuditHistorySeqId) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID, newAuditHistorySeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedByInfo() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_BY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedByInfo(String newChangedByInfo) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_BY_INFO, newChangedByInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangedDate() {
		return (Date)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedDate(Date newChangedDate) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_DATE, newChangedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedEntityName() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedEntityName(String newChangedEntityName) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME, newChangedEntityName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedFieldName() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedFieldName(String newChangedFieldName) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME, newChangedFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedSessionInfo() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedSessionInfo(String newChangedSessionInfo) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO, newChangedSessionInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValueText(String newNewValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT, newNewValueText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldValueText(String newOldValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT, newOldValueText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkCombinedValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkCombinedValueText(String newPkCombinedValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT, newPkCombinedValueText);
	}

} //EntityAuditLogImpl
