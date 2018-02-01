package org.abchip.ofbiz.learning;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.webtools.labelmanager.LabelManagerFactory;

public class LearningServices {

	public static Map<String, Object> selectQuestion(DispatchContext dctx, Map<String, Object> context) {

		Map<String, Object> resultMap = ServiceUtil.returnSuccess("ecchime");
		System.out.println(context.get("question"));
		try {
			LabelManagerFactory factory = LabelManagerFactory.getInstance();
			factory.findMatchingLabels("learning", "LearningToBePhrases.xml", null, null, false);

			Set<String> labelList = factory.getLabelsList();
			int x = new Random().nextInt(labelList.size());
			String question = (String) labelList.toArray()[x];
			question = question.replaceAll("Learning_ToBe_", "");
			question = question.substring(0, question.indexOf("#"));
			
	        resultMap.put("question", question);
		} catch (Exception e) {
			resultMap = ServiceUtil.returnError(e.getMessage());			
		}
		return resultMap;
	}
}