package org.abchip.ofbiz.learning;

import java.util.Locale;
import java.util.Map;

import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.security.Security;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;

public class LearningServices {

	public static Map<String, Object> learningFirstService(DispatchContext dctx, Map<String, Object> context) {

		Map<String, Object> resultMap = ServiceUtil.returnSuccess("You have called on service 'learningFirstService' successfully!");
		return resultMap;
	}

	public static Map<String, Object> handleParameters(DispatchContext dctx, Map<String, Object> context) {

		String firstName = (String) context.get("firstName");
		String lastName = (String) context.get("lastName");
		String planetId = (String) context.get("planetId");

		String message = "firstName: " + firstName + ", ";
		message = message + "lastName: " + lastName + ", ";
		message = message + "planetId: " + planetId;

		Map<String, Object> resultMap = ServiceUtil.returnSuccess(message);

		resultMap.put("fullName", firstName + " " + lastName);
		return resultMap;
	}

	public static Map<String, Object> serviceWithAuth(DispatchContext dctx, Map<String, Object> context) {
		Security security = dctx.getSecurity();
		Map<String, Object> resultMap = null;
		if (context.get("userLogin") == null || !security.hasPermission("LEARN_VIEW", (GenericValue) context.get("userLogin"))) {
			resultMap = ServiceUtil.returnError("You have no access here. You're not welcome!");
		} else {
			resultMap = ServiceUtil.returnSuccess("Welcome! You have access!");
		}
		return resultMap;
	}

	public static Map<String, Object> callingServiceOne(DispatchContext dctx, Map<String, Object> context) {

		LocalDispatcher dispatcher = dctx.getDispatcher();

		String firstName = (String) context.get("firstName");
		String lastName = (String) context.get("lastName");
		String planetId = (String) context.get("planetId");
		GenericValue userLogin = (GenericValue) context.get("userLogin");
		Locale locale = (Locale) context.get("locale");

		Map<String, Object> serviceTwoCtx = UtilMisc.toMap("planetId", planetId, "userLogin", userLogin, "locale", locale);
		Map<String, Object> resultMap = null;
		try {
			resultMap = dispatcher.runSync("learningCallingServiceTwo", serviceTwoCtx);
			resultMap.put("fullName", firstName + " " + lastName);			
		} catch (GenericServiceException e) {
			Debug.logError(e, LearningServices.class.getName());
		}

		return resultMap;
	}

	public static Map<String, Object> callingServiceTwo(DispatchContext dctx, Map<String, Object> context) {

		String planetId = (String) context.get("planetId");
		Map<String, Object> resultMap = null;
		if (planetId.equals("earth")) {
			resultMap = ServiceUtil.returnSuccess("This planet is Earth");
		} else {
			resultMap = ServiceUtil.returnError("This planet is NOT Earth");
		}
		return resultMap;
	}
	
	public static Map<String, Object> callingServiceECA(DispatchContext dctx, Map<String, Object> context) {
		System.out.println(context.get("entityInstance"));
		
		return ServiceUtil.returnSuccess("Ecchime!!");		
	}
}