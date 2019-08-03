/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet.session;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GoogleResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String TokenServiceUri = "https://oauth2.googleapis.com/token";
	public static final String TokenInfoUri = "https://oauth2.googleapis.com/tokeninfo";

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom()
            .setCookieSpec(CookieSpecs.STANDARD)
            .build();


	@Inject
	private ResourceManager resourceManager;

	private EntityProvider entityProvider = null;

	protected EntityProvider getDefaultProvider() {
		if (this.entityProvider == null) {
			synchronized (this) {
				if (this.entityProvider == null) {
					this.entityProvider = resourceManager.getProvider("UserLogin");
				}
			}
		}

		return this.entityProvider;
	}

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String authorizationCode = request.getParameter("code");
        if (authorizationCode == null || authorizationCode.isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google failed fo get authorization code");
			return;
        }

		AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
		ContextProvider contextProvider = getDefaultProvider().login(null, authentication);

        // dovremmo accedere con ProductStore e data
		String entityName = "OAuth2Google";
		EntityReader<?> oauth2Reader = resourceManager.getEntityReader(contextProvider, entityName, ResourceScope.CTX);
		EntityNameable oauth2Google = oauth2Reader.find(null).next();

		contextProvider.getContext().close();
		
        if (oauth2Google == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google get OAuth2 configuration error");
			return;
        }
        
		String clientId = oauth2Google.isa().getValue(oauth2Google, "clientId").toString();
		String returnURI = oauth2Google.isa().getValue(oauth2Google, "returnUrl").toString();
		String secret = oauth2Google.isa().getValue(oauth2Google, "clientSecret").toString();
        String accessToken = null;
        String idToken = null;
        
        HttpPost postMethod = null;
        try {
            URI uri = new URIBuilder()
                    .setPath(TokenServiceUri)
                    .setParameter("client_id", clientId)
                    .setParameter("client_secret", secret)
                    .setParameter("grant_type", "authorization_code")
                    .setParameter("code", authorizationCode)
                    .setParameter("redirect_uri", returnURI)
                    .build();

            postMethod = new HttpPost(uri);
            CloseableHttpClient client = HttpClients.custom().build();
            postMethod.setConfig(StandardRequestConfig);
            HttpResponse postResponse = client.execute(postMethod);
            String responseString = new BasicResponseHandler().handleResponse(postResponse);
            if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            	JsonFactory factory = new JsonFactory();
            	JsonParser  parser  = factory.createParser(responseString);            	
            	HashMap<?, ?> userMap = new ObjectMapper().readValue(parser, HashMap.class);
                accessToken = (String) userMap.get("access_token");
                idToken = (String) userMap.get("id_token");
                // Debug.logInfo("Generated Access Token : " + accessToken, module);
            } else {
    			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google get OAuth2 access token error");
    			return;
            }
        } catch (Exception e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}        

        // checkLogin
    	AuthenticationUserToken authenticationUserToken = ContextFactory.eINSTANCE.createAuthenticationUserToken();
    	authenticationUserToken.setIdToken(idToken);
    	authenticationUserToken.setAccessToken(accessToken);
    	authenticationUserToken.setProvider("Google");

    	this.getDefaultProvider().checkLogin(authenticationUserToken, true);
	}
}