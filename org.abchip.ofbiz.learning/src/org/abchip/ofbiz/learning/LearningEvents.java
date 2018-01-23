package org.abchip.ofbiz.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ofbiz.base.util.UtilHttp;

public class LearningEvents {
	public static String processFirstForm(HttpServletRequest request, HttpServletResponse response) {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		request.setAttribute("combined", firstName + " " + lastName);

		request.setAttribute("allParams", UtilHttp.getParameterMap(request));

		request.setAttribute("submit", "Submitted");

		return "success";
	}

	public static String processMultiForm(HttpServletRequest request, HttpServletResponse response) {

		Collection<Map<String, Object>> parsed = UtilHttp.parseMultiFormData(UtilHttp.getParameterMap(request));

		List<String> combined = new ArrayList<String>();
		Iterator<Map<String, Object>> parsedItr = parsed.iterator();

		while (parsedItr.hasNext()) {
			Map<String, Object> record = parsedItr.next();
			combined.add(record.get("firstName") + " " + record.get("lastName"));
		}
		request.setAttribute("combined", combined);
		request.setAttribute("allParams", UtilHttp.getParameterMap(request));
		request.setAttribute("submit", "Submitted");

		return "success";

	}
}
