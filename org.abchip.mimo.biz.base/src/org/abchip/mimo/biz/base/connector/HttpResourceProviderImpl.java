/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.BizProviderConfig;
import org.abchip.mimo.biz.BizProviderUser;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageType;
import org.abchip.mimo.edi.transmission.Transmission;
import org.abchip.mimo.edi.transmission.TransmissionType;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ResourceManager resourceManager;
	
	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);		
		this.resourceConfig.setOrderSupport(false);

		resourceManager.registerProvider(BizEntity.class, this);
		resourceManager.registerProvider(BizEntityTyped.class, this);
		resourceManager.registerProvider(BizEntityType.class, this);
		resourceManager.registerProvider(BizEntityNote.class, this);

		resourceManager.registerProvider(EdiFrameSetup.class, this);
		resourceManager.registerProvider(MessageType.class, this);
		resourceManager.registerProvider(Message.class, this);
		resourceManager.registerProvider(Transmission.class, this);
		resourceManager.registerProvider(TransmissionType.class, this);
	}

	@Override
	public <E extends EntityNameable> Resource<E> doGetResource(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		HttpConnector connector = contextProvider.getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		Resource<E> resource = new HttpResourceImpl<E>(contextProvider, frame, tenant, connector);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}