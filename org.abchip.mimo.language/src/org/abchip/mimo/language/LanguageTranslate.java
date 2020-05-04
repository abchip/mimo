/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.LanguageTranslate#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.language.LanguageTranslate#getFrom <em>From</em>}</li>
 *   <li>{@link org.abchip.mimo.language.LanguageTranslate#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageTranslate()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface LanguageTranslate extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguageTranslate_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.LanguageTranslate#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * The default value is <code>"eng"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguageTranslate_From()
	 * @model default="eng"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.LanguageTranslate#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * The default value is <code>"ita"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguageTranslate_To()
	 * @model default="ita"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.LanguageTranslate#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // LanguageTranslate
