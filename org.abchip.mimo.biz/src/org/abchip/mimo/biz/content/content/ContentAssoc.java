/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentIdTo <em>Content Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentAssocTypeId <em>Content Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLeftCoordinate <em>Left Coordinate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssoc#getUpperCoordinate <em>Upper Coordinate</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc()
 * @model
 * @generated
 */
public interface ContentAssoc extends BizEntityTyped<ContentAssocType> {
	/**
	 * Returns the value of the '<em><b>Content Assoc Predicate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Assoc Predicate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Assoc Predicate Id</em>' attribute.
	 * @see #setContentAssocPredicateId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_ContentAssocPredicateId()
	 * @model annotation="mimo-ent-domain frame='ContentAssocPredicate'"
	 * @generated
	 */
	String getContentAssocPredicateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Assoc Predicate Id</em>' attribute.
	 * @see #getContentAssocPredicateId()
	 * @generated
	 */
	void setContentAssocPredicateId(String value);

	/**
	 * Returns the value of the '<em><b>Content Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Assoc Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Assoc Type Id</em>' attribute.
	 * @see #setContentAssocTypeId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_ContentAssocTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ContentAssocType'"
	 * @generated
	 */
	String getContentAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentAssocTypeId <em>Content Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Assoc Type Id</em>' attribute.
	 * @see #getContentAssocTypeId()
	 * @generated
	 */
	void setContentAssocTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_ContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Content Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id To</em>' attribute.
	 * @see #setContentIdTo(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_ContentIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getContentIdTo <em>Content Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id To</em>' attribute.
	 * @see #getContentIdTo()
	 * @generated
	 */
	void setContentIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_DataSourceId()
	 * @model annotation="mimo-ent-domain frame='DataSource'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Left Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Coordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Coordinate</em>' attribute.
	 * @see #setLeftCoordinate(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_LeftCoordinate()
	 * @model
	 * @generated
	 */
	long getLeftCoordinate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getLeftCoordinate <em>Left Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Coordinate</em>' attribute.
	 * @see #getLeftCoordinate()
	 * @generated
	 */
	void setLeftCoordinate(long value);

	/**
	 * Returns the value of the '<em><b>Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key</em>' attribute.
	 * @see #setMapKey(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_MapKey()
	 * @model
	 * @generated
	 */
	String getMapKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getMapKey <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key</em>' attribute.
	 * @see #getMapKey()
	 * @generated
	 */
	void setMapKey(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Upper Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Coordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Coordinate</em>' attribute.
	 * @see #setUpperCoordinate(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssoc_UpperCoordinate()
	 * @model
	 * @generated
	 */
	long getUpperCoordinate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssoc#getUpperCoordinate <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Coordinate</em>' attribute.
	 * @see #getUpperCoordinate()
	 * @generated
	 */
	void setUpperCoordinate(long value);

} // ContentAssoc
