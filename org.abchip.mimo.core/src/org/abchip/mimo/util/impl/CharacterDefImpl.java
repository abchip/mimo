/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util.impl;

import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.impl.CharacterDefImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.CharacterDefImpl#isVarying <em>Varying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterDefImpl extends DataDefImpl<String> implements CharacterDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.CHARACTER_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return (Integer)eGet(UtilPackage.Literals.CHARACTER_DEF__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		eSet(UtilPackage.Literals.CHARACTER_DEF__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVarying() {
		return (Boolean)eGet(UtilPackage.Literals.CHARACTER_DEF__VARYING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarying(boolean newVarying) {
		eSet(UtilPackage.Literals.CHARACTER_DEF__VARYING, newVarying);
	}

} //CharacterDefImpl
