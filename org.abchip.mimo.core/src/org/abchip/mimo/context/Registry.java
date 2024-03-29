/**
 *  Copyright (c) 2017, 2021 ABChip and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Registry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Registry<K> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	K lookup(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<K> list();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" vendorRequired="true" versionRequired="true"
	 * @generated
	 */
	K lookupByVendorVersion(String vendor, String version);

}
