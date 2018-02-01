package org.abchip.ofbiz.learning;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LearningEvents {
	
	public static String processQuestion(HttpServletRequest request, HttpServletResponse response) {

		String question = request.getParameter("question");
		System.out.println(question);

		request.setAttribute("submit", "true");
		
		return "success";
	}
}
