/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.base;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.ClassifierRegistry;

public class BaseMiningManagerImpl implements MiningManager {

	@Inject
	private ClassifierRegistry classifierRegistry;
	
	@Override
	public <E extends Entity> Classification<E> classify(ContextProvider contextProvider, Class<E> klass, Object object) {

		Classifier classifier = classifierRegistry.lookup(klass, object);
		if(classifier == null)
			return null;
		
		return classifier.classify(contextProvider, klass, object);
	}

}
