/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.ProcessMode;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Clear Commerce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getEffectiveAlias <em>Effective Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#isEnableCVM <em>Enable CVM</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getProcessMode <em>Process Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayClearCommerceImpl extends BizEntityImpl implements PaymentGatewayClearCommerce {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayClearCommerceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientId(String newClientId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID, newClientId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffectiveAlias() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveAlias(String newEffectiveAlias) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS, newEffectiveAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableCVM() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCVM(boolean newEnableCVM) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM, newEnableCVM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessMode getProcessMode() {
		return (ProcessMode)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessMode(ProcessMode newProcessMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE, newProcessMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD, newPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerURL() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerURL(String newServerURL) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL, newServerURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceId(String newSourceId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID, newSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAlias() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAlias(String newUserAlias) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS, newUserAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME, newUsername);
	}

} //PaymentGatewayClearCommerceImpl
