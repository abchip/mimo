/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.http;

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
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public abstract class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}
	
	protected abstract void execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
	
	protected Map<String, Part> parseRequest(HttpServletRequest request) throws IOException, ServletException {

		ServletFileUpload upload = null;
		
		// Must return non-null File. See Servlet 3.1 §4.8.1
		File baseStorage = (File)request.getServletContext().getAttribute(ServletContext.TEMPDIR);
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
				DiskFileItem diskFileItem = (DiskFileItem)item;

				parts.put(diskFileItem.getFieldName(), new MultipartSupportPart(diskFileItem));
			}
		}
		catch (FileUploadException fnfe) {
			throw new IOException(fnfe);
		}

		return parts;
	}
}