/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.base.service.PartyServices;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.ResourceManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.IOUtils;

import ezvcard.Ezvcard;
import ezvcard.VCard;

public class ExportPartyVcardServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String partyId = request.getParameter("partyId");
		VCard vcard = PartyServices.createVcardFromParty(resourceManager, contextProvider, partyId);

		//
		File file = new File(partyId + ".vcf");
		Ezvcard.write(vcard).go(file);

		// Set the content type and attachment header.
		response.setStatus(HttpServletResponse.SC_OK);
		response.addHeader("Content-disposition", "attachment; filename=" + file.getName());
		response.setContentType("text/vcard");

		try (InputStream myStream = FileUtils.openInputStream(file)) {
			IOUtils.copy(myStream, response.getOutputStream());
			response.flushBuffer();
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
}