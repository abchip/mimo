/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.net.URI;
import java.util.List;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityState;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Object
 * Identifiable</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityIdentifiableImpl extends EntityImpl implements EntityIdentifiable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityIdentifiableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_IDENTIFIABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings({ "unchecked", "resource" })
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {

		EAttribute eIDAttribute = eClass().getEIDAttribute();
		EStructuralFeature eFeature = eClass().getEStructuralFeature(featureID);

		if (eFeature.isMany()) {
			if (!eIsSet(featureID)) {

				if (!(eResource() instanceof MimoResourceImpl))
					return super.eGet(featureID, resolve, coreType);

				Slot slot = isa().getSlot(eFeature.getName());
				if (slot.getDomain() == null)
					return super.eGet(featureID, resolve, coreType);

				MimoResourceImpl<EntityIdentifiable> resource = (MimoResourceImpl<EntityIdentifiable>) eResource();
				Context context = resource.getContext();
				ResourceManager resourceManager = context.get(ResourceManager.class);
				ResourceReader<?> resourceReader = resourceManager.getResourceReader(context, slot.getDomain().getFrame());
				String filter = slot.getDomain().getRoute();
				if (filter == null || filter.trim().isEmpty()) {
					if (eIDAttribute != null) {
						if (slot.isString() || slot.getDomain() != null)
							filter = eIDAttribute.getName() + " = '" + this.getID() + "'";
						else
							filter = eIDAttribute.getName() + " = " + this.getID();
					} else
						return super.eGet(featureID, resolve, coreType);
				}

				List<EntityIdentifiable> values = new EDataTypeUniqueEList<EntityIdentifiable>(EntityIdentifiable.class, this, featureID);
				for (EntityIdentifiable entityIdentifiable : resourceReader.find(filter)) {
					String domainKey = entityIdentifiable.isa().getKeys().get(0);
					entityIdentifiable.isa().setValue(entityIdentifiable, domainKey, this);
					values.add(entityIdentifiable);
				}
				super.eSet(eFeature, values);

				return values;

			}
		}

		switch (this.getState()) {
		case PROXY:
			if (eFeature == eIDAttribute)
				return this.getURI().getFragment();

			EntityIdentifiableImpl eObject = (EntityIdentifiableImpl) EcoreUtil.resolve(this, this);
			this.eBasicSetSettings(eObject.eBasicSettings());
			this.eSetProxyURI(null);
			break;
		case DIRTY:
		case RESOLVED:
		case TRANSIENT:
		}

		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(this).toString());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EntityState getState() {

		if (eIsProxy())
			return EntityState.PROXY;
		else if (eResource() instanceof MimoResourceImpl)
			return EntityState.RESOLVED;
		else if (eResource() != null)
			return EntityState.TRANSIENT;
		else
			return EntityState.TRANSIENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getID() {

		String id = EcoreUtil.getID(this);
		if (id != null)
			return id;

		String uriFragment = this.getURI().getFragment();
		if (uriFragment != null)
			return uriFragment;

		throw new RuntimeException("Unexpected condition: d66ncotib56ohmjhi4w");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings({ "unchecked" })
	@Override
	public <E extends Entity> Frame<E> isa() {
		if (this.eResource() instanceof MimoResourceImpl) {
			MimoResourceImpl<?> interal = (MimoResourceImpl<?>) this.eResource();
			return (Frame<E>) interal.getResource().getFrame();
		} else
			return super.isa();
	}
} // EntityIdentifiableImpl
