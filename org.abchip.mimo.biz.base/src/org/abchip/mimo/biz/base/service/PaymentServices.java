package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.accounting.payment.CreditCard;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class PaymentServices {

	public static PaymentMethod getPaymentMethodParty(Context context, String partyId, String methodType) {
		
		ResourceManager resourceManager = context.get(ResourceManager.class);
		
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL and paymentMethodTypeId = \"" + methodType + "\"" ;
		String order = "-fromDate";
		ResourceReader<PaymentMethod> paymentMethodReader = resourceManager.getResourceReader(context, PaymentMethod.class);
		for (PaymentMethod paymentMethod : paymentMethodReader.find(filter, null, order)) {
			return paymentMethod;
		}
		return null;
	}

	public static CreditCard getCreditCardParty(Context context, String partyId) {
		
		ResourceManager resourceManager = context.get(ResourceManager.class);
		
		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PaymentMethod> paymentMethodReader = resourceManager.getResourceReader(context, PaymentMethod.class);
		ResourceReader<CreditCard> creditCardReader = resourceManager.getResourceReader(context, CreditCard.class);
		CreditCard creditCard = null;
		for (PaymentMethod paymentMethod : paymentMethodReader.find(filter, null, order)) {
			if(!paymentMethod.getPaymentMethodTypeId().getID().equals("CREDIT_CARD"))
				continue;
			creditCard = creditCardReader.lookup(paymentMethod.getPaymentMethodId());
			break;
		}
		return creditCard;
	}
}