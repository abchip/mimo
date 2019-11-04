/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentRevision;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionImpl#getContentRevisionSeqId <em>Content Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentRevisionImpl#getCommittedByPartyId <em>Committed By Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentRevisionImpl extends BizEntityImpl implements ContentRevision {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The cached value of the '{@link #getCommittedByPartyId() <em>Committed By Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommittedByPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party committedByPartyId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_REVISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCommittedByPartyId() {
		if (committedByPartyId != null && ((EObject)committedByPartyId).eIsProxy()) {
			InternalEObject oldCommittedByPartyId = (InternalEObject)committedByPartyId;
			committedByPartyId = (Party)eResolveProxy(oldCommittedByPartyId);
			if (committedByPartyId != oldCommittedByPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID, oldCommittedByPartyId, committedByPartyId));
			}
		}
		return committedByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetCommittedByPartyId() {
		return committedByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommittedByPartyId(Party newCommittedByPartyId) {
		Party oldCommittedByPartyId = committedByPartyId;
		committedByPartyId = newCommittedByPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID, oldCommittedByPartyId, committedByPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION__CONTENT_ID, oldContentId, contentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_REVISION__CONTENT_REVISION_SEQ_ID, oldContentRevisionSeqId, contentRevisionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_REVISION__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT_REVISION__CONTENT_REVISION_SEQ_ID:
				return getContentRevisionSeqId();
			case ContentPackage.CONTENT_REVISION__COMMENTS:
				return getComments();
			case ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID:
				if (resolve) return getCommittedByPartyId();
				return basicGetCommittedByPartyId();
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
			case ContentPackage.CONTENT_REVISION__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION__COMMENTS:
				setComments((String)newValue);
				return;
			case ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID:
				setCommittedByPartyId((Party)newValue);
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
			case ContentPackage.CONTENT_REVISION__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION__CONTENT_REVISION_SEQ_ID:
				setContentRevisionSeqId(CONTENT_REVISION_SEQ_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID:
				setCommittedByPartyId((Party)null);
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
			case ContentPackage.CONTENT_REVISION__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT_REVISION__CONTENT_REVISION_SEQ_ID:
				return CONTENT_REVISION_SEQ_ID_EDEFAULT == null ? contentRevisionSeqId != null : !CONTENT_REVISION_SEQ_ID_EDEFAULT.equals(contentRevisionSeqId);
			case ContentPackage.CONTENT_REVISION__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ContentPackage.CONTENT_REVISION__COMMITTED_BY_PARTY_ID:
				return committedByPartyId != null;
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", contentRevisionSeqId: ");
		result.append(contentRevisionSeqId);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //ContentRevisionImpl
