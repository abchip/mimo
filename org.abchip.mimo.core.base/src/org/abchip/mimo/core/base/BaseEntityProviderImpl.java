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
package org.abchip.mimo.core.base;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.EMFFrameAdapter;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.impl.EntityProviderImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Descriptor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BaseEntityProviderImpl extends EntityProviderImpl {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;

	private Map<String, Frame<?>> frames = null;
	
	@PostConstruct
	private void init() {
		this.frames = new HashMap<String, Frame<?>>();

		// frame
		loadFrames();

		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(BaseConstants.ENTITY_DOMAIN_NAME, "mimo");
		dictionary.put(BaseConstants.ENTITY_PROVIDER_FRAME, Frame.class.getSimpleName());

//		contextRoot.set(EntityProvider.class.getName(), provider, false, dictionary);

//		resourceManager.registerProvider(Frame.class, this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource) {
		if (isFrame(frame)) {
			return (EntityReader<E>) ResourceHelper.wrapReader(contextProvider, frames);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources) {
		if (isFrame(frame)) {
			return (EntityReader<E>) ResourceHelper.wrapReader(contextProvider, frames);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource) {
		if (isFrame(frame)) {
			throw new UnsupportedOperationException();
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void loadFrames() {
		for (Entry<?, ?> entry : EPackage.Registry.INSTANCE.entrySet()) {

			EPackage ePackage = null;
			if (entry.getValue() instanceof EPackage.Descriptor) {
				EPackage.Descriptor descriptor = (Descriptor) entry.getValue();
				ePackage = descriptor.getEPackage();
			} else
				ePackage = (EPackage) entry.getValue();

			EAnnotation eAnnotation = ePackage.getEAnnotation(EntityPackage.eNS_URI);
			if (eAnnotation != null) {
				EObject eObject = EcoreUtil.create((EClass) eAnnotation.getReferences().get(0));

				for (String key : eAnnotation.getDetails().keySet()) {
					EStructuralFeature dataDefFeature = eObject.eClass().getEStructuralFeature(key);

					if (dataDefFeature == null)
						continue;

					if (dataDefFeature.getDefaultValue() instanceof Number)
						eObject.eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
					else
						eObject.eSet(dataDefFeature, eAnnotation.getDetails().get(key));
				}
			}

			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (EntityPackage.eINSTANCE.getEntityNameable().isSuperTypeOf(eClass)) {
						this.frames.put(eClass.getName(), new EMFFrameAdapter<>(eClass));
					}
				}
			}
		}
	}
	
	private boolean isFrame(Frame<?> frame) {
		return frame.getName().equals(Resource.class.getSimpleName());
	}
}