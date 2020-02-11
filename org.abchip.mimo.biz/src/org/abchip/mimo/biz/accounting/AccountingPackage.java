/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting;

import org.eclipse.emf.ecore.EEnum;
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
 * @see org.abchip.mimo.biz.accounting.AccountingFactory
 * @model kind="package"
 * @generated
 */
public interface AccountingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accounting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-accounting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingPackage eINSTANCE = org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.DebitCreditFlag <em>Debit Credit Flag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.DebitCreditFlag
	 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getDebitCreditFlag()
	 * @generated
	 */
	int DEBIT_CREDIT_FLAG = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ProcessMode <em>Process Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ProcessMode
	 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getProcessMode()
	 * @generated
	 */
	int PROCESS_MODE = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.AuthMode <em>Auth Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.AuthMode
	 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getAuthMode()
	 * @generated
	 */
	int AUTH_MODE = 2;


	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.biz.accounting.DebitCreditFlag <em>Debit Credit Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Debit Credit Flag</em>'.
	 * @see org.abchip.mimo.biz.accounting.DebitCreditFlag
	 * @generated
	 */
	EEnum getDebitCreditFlag();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.biz.accounting.ProcessMode <em>Process Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.ProcessMode
	 * @generated
	 */
	EEnum getProcessMode();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.biz.accounting.AuthMode <em>Auth Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auth Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.AuthMode
	 * @generated
	 */
	EEnum getAuthMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountingFactory getAccountingFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.DebitCreditFlag <em>Debit Credit Flag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.DebitCreditFlag
		 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getDebitCreditFlag()
		 * @generated
		 */
		EEnum DEBIT_CREDIT_FLAG = eINSTANCE.getDebitCreditFlag();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ProcessMode <em>Process Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ProcessMode
		 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getProcessMode()
		 * @generated
		 */
		EEnum PROCESS_MODE = eINSTANCE.getProcessMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.AuthMode <em>Auth Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.AuthMode
		 * @see org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl#getAuthMode()
		 * @generated
		 */
		EEnum AUTH_MODE = eINSTANCE.getAuthMode();

	}

} //AccountingPackage
