/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.content.ContentApproval;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getContentApprovalId <em>Content Approval Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getApprovalStatusId <em>Approval Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentApprovalImpl extends BizEntityImpl implements ContentApproval {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getContentApprovalId() <em>Content Approval Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentApprovalId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_APPROVAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentApprovalId() <em>Content Approval Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentApprovalId()
	 * @generated
	 * @ordered
	 */
	protected String contentApprovalId = CONTENT_APPROVAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalDate() <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPROVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate = APPROVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalStatusId() <em>Approval Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalStatusId() <em>Approval Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatusId()
	 * @generated
	 * @ordered
	 */
	protected String approvalStatusId = APPROVAL_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentRevisionSeqId() <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_REVISION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentRevisionSeqId() <em>Content Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String contentRevisionSeqId = CONTENT_REVISION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_APPROVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalDate(Date newApprovalDate) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__APPROVAL_DATE, oldApprovalDate, approvalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprovalStatusId() {
		return approvalStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalStatusId(String newApprovalStatusId) {
		String oldApprovalStatusId = approvalStatusId;
		approvalStatusId = newApprovalStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID, oldApprovalStatusId, approvalStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentApprovalId() {
		return contentApprovalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentApprovalId(String newContentApprovalId) {
		String oldContentApprovalId = contentApprovalId;
		contentApprovalId = newContentApprovalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__CONTENT_APPROVAL_ID, oldContentApprovalId, contentApprovalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentRevisionSeqId() {
		return contentRevisionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentRevisionSeqId(String newContentRevisionSeqId) {
		String oldContentRevisionSeqId = contentRevisionSeqId;
		contentRevisionSeqId = newContentRevisionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID, oldContentRevisionSeqId, contentRevisionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_APPROVAL__CONTENT_APPROVAL_ID:
				return getContentApprovalId();
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_DATE:
				return getApprovalDate();
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				return getApprovalStatusId();
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				return getComments();
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				return getContentRevisionSeqId();
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				return getPartyId();
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				return getRoleTypeId();
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				return getSequenceNum();
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
			case ContentPackage.CONTENT_APPROVAL__CONTENT_APPROVAL_ID:
				setContentApprovalId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				setApprovalStatusId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				setComments((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case ContentPackage.CONTENT_APPROVAL__CONTENT_APPROVAL_ID:
				setContentApprovalId(CONTENT_APPROVAL_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_DATE:
				setApprovalDate(APPROVAL_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				setApprovalStatusId(APPROVAL_STATUS_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId(CONTENT_REVISION_SEQ_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case ContentPackage.CONTENT_APPROVAL__CONTENT_APPROVAL_ID:
				return CONTENT_APPROVAL_ID_EDEFAULT == null ? contentApprovalId != null : !CONTENT_APPROVAL_ID_EDEFAULT.equals(contentApprovalId);
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_DATE:
				return APPROVAL_DATE_EDEFAULT == null ? approvalDate != null : !APPROVAL_DATE_EDEFAULT.equals(approvalDate);
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				return APPROVAL_STATUS_ID_EDEFAULT == null ? approvalStatusId != null : !APPROVAL_STATUS_ID_EDEFAULT.equals(approvalStatusId);
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				return CONTENT_REVISION_SEQ_ID_EDEFAULT == null ? contentRevisionSeqId != null : !CONTENT_REVISION_SEQ_ID_EDEFAULT.equals(contentRevisionSeqId);
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (contentApprovalId: ");
		result.append(contentApprovalId);
		result.append(", approvalDate: ");
		result.append(approvalDate);
		result.append(", approvalStatusId: ");
		result.append(approvalStatusId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", contentRevisionSeqId: ");
		result.append(contentRevisionSeqId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //ContentApprovalImpl
