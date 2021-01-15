/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.alg;

import com.algorand.algosdk.v2.client.common.IndexerClient;

public class IndexerAssetSearch {
	public static void main(String[] args) throws Exception {
		final String ALGOD_API_ADDR = "https://testnet-algorand.api.purestake.io/idx2";
		final int ALGOD_PORT = 443;
		final String ALGOD_API_TOKEN = "";

		String[] headers = { "X-API-Key" };
		String[] values = { Keys.X_API_Key };

		IndexerClient client = new IndexerClient(ALGOD_API_ADDR, ALGOD_PORT, ALGOD_API_TOKEN);

		String name = "test";
		Long limit = 1L;
		String response = client.searchForAssets().name(name).limit(limit).execute(headers, values).toString();
		System.out.println(response);
	}
}
