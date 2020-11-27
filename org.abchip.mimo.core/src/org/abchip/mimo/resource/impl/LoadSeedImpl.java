/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import java.io.InputStream;
import java.net.URL;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.LoadSeed;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;
import org.osgi.service.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Load
 * Seed</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.LoadSeedImpl#getSeedId <em>Seed Id</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.LoadSeedImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSeedImpl extends ServiceRequestImpl<ServiceResponse> implements LoadSeed {

	/**
	 * The default value of the '{@link #getSeedId() <em>Seed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSeedId() <em>Seed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedId()
	 * @generated
	 * @ordered
	 */
	protected String seedId = SEED_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;
	private static final Logger LOGGER = Logs.getLogger(LoadSeedImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadSeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.LOAD_SEED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeedId() {
		return seedId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeedId(String newSeedId) {
		String oldSeedId = seedId;
		seedId = newSeedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.LOAD_SEED__SEED_ID, oldSeedId, seedId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.LOAD_SEED__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcePackage.LOAD_SEED__SEED_ID:
				return getSeedId();
			case ResourcePackage.LOAD_SEED__UPDATE:
				return isUpdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcePackage.LOAD_SEED__SEED_ID:
				setSeedId((String)newValue);
				return;
			case ResourcePackage.LOAD_SEED__UPDATE:
				setUpdate((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcePackage.LOAD_SEED__SEED_ID:
				setSeedId(SEED_ID_EDEFAULT);
				return;
			case ResourcePackage.LOAD_SEED__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcePackage.LOAD_SEED__SEED_ID:
				return SEED_ID_EDEFAULT == null ? seedId != null : !SEED_ID_EDEFAULT.equals(seedId);
			case ResourcePackage.LOAD_SEED__UPDATE:
				return update != UPDATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (seedId: ");
		result.append(seedId);
		result.append(", update: ");
		result.append(update);
		result.append(')');
		return result.toString();
	}

	@Override
	public ServiceResponse call() throws Exception {

		ServiceResponse response = this.buildResponse();
		Context context = this.getContext();

		Bundle bundle = context.get(Application.class).getBundle();

		URL seedUrl = bundle.getResource(MimoConstants.SEEDS_PATH + "/" + this.getSeedId() + ".xmi");
		if (seedUrl == null) {
			response.setErrorMessage("Seed not found " + this.getSeedId());
			return response;
		}

		try (InputStream inputStream = seedUrl.openStream()) {

			XMIResource resource = new XMIResourceImpl();
			resource.load(inputStream, null);
			if (!resource.getContents().isEmpty()) {
				EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = context.getResourceManager().getResourceWriter(entityIdentifiable.isa());
						entityWriter.create(entityIdentifiable, this.isUpdate(), true);
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
				}
			}
		}

		return response;
	}

} // LoadSeedImpl
