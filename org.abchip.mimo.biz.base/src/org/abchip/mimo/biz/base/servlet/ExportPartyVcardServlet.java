/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.base.service.PartyServices;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;

import ezvcard.Ezvcard;
import ezvcard.VCard;

public class ExportPartyVcardServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String partyId = request.getParameter("partyId");

		try {

			VCard vcard = PartyServices.createVcardFromParty(contextProvider, partyId);

			response.setStatus(HttpServletResponse.SC_OK);
			response.addHeader("Content-disposition", "attachment; filename=" + partyId + ".vcf");
			response.setContentType("text/vcard");

			Ezvcard.write(vcard).go(response.getOutputStream());
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
}