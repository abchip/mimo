/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguagePackage;
import org.abchip.mimo.language.LanguageTranslate;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Translate</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageTranslateImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageTranslateImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageTranslateImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageTranslateImpl extends ServiceRequestImpl<ServiceResponse> implements LanguageTranslate {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = "eng";

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = "ita";

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageTranslateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.LANGUAGE_TRANSLATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		text = newText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		from = newFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		to = newTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanguagePackage.LANGUAGE_TRANSLATE__TEXT:
				return getText();
			case LanguagePackage.LANGUAGE_TRANSLATE__FROM:
				return getFrom();
			case LanguagePackage.LANGUAGE_TRANSLATE__TO:
				return getTo();
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
			case LanguagePackage.LANGUAGE_TRANSLATE__TEXT:
				setText((String)newValue);
				return;
			case LanguagePackage.LANGUAGE_TRANSLATE__FROM:
				setFrom((String)newValue);
				return;
			case LanguagePackage.LANGUAGE_TRANSLATE__TO:
				setTo((String)newValue);
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
			case LanguagePackage.LANGUAGE_TRANSLATE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE_TRANSLATE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE_TRANSLATE__TO:
				setTo(TO_EDEFAULT);
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
			case LanguagePackage.LANGUAGE_TRANSLATE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case LanguagePackage.LANGUAGE_TRANSLATE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case LanguagePackage.LANGUAGE_TRANSLATE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

	@Override
	public ServiceResponse call() throws Exception {

		Context context = this.getContext();
		ServiceResponse response = buildResponse();

		LanguageManager languageManager = getContext().get(LanguageManager.class);

		response.setSuccessMessage(languageManager.translate(context, getFrom(), getText(), getTo()));

		return response;
	}

} // LanguageTranslateImpl
