/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.audit;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Audit Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getAuditHistorySeqId <em>Audit History Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedByInfo <em>Changed By Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedEntityName <em>Changed Entity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedFieldName <em>Changed Field Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedSessionInfo <em>Changed Session Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getNewValueText <em>New Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getOldValueText <em>Old Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getPkCombinedValueText <em>Pk Combined Value Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog()
 * @model
 * @generated
 */
public interface EntityAuditLog extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Audit History Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit History Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit History Seq Id</em>' attribute.
	 * @see #setAuditHistorySeqId(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_AuditHistorySeqId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot help='Sequenced primary key'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAuditHistorySeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getAuditHistorySeqId <em>Audit History Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit History Seq Id</em>' attribute.
	 * @see #getAuditHistorySeqId()
	 * @generated
	 */
	void setAuditHistorySeqId(String value);

	/**
	 * Returns the value of the '<em><b>Changed By Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed By Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed By Info</em>' attribute.
	 * @see #setChangedByInfo(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_ChangedByInfo()
	 * @model annotation="mimo-ent-slot help='This should contain whatever information is available about the user or system that changed the value. This could be a userLoginId, but could be something else too, so there is no foreign key.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getChangedByInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedByInfo <em>Changed By Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed By Info</em>' attribute.
	 * @see #getChangedByInfo()
	 * @generated
	 */
	void setChangedByInfo(String value);

	/**
	 * Returns the value of the '<em><b>Changed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Date</em>' attribute.
	 * @see #setChangedDate(Date)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_ChangedDate()
	 * @model
	 * @generated
	 */
	Date getChangedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedDate <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed Date</em>' attribute.
	 * @see #getChangedDate()
	 * @generated
	 */
	void setChangedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Changed Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Entity Name</em>' attribute.
	 * @see #setChangedEntityName(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_ChangedEntityName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getChangedEntityName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedEntityName <em>Changed Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed Entity Name</em>' attribute.
	 * @see #getChangedEntityName()
	 * @generated
	 */
	void setChangedEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Changed Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Field Name</em>' attribute.
	 * @see #setChangedFieldName(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_ChangedFieldName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getChangedFieldName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedFieldName <em>Changed Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed Field Name</em>' attribute.
	 * @see #getChangedFieldName()
	 * @generated
	 */
	void setChangedFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Changed Session Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Session Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Session Info</em>' attribute.
	 * @see #setChangedSessionInfo(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_ChangedSessionInfo()
	 * @model annotation="mimo-ent-slot help='This should contain whatever information is available about the session during which the value was changed. This could be a visitId, but could be something else too, so there is no foreign key.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getChangedSessionInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedSessionInfo <em>Changed Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed Session Info</em>' attribute.
	 * @see #getChangedSessionInfo()
	 * @generated
	 */
	void setChangedSessionInfo(String value);

	/**
	 * Returns the value of the '<em><b>New Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value Text</em>' attribute.
	 * @see #setNewValueText(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_NewValueText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getNewValueText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getNewValueText <em>New Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value Text</em>' attribute.
	 * @see #getNewValueText()
	 * @generated
	 */
	void setNewValueText(String value);

	/**
	 * Returns the value of the '<em><b>Old Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value Text</em>' attribute.
	 * @see #setOldValueText(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_OldValueText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOldValueText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getOldValueText <em>Old Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value Text</em>' attribute.
	 * @see #getOldValueText()
	 * @generated
	 */
	void setOldValueText(String value);

	/**
	 * Returns the value of the '<em><b>Pk Combined Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pk Combined Value Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pk Combined Value Text</em>' attribute.
	 * @see #setPkCombinedValueText(String)
	 * @see org.abchip.mimo.biz.entity.audit.AuditPackage#getEntityAuditLog_PkCombinedValueText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPkCombinedValueText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getPkCombinedValueText <em>Pk Combined Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pk Combined Value Text</em>' attribute.
	 * @see #getPkCombinedValueText()
	 * @generated
	 */
	void setPkCombinedValueText(String value);

} // EntityAuditLog
