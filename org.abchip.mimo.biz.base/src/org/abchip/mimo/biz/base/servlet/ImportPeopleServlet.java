/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.IOException;
import java.util.Date;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.accounting.tax.TaxFactory;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.Strings;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ImportPeopleServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {

			ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(context, Person.class);
			ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
			ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = resourceManager.getResourceWriter(context, PartyTaxAuthInfo.class);

			for (Part filePart : parseRequest(request).values()) {
				if (!filePart.getName().equals("upload"))
					continue;

				try (HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(filePart.getInputStream()))) {
					HSSFSheet sheet = wb.getSheetAt(0);
					int rows = sheet.getPhysicalNumberOfRows();
					for (int x = 0; x < rows; x++) {
						if (x == 0)
							continue;

						HSSFRow row = sheet.getRow(x);
						HSSFCell a = row.getCell((short) 0);
						HSSFCell b = row.getCell((short) 1);
						// HSSFCell c = row.getCell((short)2);
						HSSFCell d = row.getCell((short) 3);

						String id = a.getStringCellValue();
						String name = b.getStringCellValue();
						// String city = c.getStringCellValue();
						String piva = d.getStringCellValue();

						// String piva = "";
						// String city = c.getStringCellValue();

						Person person = PartyFactory.eINSTANCE.createPerson();
						// Party
						person.setPreferredCurrencyUomId(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
						person.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
						person.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PERSON"));
						// Person
						person.setPartyId(id);
						person.setFirstName(Strings.qINSTANCE.escape(name));

						personWriter.create(person);

						// Party Role
						PartyRole partyRole = PartyFactory.eINSTANCE.createPartyRole();
						partyRole.setPartyId(person);
						partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("CUSTOMER"));
						partyRoleWriter.create(partyRole, true);

						// PartyTaxAuthInfo
						PartyTaxAuthInfo partyTaxAuthInfo = TaxFactory.eINSTANCE.createPartyTaxAuthInfo();
						partyTaxAuthInfo.setPartyId(person);
						partyTaxAuthInfo.setFromDate(new Date());
						partyTaxAuthInfo.setTaxAuthGeoId("ITA");
						partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
						partyTaxAuthInfo.setPartyTaxId("IT-" + piva);
						partyTaxAuthInfo.setIsExempt(true);
						partyTaxAuthInfo.setIsNexus(true);
						partyTaxAuthInfoWriter.create(partyTaxAuthInfo, true);
					}
				}
			}
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().print("{ \"status\": \"server\", \"info\":\"" + "" + "\", \"warning\":\"" + "" + "\" }");

		} catch (ServletException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().print("{ \"status\": \"error\", \"info\":\"" + "" + "\", \"warning\":\"" + "" + "\", \"error\":\"" + e.getMessage() + "\" }");
		}
	}
}