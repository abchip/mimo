/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.handler;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.core.http.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public class HttpNextSequenceHandler implements ResponseHandler<String> {

	@Override
	public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

		switch (response.getStatusLine().getStatusCode()) {
		case HttpServletResponse.SC_OK:
			HttpEntity httpEntity = response.getEntity();
			return EntityUtils.toString(httpEntity, "UTF-8");
		default:
			throw HttpUtils.buildException(response);
		}
	}
}
