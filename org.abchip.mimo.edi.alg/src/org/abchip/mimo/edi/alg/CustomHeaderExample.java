/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.alg;

import com.algorand.algosdk.v2.client.common.AlgodClient;
import com.algorand.algosdk.v2.client.model.NodeStatusResponse;
import com.algorand.algosdk.v2.client.model.BlockResponse;

public class CustomHeaderExample {

	public static void main(String[] args) {

        final String ALGOD_API_ADDR = "https://testnet-algorand.api.purestake.io/ps2";
        final int  ALGOD_PORT = 443;
        final String ALGOD_API_TOKEN = "";

        String[] headers = {"X-API-Key"};
		String[] values = { Keys.X_API_Key };

        AlgodClient client = new AlgodClient(ALGOD_API_ADDR, ALGOD_PORT, ALGOD_API_TOKEN);
        
        NodeStatusResponse status = null;
        
        try {
            status = client.GetStatus().execute(headers, values).body();
        } catch (Exception e) {
            System.err.print("Failed to get algod status: " + e.getMessage());
        }
        
        if(status!=null) {
            System.out.println("algod last round: " + status.lastRound);
            System.out.println("algod time since last round: " + status.timeSinceLastRound);
            System.out.println("algod catchup: " + status.catchupTime);
            System.out.println("algod latest version: " + status.lastVersion);
            
            Long lastRound = status.lastRound;
            try {
                BlockResponse block = client.GetBlock(lastRound).execute(headers, values).body();
                System.out.println("Block info: " + block.block);
            } catch (Exception e) {
                System.err.print("Failed to get block info: " + e.getMessage());
            }
        }
	}
}
