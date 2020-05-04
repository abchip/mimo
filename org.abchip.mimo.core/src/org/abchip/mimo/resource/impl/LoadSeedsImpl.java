/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.LoadSeeds;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Enumerations;
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
 * Seeds</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.LoadSeedsImpl#getSeedPattern <em>Seed Pattern</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.LoadSeedsImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSeedsImpl extends ServiceRequestImpl<ServiceResponse> implements LoadSeeds {

	/**
	 * The default value of the '{@link #getSeedPattern() <em>Seed Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_PATTERN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSeedPattern() <em>Seed Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedPattern()
	 * @generated
	 * @ordered
	 */
	protected String seedPattern = SEED_PATTERN_EDEFAULT;
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
	private static final Logger LOGGER = Logs.getLogger(LoadSeedsImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadSeedsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.LOAD_SEEDS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeedPattern() {
		return seedPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeedPattern(String newSeedPattern) {
		String oldSeedPattern = seedPattern;
		seedPattern = newSeedPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.LOAD_SEEDS__SEED_PATTERN, oldSeedPattern, seedPattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.LOAD_SEEDS__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcePackage.LOAD_SEEDS__SEED_PATTERN:
				return getSeedPattern();
			case ResourcePackage.LOAD_SEEDS__UPDATE:
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
			case ResourcePackage.LOAD_SEEDS__SEED_PATTERN:
				setSeedPattern((String)newValue);
				return;
			case ResourcePackage.LOAD_SEEDS__UPDATE:
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
			case ResourcePackage.LOAD_SEEDS__SEED_PATTERN:
				setSeedPattern(SEED_PATTERN_EDEFAULT);
				return;
			case ResourcePackage.LOAD_SEEDS__UPDATE:
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
			case ResourcePackage.LOAD_SEEDS__SEED_PATTERN:
				return SEED_PATTERN_EDEFAULT == null ? seedPattern != null : !SEED_PATTERN_EDEFAULT.equals(seedPattern);
			case ResourcePackage.LOAD_SEEDS__UPDATE:
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
		result.append(" (seedPattern: ");
		result.append(seedPattern);
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
		Enumeration<URL> entries = bundle.findEntries(MimoConstants.SEEDS_PATH + "/" + this.getSeedPattern(), null, false);
		List<URL> elements = Enumerations.sort(entries, new Comparator<URL>() {
			@Override
			public int compare(URL o1, URL o2) {
				return o1.getPath().compareTo(o2.getPath());
			}

		});

		for (URL seedUrl : elements) {
			try (InputStream inputStream = seedUrl.openStream()) {

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				if (resource.getContents().isEmpty())
					continue;

				EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = context.getResourceManager().getResourceWriter(entityIdentifiable.isa(), this.getTenant());
						entityWriter.create(entityIdentifiable, this.isUpdate());
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
				}
			} catch (IOException e) {
				LOGGER.warn(e.getMessage());
			}
		}

		return response;
	}
} // LoadSeedsImpl
