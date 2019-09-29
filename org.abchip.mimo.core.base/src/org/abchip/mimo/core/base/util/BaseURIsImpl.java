/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.util;

import java.net.URI;

import org.abchip.mimo.util.URIs;

public class BaseURIsImpl implements URIs {

	@Override
	public String getBaseName(URI uri) {
		return org.apache.commons.io.FilenameUtils.getBaseName(uri.getRawPath());
	}
}
