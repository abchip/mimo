/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.ClassifierRegistry;

public class BaseMiningManagerImpl implements MiningManager {

	private ClassifierRegistry classifierRegistry;

	@Inject
	public BaseMiningManagerImpl(Application application) {
		this.classifierRegistry = application.getContext().get(ClassifierRegistry.class);
	}

	@Override
	public <E extends Entity> List<Classification<E>> classify(Context context, Class<E> klass, Object object) {

		Classifier classifier = lookupClassifier(klass, object.getClass());
		if (classifier == null)
			return null;

		return classifier.classify(context, klass, object);
	}

	@Override
	public Classifier lookupClassifier(Class<?> klass, Class<?> object) {

		Classifier classifier = null;
		for (Classifier tempClassifier : classifierRegistry.list()) {
			if (tempClassifier.isClassifierFor(klass, object)) {
				classifier = tempClassifier;
				break;
			}
		}
		return classifier;
	}
}
