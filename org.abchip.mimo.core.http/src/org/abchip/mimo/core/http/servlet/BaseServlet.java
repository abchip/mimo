/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.util.Logs;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.osgi.service.log.Logger;

public abstract class BaseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logs.getLogger(BaseServlet.class);

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		LOGGER.trace("Request {} from session {}", request.getRequestURI(), session.getId());

		Context context = ContextUtils.getContext(session.getId());

		// invalid access
		if (context == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		execute(context, request, response);

		response.flushBuffer();
	}

	protected abstract void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException;

	protected Map<String, Part> parseRequest(HttpServletRequest request) throws IOException, ServletException {

		ServletFileUpload upload = null;

		// Must return non-null File. See Servlet 3.1 §4.8.1
		File baseStorage = (File) request.getServletContext().getAttribute(ServletContext.TEMPDIR);
		baseStorage.mkdirs();

		File storage = new File(UUID.randomUUID().toString());

		if (!storage.isAbsolute()) {
			storage = new File(baseStorage, storage.getPath());
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(baseStorage);
		upload = new ServletFileUpload(factory);

		Map<String, Part> parts = new HashMap<String, Part>();

		try {
			for (Object item : upload.parseRequest(request)) {
				DiskFileItem diskFileItem = (DiskFileItem) item;

				parts.put(diskFileItem.getFieldName(), new MultipartSupportPart(diskFileItem));
			}
		} catch (FileUploadException fnfe) {
			throw new IOException(fnfe);
		}

		return parts;
	}
}