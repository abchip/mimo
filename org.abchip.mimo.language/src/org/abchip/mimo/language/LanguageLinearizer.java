/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import org.abchip.mimo.context.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageLinearizer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LanguageLinearizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" languageRequired="true" expressionRequired="true"
	 * @generated
	 */
	String linearize(Context context, String language, LanguageExpression expression);

} // LanguageLinearizer
