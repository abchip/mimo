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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.abchip.mimo.EMFResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Resource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class BaseResourceEntitySerializer {

	private Context context;
	private ResourceSet resourceSet;

	public BaseResourceEntitySerializer(Context context, ResourceSet resourceSet) {
		this.context = context;
		this.resourceSet = resourceSet;
	}

	public <T extends EntityNameable> ByteArrayOutputStream serialize(Resource resource, Class<T> klass, String name, T entity) throws IOException {

		URI uri = buildURI(resource, klass, name);

		// resource object
		synchronized (uri.toString().intern()) {
			EMFResourceImpl emfResource = null;
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			// resourceSet
			synchronized (resourceSet) {
				emfResource = (EMFResourceImpl) resourceSet.getResource(uri, false);
				if (emfResource == null)
					emfResource = (EMFResourceImpl) resourceSet.createResource(uri, "mimo");
				clearResource(emfResource);
				((BasicEObjectImpl) entity).eSetResource(null, null);
				emfResource.getContents().add((EObject) entity);
				emfResource.doSave(output, Collections.EMPTY_MAP);
			}

			return output;
		}
	}

	@SuppressWarnings("unchecked")
	public <T extends EntityNameable> T deserialize(Resource resource, Class<T> klass, String name, InputStream inputStream) throws IOException {

		URI uri = buildURI(resource, klass, name);

		synchronized (uri.toString().intern()) {

			EObject eObject = null;
			synchronized (resourceSet) {
				EMFResourceImpl emfResource = (EMFResourceImpl) resourceSet.getResource(uri, false);
				if (emfResource == null)
					emfResource = (EMFResourceImpl) resourceSet.createResource(uri, "mimo");
				clearResource(emfResource);
				emfResource.doLoad(inputStream, resourceSet.getLoadOptions());
				// TODO Verify me
				inputStream.close();

				if (emfResource.getContents().isEmpty())
					return null;

				eObject = emfResource.getContents().get(0);
			}
			return (T) eObject;
		}
	}

	private void clearResource(EMFResourceImpl emfResource) {
		BasicEObjectImpl oldObject = null;

		if (emfResource.isLoaded() && !emfResource.getContents().isEmpty()) {
			oldObject = (BasicEObjectImpl) emfResource.getContents().get(0);
			if (emfResource.getContents() != null)
				emfResource.getContents().clear();
			oldObject.eSetResource(emfResource, null);
		}
	}

	private <T extends EntityNameable> URI buildURI(Resource resource, Class<T> klass, String name) {

		String uri = "mimo://" + context.getContextDescription().getName() + "/" + resource.getName() + "/" + klass.getSimpleName();
		URI eURI = URI.createURI(uri);

		// TODO remove me
		eURI = eURI.appendFragment(name);

		return eURI;
	}
}