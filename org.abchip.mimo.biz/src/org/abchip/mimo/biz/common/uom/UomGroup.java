/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomGroup()
 * @model annotation="mimo-ent-frame title='Unit Of Measure Group' dictionary='CommonEntityLabels'"
 * @generated
 */
public interface UomGroup extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Uom Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Group Id</em>' attribute.
	 * @see #setUomGroupId(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomGroup_UomGroupId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUomGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Group Id</em>' attribute.
	 * @see #getUomGroupId()
	 * @generated
	 */
	void setUomGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' reference.
	 * @see #setUomId(Uom)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUomGroup_UomId()
	 * @model keys="uomId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

} // UomGroup
