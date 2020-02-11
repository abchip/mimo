/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Search Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getContentSearchConstraints <em>Content Search Constraints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult()
 * @model
 * @generated
 */
public interface ContentSearchResult extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Search Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Search Result Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Search Result Id</em>' attribute.
	 * @see #setContentSearchResultId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_ContentSearchResultId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentSearchResultId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getContentSearchResultId <em>Content Search Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Search Result Id</em>' attribute.
	 * @see #getContentSearchResultId()
	 * @generated
	 */
	void setContentSearchResultId(String value);

	/**
	 * Returns the value of the '<em><b>Content Search Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentSearchConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Search Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Search Constraints</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_ContentSearchConstraints()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentSearchConstraint> getContentSearchConstraints();

	/**
	 * Returns the value of the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ascending</em>' attribute.
	 * @see #setIsAscending(boolean)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_IsAscending()
	 * @model
	 * @generated
	 */
	boolean isIsAscending();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#isIsAscending <em>Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ascending</em>' attribute.
	 * @see #isIsAscending()
	 * @generated
	 */
	void setIsAscending(boolean value);

	/**
	 * Returns the value of the '<em><b>Num Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Results</em>' attribute.
	 * @see #setNumResults(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_NumResults()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumResults();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getNumResults <em>Num Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Results</em>' attribute.
	 * @see #getNumResults()
	 * @generated
	 */
	void setNumResults(long value);

	/**
	 * Returns the value of the '<em><b>Order By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order By Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By Name</em>' attribute.
	 * @see #setOrderByName(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_OrderByName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOrderByName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getOrderByName <em>Order By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By Name</em>' attribute.
	 * @see #getOrderByName()
	 * @generated
	 */
	void setOrderByName(String value);

	/**
	 * Returns the value of the '<em><b>Search Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Date</em>' attribute.
	 * @see #setSearchDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_SearchDate()
	 * @model
	 * @generated
	 */
	Date getSearchDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getSearchDate <em>Search Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Date</em>' attribute.
	 * @see #getSearchDate()
	 * @generated
	 */
	void setSearchDate(Date value);

	/**
	 * Returns the value of the '<em><b>Seconds Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds Total</em>' attribute.
	 * @see #setSecondsTotal(double)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_SecondsTotal()
	 * @model
	 * @generated
	 */
	double getSecondsTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getSecondsTotal <em>Seconds Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds Total</em>' attribute.
	 * @see #getSecondsTotal()
	 * @generated
	 */
	void setSecondsTotal(double value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchResult_VisitId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchResult#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

} // ContentSearchResult
