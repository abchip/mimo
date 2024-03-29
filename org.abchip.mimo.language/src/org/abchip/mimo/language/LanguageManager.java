/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.mining.classification.Classification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LanguageManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.language.LanguageException" contextRequired="true" textRequired="true"
	 * @generated
	 */
	Classification<Language> classifyLanguage(Context context, String text) throws LanguageException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.language.LanguageException" contextRequired="true" languageSourceRequired="true" textRequired="true" languageTargetRequired="true"
	 * @generated
	 */
	String translate(Context context, String languageSource, String text, String languageTarget) throws LanguageException;
} // LanguageManager
