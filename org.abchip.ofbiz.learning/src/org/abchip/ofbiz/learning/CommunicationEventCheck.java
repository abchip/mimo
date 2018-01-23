package org.abchip.ofbiz.learning;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ofbiz.party.contact.ContactMechWorker;

public class CommunicationEventCheck {

    @SuppressWarnings("unchecked")
	public static String checkMars(HttpServletRequest request, HttpServletResponse response) {

    	String partyId = request.getParameter("partyId");
    	Map<String, Object> mechMap = new HashMap<String, Object>();
    	ContactMechWorker.getContactMechAndRelated(request, partyId, mechMap);
    	Map<String, Object> postalAddress = (Map<String, Object>) mechMap.get("postalAddress");
    	if(postalAddress == null)
    		return "notMars";
    	
    	String planet = (String)postalAddress.get("planet");
    	if(planet == null || !planet.equalsIgnoreCase("Mars"))
    		return "notMars";
    	
    	return "isMars";
    }
}
