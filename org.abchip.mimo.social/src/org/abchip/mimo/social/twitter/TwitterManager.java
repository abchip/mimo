/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.twitter;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTwitterManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TwitterManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	EntityIterator<Tweet> search(Context context, String language, String query, int maxNumber);

} // TwitterManager
