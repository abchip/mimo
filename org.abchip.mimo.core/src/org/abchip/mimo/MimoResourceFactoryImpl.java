/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.util.Frames;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.osgi.service.log.Logger;

public class MimoResourceFactoryImpl extends ResourceFactoryImpl {

	private static final Logger LOGGER = Logs.getLogger(MimoResourceFactoryImpl.class);

	private MimoResourceSetImpl resourceSet;
	private ResourceProviderRegistry resourceProviderRegistry;

	private static Map<String, Frame<?>> FRAMES = new HashMap<String, Frame<?>>();
	private static final ResourceConfig EMF_RESOURCE_CONFIG = ResourceFactory.eINSTANCE.createResourceConfig();
	
	public MimoResourceFactoryImpl(MimoResourceSetImpl resourceSet, Map<URI, org.eclipse.emf.ecore.resource.Resource> uriResourceMap) {
		super();
		this.resourceSet = resourceSet;
		this.resourceProviderRegistry = getContext().get(ResourceProviderRegistry.class);

		EMF_RESOURCE_CONFIG.setLockSupport(true);
		EMF_RESOURCE_CONFIG.setOrderSupport(true);

		Context context = resourceSet.getContext();

		if (FRAMES.isEmpty()) {
			synchronized (FRAMES) {
				if (FRAMES.isEmpty()) {
					loadFrames();
				}
			}
		}

		@SuppressWarnings("unchecked")
		Frame<Frame<?>> frame = (Frame<Frame<?>>) FRAMES.get(Frame.class.getSimpleName());
		E4FrameClassResourceImpl<Frame<?>> frameResource = new E4FrameClassResourceImpl<Frame<?>>(resourceSet.getResourceSet(), context.getTenant(), frame, FRAMES);
		frameResource.setResourceConfig(EMF_RESOURCE_CONFIG);
		
		URI frameUri = URI.createHierarchicalURI("mimo", null, null, new String[] { Frame.class.getSimpleName() }, null, null);
		uriResourceMap.put(frameUri, new MimoResourceImpl<Frame<?>>(frameResource, resourceSet, frameUri));
	}

	private Context getContext() {
		return resourceSet.getContext();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public org.eclipse.emf.ecore.resource.Resource createResource(URI uri) {

		String frameId = uri.segment(0);
		String tenantId = uri.authority();

		try {

			Frame<EntityIdentifiable> frame = (Frame<EntityIdentifiable>) FRAMES.get(frameId);

			Resource<EntityIdentifiable> resource = null;
			if (frame.isEnum()) {
				resource = new E4FrameEnumResourceImpl(resourceSet.getResourceSet(), tenantId, frame, getEnumerators(frame));
				resource.setResourceConfig(EMF_RESOURCE_CONFIG);
			} else {
				ResourceProvider resourceProvider = resourceProviderRegistry.getResourceProvider(getContext(), frameId);
				resource = resourceProvider.createResource(resourceSet.getResourceSet(), frame, tenantId);
			}

			org.eclipse.emf.ecore.resource.Resource.Internal e4resource = new MimoResourceImpl(resource, this.resourceSet, uri);
			((InternalEObject) resource).eSetResource(e4resource, null);

			return e4resource;
		} catch (ResourceException e) {
			return null;
		}
	}

	private void loadFrames() {

		EntityPackage.eINSTANCE.getEntity();

		Queue<EClassifier> eClassifiers = new LinkedList<EClassifier>();
		eClassifiers.addAll(Frames.getEClassifiers().values());

		// consuming order
		{
			// entity
			EClass eClass = EntityPackage.eINSTANCE.getEntity();
			if (eClassifiers.remove(eClass))
				FRAMES.put(eClass.getName(), new E4FrameClassAdapter<>(null, eClass));
		}
		{
			// entity identifiable
			EClass eClass = EntityPackage.eINSTANCE.getEntityIdentifiable();
			if (eClassifiers.remove(eClass))
				FRAMES.put(eClass.getName(), new E4FrameClassAdapter<>(FRAMES.get(EntityPackage.eINSTANCE.getEntity().getName()), eClass));
		}
		{
			// frame
			EClass eClass = EntityPackage.eINSTANCE.getFrame();
			if (eClassifiers.remove(eClass))
				FRAMES.put(eClass.getName(), new E4FrameClassAdapter<>(FRAMES.get(EntityPackage.eINSTANCE.getEntityIdentifiable().getName()), eClass));
		}

		while (!eClassifiers.isEmpty()) {
			EClassifier eClassifier = eClassifiers.poll();

			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;

				// before parent
				if (eClass.getESuperTypes().isEmpty()) {
					LOGGER.warn("Invlaid class {}", eClass.getName());
					continue;
				}

				EClass eSuperType = eClass.getESuperTypes().get(0);
				if (eClassifiers.contains(eSuperType)) {
					eClassifiers.add(eClass);
					continue;
				} else if (!FRAMES.containsKey(eSuperType.getName())) {
					LOGGER.warn("Unknown class {}", eSuperType.getName());
					continue;
				}

				FRAMES.put(eClass.getName(), new E4FrameClassAdapter<>(FRAMES.get(eSuperType.getName()), eClass));

			} else if (eClassifier instanceof EEnum) {
				EEnum eEnum = (EEnum) eClassifier;
				FRAMES.put(eEnum.getName(), new E4FrameEnumAdapter<>(eEnum));
			} else {
				LOGGER.warn("Unknown classifier {}", eClassifier.getName());
			}
		}

		FRAMES = Collections.unmodifiableMap(FRAMES);
	}

	private Map<String, EntityEnum> getEnumerators(Frame<EntityIdentifiable> frame) {
		Map<String, EntityEnum> enums = new HashMap<String, EntityEnum>();

		E4FrameEnumAdapter<?> frameEnum = (E4FrameEnumAdapter<?>) frame;
		EEnum eEnum = frameEnum.getEEnum();

		for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
			EntityEnum entity = new E4EntityEnumAdapter(eEnumLiteral);
			enums.put(eEnumLiteral.getName(), entity);
		}
		return enums;
	}
}
