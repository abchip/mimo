package org.abchip.mimo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.URIs;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class MimoResourceImpl extends ResourceImpl {

	private ResourceReader<?> resourceReader = null;

	public MimoResourceImpl(URI uri) {
		super(uri);
	}

	protected ResourceReader<?> getResourceReader() {

		if (this.resourceReader == null) {
			synchronized (this) {
				if (this.resourceReader == null) {
					Context context = this.getContextProvider().getContext();
					String frameName = getURI().segment(0);
					String tenant = null;
					if (getURI().hasQuery())
						tenant = URIs.qINSTANCE.parseParameter(getURI().query()).get("tenant");

					ResourceManager resourceManager = context.get(ResourceManager.class);
					this.resourceReader = resourceManager.getEntityReader(context, frameName, tenant);
				}
			}
		}

		return this.resourceReader;
	}

	public ContextProvider getContextProvider() {
		if (!(this.getResourceSet() instanceof MimoResourceSetImpl))
			return null;

		MimoResourceSetImpl resourceSet = (MimoResourceSetImpl) this.getResourceSet();
		return resourceSet.getContextProvider();
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
		// TODO Auto-generated method stub
		return super.getURIFragment(eObject);
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