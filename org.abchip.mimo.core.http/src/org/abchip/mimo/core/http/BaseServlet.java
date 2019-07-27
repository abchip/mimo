/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public abstract class BaseServlet extends HttpServlet {

	@Inject
	private ContextRoot contextRoot;

	private static final long serialVersionUID = 1L;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		ContextProvider contextProvider = (ContextProvider) session.getAttribute("contextProvider");

		if (contextProvider != null) {
			execute(contextProvider, request, response);
		} else {
			System.out.println("New Context: " + session.getId());

			EntityProviderRegistry entityProviderRegistry = contextRoot.get(EntityProviderRegistry.class);
			EntityProvider entityProvider = entityProviderRegistry.lookup("*OFBIZ");

			contextProvider = entityProvider.login(null);
			session.setAttribute("contextProvider", contextProvider);

			if (contextProvider == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}

			execute(contextProvider, request, response);
		}
	}

	protected abstract void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException;

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