/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.URIs;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MimoResourceImpl<E extends EntityIdentifiable> extends ResourceImpl {

	private Resource<E> resource = null;
	private ResourceReader<E> resourceReader = null;

	@SuppressWarnings("unchecked")
	public MimoResourceImpl(ResourceSet resourceSet, URI uri) {
		super(uri);

		this.resourceSet = resourceSet;

		String frameName = getURI().segment(0);
		String tenant = null;
		if (getURI().hasQuery())
			tenant = URIs.qINSTANCE.parseParameter(getURI().query()).get("tenant");

		if (Frame.class.getSimpleName().equals(frameName)) {
			this.resource = EMFResourceProviderImpl.internalGetResource(this.getContext(), null, tenant);
		} else {
			ResourceManager resourceManager = this.getContext().get(ResourceManager.class);
			Frame<E> frame = (Frame<E>) resourceManager.getFrame(getContext(), frameName);
			if (frame.isEnum()) {
				this.resource = EMFResourceProviderImpl.internalGetResource(this.getContext(), frame, tenant);
			} else {
				ResourceProviderRegistry resourceProviderRegistry = this.getContext().get(ResourceProviderRegistry.class);
				this.resource = resourceProviderRegistry.getResourceProvider(this.getContext(), frame).getResource(this.getContext(), frame, tenant);
			}
		}
	}

	public Resource<E> getResource() {
		return this.resource;
	}

	private ResourceReader<E> getResourceReader() {

		if (this.resourceReader == null) {
			synchronized (this) {
				if (this.resourceReader == null) {
					ResourceManager resourceManager = this.getContext().get(ResourceManager.class);
					this.resourceReader = resourceManager.getResourceReader(this.getContext(), this.resource.getFrame(), this.resource.getTenant());
				}
			}
		}

		return this.resourceReader;
	}

	public Context getContext() {
		if (!(this.getResourceSet() instanceof MimoResourceSetImpl))
			return null;

		MimoResourceSetImpl resourceSet = (MimoResourceSetImpl) this.getResourceSet();
		return resourceSet.getContext();
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

		String id = EcoreUtil.getID(eObject);
		if (id != null)
			return id;

		if (eObject instanceof EntityIdentifiable) {
			EntityIdentifiable entityIdentifiable = (EntityIdentifiable) eObject;

			StringBuffer name = new StringBuffer();

			Frame<?> frame = entityIdentifiable.isa();
			for (String key : frame.getKeys()) {
				if (!name.toString().isEmpty())
					name.append("/");
				Object value = frame.getValue(entityIdentifiable, key, false);
				if (value == null)
					break;

				if (value instanceof EntityIdentifiable)
					name.append(((EntityIdentifiable) value).getID());
				else {
					if (value instanceof Date) {
						Date date = (Date) value;
						DateFormat dateFormat = new SimpleDateFormat(MimoConstants.DATE_TIME_FORMAT);
						value = dateFormat.format(date);
					}

					name.append(value);
				}
			}

			if (name.toString().isEmpty())
				throw new RuntimeException("Unexpected condition 53oqv4ignu84bgo8atyby9087");

			return name.toString();
		}

		return null;
	}

	@Override
	public EObject getEObject(String uriFragment) {
		return (EObject) this.getResourceReader().lookup(uriFragment);
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