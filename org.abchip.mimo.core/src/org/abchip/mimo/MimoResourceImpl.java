/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.util.Entities;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.osgi.service.log.Logger;

public class MimoResourceImpl<E extends EntityIdentifiable> extends ResourceImpl implements ContextProvider {

	private static final Logger LOGGER = Logs.getLogger(MimoResourceImpl.class);

	private Resource<E> resource = null;

	public MimoResourceImpl(Resource<E> resource, ResourceSet resourceSet, URI uri) {
		super(uri);

		this.resource = resource;
		this.resourceSet = resourceSet;
	}

	public Resource<E> getResource() {
		return this.resource;
	}

	@Override
	public Context getContext() {
		return this.getResource().getContext();
	}

	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		// TODO Auto-generated method stub
		"".toString();
	}

	@Override
	public EList<EObject> getContents() {
		return super.getContents();
	}

	@Override
	public TreeIterator<EObject> getAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURIFragment(EObject eObject) {
		return Entities.getID(eObject);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		try {
			return (EObject) this.getResource().lookup(uriFragment, null, false);
		} catch (ResourceException e) {
			LOGGER.error(e.getMessage());
			throw new RuntimeException("Unexpected condition bsda8f7tsd8rf7ewr4b86ds");
		}
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		"".toString();
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
	}

	@Override
	public boolean isTrackingModification() {
		// TODO Auto-generated method stub
		return super.isTrackingModification();
	}

	@Override
	public void setTrackingModification(boolean isTrackingModification) {
		// TODO Auto-generated method stub
		super.setTrackingModification(isTrackingModification);
	}

	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return super.isModified();
	}

	@Override
	public void setModified(boolean isModified) {
		// TODO Auto-generated method stub
		super.setModified(isModified);
	}

	@Override
	public boolean isLoaded() {
		return true;
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		"".toString();
	}

	@Override
	public EList<Diagnostic> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Diagnostic> getWarnings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoading() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		super.doSave(outputStream, options);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		super.doLoad(inputStream, options);
	}

	@Override
	protected void doUnload() {
		// TODO Auto-generated method stub
		super.doUnload();
	}

	@Override
	public NotificationChain basicSetResourceSet(ResourceSet resourceSet, NotificationChain notifications) {
		return super.basicSetResourceSet(resourceSet, notifications);
	}

	@Override
	public void setURI(URI uri) {
		// TODO Auto-generated method stub
		super.setURI(uri);
	}

	@Override
	public void setIntrinsicIDToEObjectMap(Map<String, EObject> intrinsicIDToEObjectMap) {
		// TODO Auto-generated method stub
		super.setIntrinsicIDToEObjectMap(intrinsicIDToEObjectMap);
	}

	@Override
	public void attached(EObject eObject) {
		// TODO Auto-generated method stub
		super.attached(eObject);
	}

	@Override
	public void detached(EObject eObject) {
		// TODO Auto-generated method stub
		super.detached(eObject);
	}

	@Override
	public String toKeyString() {
		// TODO Auto-generated method stub
		return super.toKeyString();
	}
}