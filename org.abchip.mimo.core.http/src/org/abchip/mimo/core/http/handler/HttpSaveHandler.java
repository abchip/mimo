/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.handler;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

public class HttpSaveHandler implements ResponseHandler<Boolean> {

	@Override
	public Boolean handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

		if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
			throw new ClientProtocolException(response.getStatusLine().getReasonPhrase());

		return true;
	}
}
