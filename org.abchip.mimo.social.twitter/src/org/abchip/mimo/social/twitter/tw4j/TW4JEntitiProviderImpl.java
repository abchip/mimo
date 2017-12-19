/**

 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.social.twitter.tw4j;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.impl.EntityProviderImpl;
import org.abchip.mimo.social.twitter.Tweet;

public class TW4JEntitiProviderImpl extends EntityProviderImpl {

	@Inject
	private ResourceManager resourceManager;
	
	private EntityProvider entityProvider;
	
	@PostConstruct
	private void init() {
		entityProvider = resourceManager.getEntityProvider(Tweet.class);
		resourceManager.registerProvider(Tweet.class, this);
	}

	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String resource) {
		return entityProvider.getEntityReader(contextProvider, klass, resource);
	}

	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, List<String> resources) {
		return entityProvider.getEntityReader(contextProvider, klass, resources);
	}

	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String resource) {
		return entityProvider.getEntityWriter(contextProvider, klass, resource);
	}
}
