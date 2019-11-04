/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentAssoc;
import org.abchip.mimo.biz.content.content.ContentAssocPredicate;
import org.abchip.mimo.biz.content.content.ContentAssocType;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getLeftCoordinate <em>Left Coordinate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getUpperCoordinate <em>Upper Coordinate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getContentIdTo <em>Content Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getContentAssocTypeId <em>Content Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentAssocImpl#getDataSourceId <em>Data Source Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentAssocImpl extends BizEntityTypedImpl<ContentAssocType> implements ContentAssoc {
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
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftCoordinate() <em>Left Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final long LEFT_COORDINATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLeftCoordinate() <em>Left Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftCoordinate()
	 * @generated
	 * @ordered
	 */
	protected long leftCoordinate = LEFT_COORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected String mapKey = MAP_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperCoordinate() <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final long UPPER_COORDINATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUpperCoordinate() <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCoordinate()
	 * @generated
	 * @ordered
	 */
	protected long upperCoordinate = UPPER_COORDINATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentIdTo() <em>Content Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentIdTo()
	 * @generated
	 * @ordered
	 */
	protected Content contentIdTo;

	/**
	 * The cached value of the '{@link #getContentAssocTypeId() <em>Content Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContentAssocType contentAssocTypeId;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;

	/**
	 * The cached value of the '{@link #getContentAssocPredicateId() <em>Content Assoc Predicate Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAssocPredicateId()
	 * @generated
	 * @ordered
	 */
	protected ContentAssocPredicate contentAssocPredicateId;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSourceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAssocPredicate getContentAssocPredicateId() {
		if (contentAssocPredicateId != null && ((EObject)contentAssocPredicateId).eIsProxy()) {
			InternalEObject oldContentAssocPredicateId = (InternalEObject)contentAssocPredicateId;
			contentAssocPredicateId = (ContentAssocPredicate)eResolveProxy(oldContentAssocPredicateId);
			if (contentAssocPredicateId != oldContentAssocPredicateId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID, oldContentAssocPredicateId, contentAssocPredicateId));
			}
		}
		return contentAssocPredicateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentAssocPredicate basicGetContentAssocPredicateId() {
		return contentAssocPredicateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentAssocPredicateId(ContentAssocPredicate newContentAssocPredicateId) {
		ContentAssocPredicate oldContentAssocPredicateId = contentAssocPredicateId;
		contentAssocPredicateId = newContentAssocPredicateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID, oldContentAssocPredicateId, contentAssocPredicateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAssocType getContentAssocTypeId() {
		if (contentAssocTypeId != null && ((EObject)contentAssocTypeId).eIsProxy()) {
			InternalEObject oldContentAssocTypeId = (InternalEObject)contentAssocTypeId;
			contentAssocTypeId = (ContentAssocType)eResolveProxy(oldContentAssocTypeId);
			if (contentAssocTypeId != oldContentAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID, oldContentAssocTypeId, contentAssocTypeId));
			}
		}
		return contentAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentAssocType basicGetContentAssocTypeId() {
		return contentAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentAssocTypeId(ContentAssocType newContentAssocTypeId) {
		ContentAssocType oldContentAssocTypeId = contentAssocTypeId;
		contentAssocTypeId = newContentAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID, oldContentAssocTypeId, contentAssocTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentIdTo() {
		if (contentIdTo != null && ((EObject)contentIdTo).eIsProxy()) {
			InternalEObject oldContentIdTo = (InternalEObject)contentIdTo;
			contentIdTo = (Content)eResolveProxy(oldContentIdTo);
			if (contentIdTo != oldContentIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO, oldContentIdTo, contentIdTo));
			}
		}
		return contentIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentIdTo() {
		return contentIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentIdTo(Content newContentIdTo) {
		Content oldContentIdTo = contentIdTo;
		contentIdTo = newContentIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO, oldContentIdTo, contentIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		UserLogin oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		if (dataSourceId != null && ((EObject)dataSourceId).eIsProxy()) {
			InternalEObject oldDataSourceId = (InternalEObject)dataSourceId;
			dataSourceId = (DataSource)eResolveProxy(oldDataSourceId);
			if (dataSourceId != oldDataSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
			}
		}
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		DataSource oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		UserLogin oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLeftCoordinate() {
		return leftCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftCoordinate(long newLeftCoordinate) {
		long oldLeftCoordinate = leftCoordinate;
		leftCoordinate = newLeftCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__LEFT_COORDINATE, oldLeftCoordinate, leftCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapKey() {
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKey(String newMapKey) {
		String oldMapKey = mapKey;
		mapKey = newMapKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__MAP_KEY, oldMapKey, mapKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUpperCoordinate() {
		return upperCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperCoordinate(long newUpperCoordinate) {
		long oldUpperCoordinate = upperCoordinate;
		upperCoordinate = newUpperCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_ASSOC__UPPER_COORDINATE, oldUpperCoordinate, upperCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT_ASSOC__FROM_DATE:
				return getFromDate();
			case ContentPackage.CONTENT_ASSOC__CREATED_DATE:
				return getCreatedDate();
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ContentPackage.CONTENT_ASSOC__LEFT_COORDINATE:
				return getLeftCoordinate();
			case ContentPackage.CONTENT_ASSOC__MAP_KEY:
				return getMapKey();
			case ContentPackage.CONTENT_ASSOC__SEQUENCE_NUM:
				return getSequenceNum();
			case ContentPackage.CONTENT_ASSOC__THRU_DATE:
				return getThruDate();
			case ContentPackage.CONTENT_ASSOC__UPPER_COORDINATE:
				return getUpperCoordinate();
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO:
				if (resolve) return getContentIdTo();
				return basicGetContentIdTo();
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID:
				if (resolve) return getContentAssocTypeId();
				return basicGetContentAssocTypeId();
			case ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID:
				if (resolve) return getContentAssocPredicateId();
				return basicGetContentAssocPredicateId();
			case ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
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
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__LEFT_COORDINATE:
				setLeftCoordinate((Long)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__MAP_KEY:
				setMapKey((String)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__UPPER_COORDINATE:
				setUpperCoordinate((Long)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO:
				setContentIdTo((Content)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID:
				setContentAssocTypeId((ContentAssocType)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID:
				setContentAssocPredicateId((ContentAssocPredicate)newValue);
				return;
			case ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
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
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__LEFT_COORDINATE:
				setLeftCoordinate(LEFT_COORDINATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__MAP_KEY:
				setMapKey(MAP_KEY_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__UPPER_COORDINATE:
				setUpperCoordinate(UPPER_COORDINATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO:
				setContentIdTo((Content)null);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID:
				setContentAssocTypeId((ContentAssocType)null);
				return;
			case ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID:
				setContentAssocPredicateId((ContentAssocPredicate)null);
				return;
			case ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
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
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ContentPackage.CONTENT_ASSOC__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ContentPackage.CONTENT_ASSOC__LEFT_COORDINATE:
				return leftCoordinate != LEFT_COORDINATE_EDEFAULT;
			case ContentPackage.CONTENT_ASSOC__MAP_KEY:
				return MAP_KEY_EDEFAULT == null ? mapKey != null : !MAP_KEY_EDEFAULT.equals(mapKey);
			case ContentPackage.CONTENT_ASSOC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ContentPackage.CONTENT_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ContentPackage.CONTENT_ASSOC__UPPER_COORDINATE:
				return upperCoordinate != UPPER_COORDINATE_EDEFAULT;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ID_TO:
				return contentIdTo != null;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_TYPE_ID:
				return contentAssocTypeId != null;
			case ContentPackage.CONTENT_ASSOC__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case ContentPackage.CONTENT_ASSOC__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case ContentPackage.CONTENT_ASSOC__CONTENT_ASSOC_PREDICATE_ID:
				return contentAssocPredicateId != null;
			case ContentPackage.CONTENT_ASSOC__DATA_SOURCE_ID:
				return dataSourceId != null;
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
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", leftCoordinate: ");
		result.append(leftCoordinate);
		result.append(", mapKey: ");
		result.append(mapKey);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", upperCoordinate: ");
		result.append(upperCoordinate);
		result.append(')');
		return result.toString();
	}

} //ContentAssocImpl
