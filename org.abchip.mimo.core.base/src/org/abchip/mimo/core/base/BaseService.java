/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.MimoResourceFactoryImpl;
import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.MimoResourceSetImpl;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceReader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class BaseService {

	// root ResourceSet
	private ResourceSet resourceSet = null;

	protected final void checkAuthorization(ContextProvider contextProvider, String tenant) {
		ContextDescription contextDescription = contextProvider.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			// if (!contextDescription.getTenant().equals(tenant))
			// throw new SecurityException("Permission denied for tenant: " +
			// contextDescription.getTenant());
		}

		// check frame authorization
	}

	protected <E extends EntityNameable> MimoResourceImpl<E> getInternalResource(ContextProvider contextProvider, String frame, String tenant) {

		URI uri = URI.createHierarchicalURI("mimo", null, null, new String[] { frame }, null, null);
		@SuppressWarnings("unchecked")
		MimoResourceImpl<E> internal = (MimoResourceImpl<E>) getResourceSet(contextProvider).getResource(uri, true);

		return internal;
	}

	private ResourceSet getResourceSet(ContextProvider contextProvider) {

		if (contextProvider.getContext() instanceof ContextRoot)
			return resourceSet;

		ResourceSet resourceSet = contextProvider.getContext().get(ResourceSet.class);
		if (resourceSet == null) {
			synchronized (contextProvider.getContext()) {
				resourceSet = new MimoResourceSetImpl(contextProvider);
				resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(resourceSet));
				contextProvider.getContext().set(ResourceSet.class, resourceSet);
			}
		}

		return resourceSet;
	}

	@SuppressWarnings("unchecked")
	protected <E extends EntityNameable> void prepareListener(ResourceReader<E> resource) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(resource.getFrame().getName());
		if (notifier == null)
			notifier = prepareNotifier(resource.getFrame());

		if (notifier != null && !notifier.getListeners().isEmpty())
			resource.setNotifier(notifier);
	}

	protected <E extends EntityNameable> ResourceNotifier<E> prepareNotifier(Frame<E> frame) {

		ResourceNotifier<E> notifier = ResourceFactory.eINSTANCE.createResourceNotifier();
		notifiers.put(frame.getName(), notifier);

		for (Frame<?> ako : frame.getSuperFrames()) {

			@SuppressWarnings("unchecked")
			ResourceNotifier<E> typedNotifier = (ResourceNotifier<E>) notifiers.get(ako.getName());
			if (typedNotifier != null) {
				for (ResourceListener<E> resourceListener : typedNotifier.getListeners())
					notifier.registerListener(resourceListener);
			}
		}

		return notifier;
	}

}
