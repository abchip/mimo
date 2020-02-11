/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

public class HttpUtils {

	public static String getParametersAsString(HttpServletRequest request) {

		StringBuffer sb = new StringBuffer();

		for (String paramName : Collections.list(request.getParameterNames())) {
			if (sb.toString().isEmpty())
				sb.append("?");
			else
				sb.append("&");
			sb.append(paramName + "=" + request.getParameter(paramName));
		}

		return sb.toString();
	}
}
