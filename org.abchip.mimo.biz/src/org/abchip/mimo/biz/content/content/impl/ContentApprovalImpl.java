/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentApproval;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentApprovalImpl#getApprovalStatusId <em>Approval Status Id</em>}</li>
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
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * The cached value of the '{@link #getApprovalStatusId() <em>Approval Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem approvalStatusId;

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
	public StatusItem getApprovalStatusId() {
		if (approvalStatusId != null && ((EObject)approvalStatusId).eIsProxy()) {
			InternalEObject oldApprovalStatusId = (InternalEObject)approvalStatusId;
			approvalStatusId = (StatusItem)eResolveProxy(oldApprovalStatusId);
			if (approvalStatusId != oldApprovalStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID, oldApprovalStatusId, approvalStatusId));
			}
		}
		return approvalStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetApprovalStatusId() {
		return approvalStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalStatusId(StatusItem newApprovalStatusId) {
		StatusItem oldApprovalStatusId = approvalStatusId;
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
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_APPROVAL__CONTENT_ID, oldContentId, contentId));
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		Content oldContentId = contentId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_APPROVAL__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
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
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				return getComments();
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				return getContentRevisionSeqId();
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				return getSequenceNum();
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				if (resolve) return getApprovalStatusId();
				return basicGetApprovalStatusId();
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
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				setComments((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId((String)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				setContentId((Content)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				setApprovalStatusId((StatusItem)newValue);
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
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId(CONTENT_REVISION_SEQ_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				setContentId((Content)null);
				return;
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				setPartyId((Party)null);
				return;
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				setApprovalStatusId((StatusItem)null);
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
			case ContentPackage.CONTENT_APPROVAL__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ContentPackage.CONTENT_APPROVAL__CONTENT_REVISION_SEQ_ID:
				return CONTENT_REVISION_SEQ_ID_EDEFAULT == null ? contentRevisionSeqId != null : !CONTENT_REVISION_SEQ_ID_EDEFAULT.equals(contentRevisionSeqId);
			case ContentPackage.CONTENT_APPROVAL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ContentPackage.CONTENT_APPROVAL__CONTENT_ID:
				return contentId != null;
			case ContentPackage.CONTENT_APPROVAL__PARTY_ID:
				return partyId != null;
			case ContentPackage.CONTENT_APPROVAL__ROLE_TYPE_ID:
				return roleTypeId != null;
			case ContentPackage.CONTENT_APPROVAL__APPROVAL_STATUS_ID:
				return approvalStatusId != null;
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
		result.append(", comments: ");
		result.append(comments);
		result.append(", contentRevisionSeqId: ");
		result.append(contentRevisionSeqId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //ContentApprovalImpl
