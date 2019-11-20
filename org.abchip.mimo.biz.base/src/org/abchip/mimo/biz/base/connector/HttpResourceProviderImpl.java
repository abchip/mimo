/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageType;
import org.abchip.mimo.edi.transmission.Transmission;
import org.abchip.mimo.edi.transmission.TransmissionType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class HttpResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceProviderRegistry resourceProviderRegistry;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);
		this.resourceConfig.setOrderSupport(false);

		resourceProviderRegistry.registerProvider(contextRoot, BizEntity.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, BizEntityTyped.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, BizEntityType.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, BizEntityNote.class, this);

		resourceProviderRegistry.registerProvider(contextRoot, EdiFrameSetup.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, MessageType.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, Message.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, Transmission.class, this);
		resourceProviderRegistry.registerProvider(contextRoot, TransmissionType.class, this);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(Context context, Frame<E> frame, String tenant) {

		HttpConnector connector = context.get(HttpConnector.class);
		if (connector == null)
			return null;

		Resource<E> resource = new HttpResourceImpl<E>(context, frame, tenant, connector);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}