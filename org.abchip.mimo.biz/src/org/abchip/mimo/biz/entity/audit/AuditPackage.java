/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.audit;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.entity.audit.AuditFactory
 * @model kind="package"
 * @generated
 */
public interface AuditPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "audit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/entity/audit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-audit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuditPackage eINSTANCE = org.abchip.mimo.biz.entity.audit.impl.AuditPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl <em>Entity Audit Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl
	 * @see org.abchip.mimo.biz.entity.audit.impl.AuditPackageImpl#getEntityAuditLog()
	 * @generated
	 */
	int ENTITY_AUDIT_LOG = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Audit History Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changed By Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CHANGED_BY_INFO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Changed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CHANGED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Changed Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Changed Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Changed Session Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__NEW_VALUE_TEXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Old Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__OLD_VALUE_TEXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pk Combined Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Entity Audit Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_AUDIT_LOG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog <em>Entity Audit Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Audit Log</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog
	 * @generated
	 */
	EClass getEntityAuditLog();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getAuditHistorySeqId <em>Audit History Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audit History Seq Id</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getAuditHistorySeqId()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_AuditHistorySeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedByInfo <em>Changed By Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed By Info</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedByInfo()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_ChangedByInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedDate <em>Changed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed Date</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedDate()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_ChangedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedEntityName <em>Changed Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed Entity Name</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedEntityName()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_ChangedEntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedFieldName <em>Changed Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed Field Name</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedFieldName()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_ChangedFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedSessionInfo <em>Changed Session Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed Session Info</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getChangedSessionInfo()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_ChangedSessionInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getNewValueText <em>New Value Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value Text</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getNewValueText()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_NewValueText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getOldValueText <em>Old Value Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value Text</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getOldValueText()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_OldValueText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.audit.EntityAuditLog#getPkCombinedValueText <em>Pk Combined Value Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Combined Value Text</em>'.
	 * @see org.abchip.mimo.biz.entity.audit.EntityAuditLog#getPkCombinedValueText()
	 * @see #getEntityAuditLog()
	 * @generated
	 */
	EAttribute getEntityAuditLog_PkCombinedValueText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuditFactory getAuditFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl <em>Entity Audit Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.audit.impl.EntityAuditLogImpl
		 * @see org.abchip.mimo.biz.entity.audit.impl.AuditPackageImpl#getEntityAuditLog()
		 * @generated
		 */
		EClass ENTITY_AUDIT_LOG = eINSTANCE.getEntityAuditLog();

		/**
		 * The meta object literal for the '<em><b>Audit History Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID = eINSTANCE.getEntityAuditLog_AuditHistorySeqId();

		/**
		 * The meta object literal for the '<em><b>Changed By Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__CHANGED_BY_INFO = eINSTANCE.getEntityAuditLog_ChangedByInfo();

		/**
		 * The meta object literal for the '<em><b>Changed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__CHANGED_DATE = eINSTANCE.getEntityAuditLog_ChangedDate();

		/**
		 * The meta object literal for the '<em><b>Changed Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME = eINSTANCE.getEntityAuditLog_ChangedEntityName();

		/**
		 * The meta object literal for the '<em><b>Changed Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME = eINSTANCE.getEntityAuditLog_ChangedFieldName();

		/**
		 * The meta object literal for the '<em><b>Changed Session Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO = eINSTANCE.getEntityAuditLog_ChangedSessionInfo();

		/**
		 * The meta object literal for the '<em><b>New Value Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__NEW_VALUE_TEXT = eINSTANCE.getEntityAuditLog_NewValueText();

		/**
		 * The meta object literal for the '<em><b>Old Value Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__OLD_VALUE_TEXT = eINSTANCE.getEntityAuditLog_OldValueText();

		/**
		 * The meta object literal for the '<em><b>Pk Combined Value Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT = eINSTANCE.getEntityAuditLog_PkCombinedValueText();

	}

} //AuditPackage
