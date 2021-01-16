/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.alg;

import com.algorand.algosdk.v2.client.common.AlgodClient;
import com.algorand.algosdk.v2.client.model.PendingTransactionResponse;

public class Algorand {

	protected static AlgodClient connectToNetwork() {
		final String ALGOD_API_ADDR = "https://testnet-algorand.api.purestake.io/ps2";
		final int ALGOD_PORT = 443;
		final String ALGOD_API_TOKEN = "";

		AlgodClient client = new AlgodClient(ALGOD_API_ADDR, ALGOD_PORT, ALGOD_API_TOKEN);

		return client;
	}

	protected static void waitForConfirmation(AlgodClient client, String txID, String[] headers, String[] values) throws Exception {
		Long lastRound = client.GetStatus().execute(headers, values).body().lastRound;
		while (true) {
			try {
				// Check the pending tranactions
				PendingTransactionResponse pendingInfo = client.PendingTransactionInformation(txID).execute(headers, values).body();
				if (pendingInfo.confirmedRound != null && pendingInfo.confirmedRound > 0) {
					System.out.println("Transaction confirmed in round " + pendingInfo.confirmedRound);
					break;
				}
				lastRound++;
				client.WaitForBlock(lastRound).execute(headers, values);
			} catch (Exception e) {
				throw (e);
			}
		}
	}
}
