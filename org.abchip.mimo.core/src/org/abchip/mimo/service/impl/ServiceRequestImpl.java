/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.UserProfile;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Request</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceRequestImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceRequestImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceRequestImpl#getUserProfile <em>User Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceRequestImpl<V extends ServiceResponse> extends ServiceMessageImpl implements ServiceRequest<V> {
	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getUserProfile() <em>User Profile</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserProfile()
	 * @generated
	 * @ordered
	 */
	protected UserProfile userProfile;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_REQUEST__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_REQUEST__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_REQUEST__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserProfile getUserProfile() {
		if (userProfile != null && ((EObject)userProfile).eIsProxy()) {
			InternalEObject oldUserProfile = (InternalEObject)userProfile;
			userProfile = (UserProfile)eResolveProxy(oldUserProfile);
			if (userProfile != oldUserProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_REQUEST__USER_PROFILE, oldUserProfile, userProfile));
			}
		}
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile basicGetUserProfile() {
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserProfile(UserProfile newUserProfile) {
		UserProfile oldUserProfile = userProfile;
		userProfile = newUserProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_REQUEST__USER_PROFILE, oldUserProfile, userProfile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isPrepared() {
		return getContext() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Class<V> getResponse() {

		EClass eClass = this.eClass();
		EGenericType eGenericType = eClass.getEGenericSuperTypes().get(0);

		Class<V> klass = null;
		if (eGenericType.getETypeArguments().isEmpty())
			klass = (Class<V>) ServicePackage.eINSTANCE.getServiceResponse().getInstanceClass();
		else {
			eGenericType = eGenericType.getETypeArguments().get(0);
			klass = (Class<V>) eGenericType.getEClassifier().getInstanceClass();
		}

		return klass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public V buildResponse() throws ServiceException {

		V response = null;
		try {
			Resource<V> resource = (Resource<V>) context.getResourceSet().getResource(this.getResponse(), tenant);
			response = resource.make();
		} catch (ResourceException e) {
			throw new ServiceException(e);
		}

		return response;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(Context context, String tenant) {
		if (isPrepared())
			throw new UnsupportedOperationException("Request already prepared");

		this.context = context;
		this.tenant = tenant;

		ContextDescription contextDescription = context.getContextDescription();
		this.locale = contextDescription.getLocale();

		this.setUserProfile(context.createProxy(UserProfile.class, contextDescription.getUser(), tenant));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getServiceName() {
		return Strings.firstToLower(this.isa().getID());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_REQUEST__LOCALE:
				return getLocale();
			case ServicePackage.SERVICE_REQUEST__TENANT:
				return getTenant();
			case ServicePackage.SERVICE_REQUEST__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ServicePackage.SERVICE_REQUEST__USER_PROFILE:
				if (resolve) return getUserProfile();
				return basicGetUserProfile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.SERVICE_REQUEST__LOCALE:
				setLocale((String)newValue);
				return;
			case ServicePackage.SERVICE_REQUEST__TENANT:
				setTenant((String)newValue);
				return;
			case ServicePackage.SERVICE_REQUEST__USER_PROFILE:
				setUserProfile((UserProfile)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE_REQUEST__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_REQUEST__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case ServicePackage.SERVICE_REQUEST__USER_PROFILE:
				setUserProfile((UserProfile)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE_REQUEST__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case ServicePackage.SERVICE_REQUEST__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case ServicePackage.SERVICE_REQUEST__CONTEXT:
				return context != null;
			case ServicePackage.SERVICE_REQUEST__USER_PROFILE:
				return userProfile != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (locale: ");
		result.append(locale);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(')');
		return result.toString();
	}

} // ServiceRequestImpl
