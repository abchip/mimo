/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Page Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnWidthPercentage <em>Column Width Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnWidthPixels <em>Column Width Pixels</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPageColumn()
 * @model annotation="mimo-ent-frame title='Defines a Portal Page'"
 * @generated
 */
public interface PortalPageColumn extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Column Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Seq Id</em>' attribute.
	 * @see #setColumnSeqId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPageColumn_ColumnSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getColumnSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnSeqId <em>Column Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Seq Id</em>' attribute.
	 * @see #getColumnSeqId()
	 * @generated
	 */
	void setColumnSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Column Width Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Width Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width Percentage</em>' attribute.
	 * @see #setColumnWidthPercentage(long)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPageColumn_ColumnWidthPercentage()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getColumnWidthPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnWidthPercentage <em>Column Width Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width Percentage</em>' attribute.
	 * @see #getColumnWidthPercentage()
	 * @generated
	 */
	void setColumnWidthPercentage(long value);

	/**
	 * Returns the value of the '<em><b>Column Width Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Width Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width Pixels</em>' attribute.
	 * @see #setColumnWidthPixels(long)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPageColumn_ColumnWidthPixels()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getColumnWidthPixels();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getColumnWidthPixels <em>Column Width Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width Pixels</em>' attribute.
	 * @see #getColumnWidthPixels()
	 * @generated
	 */
	void setColumnWidthPixels(long value);

	/**
	 * Returns the value of the '<em><b>Portal Page Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Id</em>' reference.
	 * @see #setPortalPageId(PortalPage)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPageColumn_PortalPageId()
	 * @model keys="portalPageId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PortalPage getPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPageColumn#getPortalPageId <em>Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Page Id</em>' reference.
	 * @see #getPortalPageId()
	 * @generated
	 */
	void setPortalPageId(PortalPage value);

} // PortalPageColumn
