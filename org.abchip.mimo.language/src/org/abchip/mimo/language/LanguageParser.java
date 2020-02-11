/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import org.abchip.mimo.context.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguageParser()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LanguageParser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" languageRequired="true" textRequired="true"
	 * @generated
	 */
	LanguageExpression parse(Context context, String language, String text);

} // LanguageParser
