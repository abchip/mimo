/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.alg;

import org.apache.commons.lang3.ArrayUtils;

import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.transaction.SignedTransaction;
import com.algorand.algosdk.transaction.Transaction;
import com.algorand.algosdk.util.Encoder;
import com.algorand.algosdk.v2.client.common.AlgodClient;
import com.algorand.algosdk.v2.client.common.Response;
import com.algorand.algosdk.v2.client.model.PostTransactionsResponse;
import com.algorand.algosdk.v2.client.model.TransactionParametersResponse;

public class SubmitTx {

	public static void main(String[] args) throws Exception {

		String[] headers = { "X-API-Key" };
		String[] values = { Keys.X_API_Key };

		AlgodClient client = Algorand.connectToNetwork();

		Account src = new Account(Keys.SRC_ACCOUNT);

		final String DEST_ADDR = "3FPHPFXEYCJOXYX3ZFHD3JB64NCZRJHCG2YRXVHVOCPK4U5535MJOHST4A";

		TransactionParametersResponse params = client.TransactionParams().execute(headers, values).body();
		Long amount = 10L;

		String note = "showing prefix and more";

		Transaction tx = Transaction.PaymentTransactionBuilder().sender(src.getAddress()).noteUTF8(note).receiver(DEST_ADDR).amount(amount).suggestedParams(params).build();
		SignedTransaction signedTx = src.signTransaction(tx);

		// send the transaction to the network
		try {
			String[] txHeaders = ArrayUtils.add(headers, "Content-Type");
			String[] txValues = ArrayUtils.add(values, "application/x-binary");
			byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTx);
			Response<PostTransactionsResponse> response = client.RawTransaction().rawtxn(encodedTxBytes).execute(txHeaders, txValues);
			if (!response.isSuccessful())
				System.out.println(response.message());
			else {
				PostTransactionsResponse txResponse = response.body();
				System.out.println("Transaction sent with ID " + txResponse.txId);
				Algorand.waitForConfirmation(client, txResponse.txId, headers, values);
			}
		} catch (Exception e) {
			System.err.println("Exception when calling algod#rawTransaction: " + e);
		}
	}
}