/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Clear Commerce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getEffectiveAlias <em>Effective Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#isEnableCVM <em>Enable CVM</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#isProcessMode <em>Process Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getUserAlias <em>User Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
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
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEffectiveAlias() <em>Effective Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_ALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEffectiveAlias() <em>Effective Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveAlias()
	 * @generated
	 * @ordered
	 */
	protected String effectiveAlias = EFFECTIVE_ALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnableCVM() <em>Enable CVM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCVM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CVM_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnableCVM() <em>Enable CVM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCVM()
	 * @generated
	 * @ordered
	 */
	protected boolean enableCVM = ENABLE_CVM_EDEFAULT;
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isProcessMode() <em>Process Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESS_MODE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isProcessMode() <em>Process Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessMode()
	 * @generated
	 * @ordered
	 */
	protected boolean processMode = PROCESS_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String PWD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected String pwd = PWD_EDEFAULT;
	/**
	 * The default value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected String serverURL = SERVER_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected String sourceId = SOURCE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUserAlias() <em>User Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAlias()
	 * @generated
	 * @ordered
	 */
	protected String userAlias = USER_ALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfig paymentGatewayConfigId;

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
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID, oldClientId, clientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffectiveAlias() {
		return effectiveAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveAlias(String newEffectiveAlias) {
		String oldEffectiveAlias = effectiveAlias;
		effectiveAlias = newEffectiveAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS, oldEffectiveAlias, effectiveAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableCVM() {
		return enableCVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCVM(boolean newEnableCVM) {
		boolean oldEnableCVM = enableCVM;
		enableCVM = newEnableCVM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM, oldEnableCVM, enableCVM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProcessMode() {
		return processMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessMode(boolean newProcessMode) {
		boolean oldProcessMode = processMode;
		processMode = newProcessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE, oldProcessMode, processMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		if (paymentGatewayConfigId != null && ((EObject)paymentGatewayConfigId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigId = (InternalEObject)paymentGatewayConfigId;
			paymentGatewayConfigId = (PaymentGatewayConfig)eResolveProxy(oldPaymentGatewayConfigId);
			if (paymentGatewayConfigId != oldPaymentGatewayConfigId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
			}
		}
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfig basicGetPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		PaymentGatewayConfig oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return pwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		String oldPwd = pwd;
		pwd = newPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerURL() {
		return serverURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerURL(String newServerURL) {
		String oldServerURL = serverURL;
		serverURL = newServerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL, oldServerURL, serverURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceId(String newSourceId) {
		String oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAlias() {
		return userAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAlias(String newUserAlias) {
		String oldUserAlias = userAlias;
		userAlias = newUserAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS, oldUserAlias, userAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID:
				return getClientId();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS:
				return getEffectiveAlias();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM:
				return isEnableCVM();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID:
				return getGroupId();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE:
				return isProcessMode();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD:
				return getPwd();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL:
				return getServerURL();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID:
				return getSourceId();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS:
				return getUserAlias();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME:
				return getUsername();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID:
				if (resolve) return getPaymentGatewayConfigId();
				return basicGetPaymentGatewayConfigId();
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
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID:
				setClientId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS:
				setEffectiveAlias((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM:
				setEnableCVM((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE:
				setProcessMode((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD:
				setPwd((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL:
				setServerURL((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID:
				setSourceId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS:
				setUserAlias((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME:
				setUsername((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID:
				setClientId(CLIENT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS:
				setEffectiveAlias(EFFECTIVE_ALIAS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM:
				setEnableCVM(ENABLE_CVM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE:
				setProcessMode(PROCESS_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL:
				setServerURL(SERVER_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID:
				setSourceId(SOURCE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS:
				setUserAlias(USER_ALIAS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS:
				return EFFECTIVE_ALIAS_EDEFAULT == null ? effectiveAlias != null : !EFFECTIVE_ALIAS_EDEFAULT.equals(effectiveAlias);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM:
				return enableCVM != ENABLE_CVM_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE:
				return processMode != PROCESS_MODE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverURL != null : !SERVER_URL_EDEFAULT.equals(serverURL);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceId != null : !SOURCE_ID_EDEFAULT.equals(sourceId);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS:
				return USER_ALIAS_EDEFAULT == null ? userAlias != null : !USER_ALIAS_EDEFAULT.equals(userAlias);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID:
				return paymentGatewayConfigId != null;
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
		result.append(" (clientId: ");
		result.append(clientId);
		result.append(", effectiveAlias: ");
		result.append(effectiveAlias);
		result.append(", enableCVM: ");
		result.append(enableCVM);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", processMode: ");
		result.append(processMode);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(", serverURL: ");
		result.append(serverURL);
		result.append(", sourceId: ");
		result.append(sourceId);
		result.append(", userAlias: ");
		result.append(userAlias);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayClearCommerceImpl
