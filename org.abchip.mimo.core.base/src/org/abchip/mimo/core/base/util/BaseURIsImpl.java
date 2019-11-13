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
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import org.abchip.mimo.util.URIs;

public class BaseURIsImpl implements URIs {

	@Override
	public String getBaseName(URI uri) {
		return org.apache.commons.io.FilenameUtils.getBaseName(uri.getRawPath());
	}

	@Override
	public Map<String, String> parseParameter(String query) {

		Map<String, String> query_pairs = new LinkedHashMap<String, String>();
		try {
			String[] pairs = query.split("&");
			for (String pair : pairs) {
				int idx = pair.indexOf("=");
				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			}
		} catch (Exception e) {

		}
		return query_pairs;
	}
}
