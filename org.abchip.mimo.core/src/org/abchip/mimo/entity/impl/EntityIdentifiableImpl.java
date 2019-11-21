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
	 * 
	 * @generated
	 */
	protected EntityIdentifiableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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

		EStructuralFeature eFeature = eClass().getEStructuralFeature(featureID);
		if (eFeature.isMany() && eFeature instanceof EAttribute) {
			if (!eIsSet(featureID)) {
				if (eIsProxy()) {
					"".toString();
				} else if (eResource() instanceof MimoResourceImpl) {

					Slot slot = isa().getSlot(eFeature.getName());
					if (slot.getDomain() == null)
						return super.eGet(featureID, resolve, coreType);

					MimoResourceImpl<EntityIdentifiable> resource = (MimoResourceImpl<EntityIdentifiable>) eResource();
					Context context = resource.getContext();
					ResourceManager resourceManager = context.get(ResourceManager.class);
					ResourceReader<?> resourceReader = resourceManager.getResourceReader(context, slot.getDomain().getFrame());
					String filter = slot.getDomain().getRoute();
					if (filter == null || filter.trim().isEmpty()) {
						EAttribute eIDAttribute = eClass().getEIDAttribute();
						if (eIDAttribute != null) {
							if (slot.isString())
								filter = eIDAttribute.getName() + "= '" + this.getID() + "'";
							else
								filter = eIDAttribute.getName() + "=" + this.getID();
						} else
							return super.eGet(featureID, resolve, coreType);
					}

					List<String> values = new EDataTypeUniqueEList<String>(String.class, this, featureID);
					for (EntityIdentifiable entityIdentifiable : resourceReader.find(filter)) {
						values.add(entityIdentifiable.getID());
					}
					super.eSet(eFeature, values);
				} else
					return super.eGet(featureID, resolve, coreType);
			}
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
	public boolean isProxy() {
		return eIsProxy();
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
