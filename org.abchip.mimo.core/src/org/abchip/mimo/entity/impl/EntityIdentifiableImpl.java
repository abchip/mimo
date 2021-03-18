/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityState;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.util.Entities;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
	@Override
	public void eSetID(String value) {
		if (value == null)
			return;

		List<Slot> keys = this.isa().getAllKeySlots();
		switch (keys.size()) {
		case 0:
			break;
		case 1:
			this.eSet(keys.get(0), value);
			break;
		default:
			String[] ids = value.split("/");
			for (int i = 0; i < keys.size() && i < ids.length; i++)
				this.eSet(keys.get(i), ids[i]);
			break;
		}			
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(Context context) {
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
	public final String getID() {

		String id = EcoreUtil.getID(this);
		if (id != null)
			return id;

		switch (this.getState()) {
		case TRANSIENT:
			return Entities.getID(this);
		case CHAINED:
		case DIRTY:
		case PROXY:
		case RESOLVED:
			break;
		}

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
	public final <E extends Entity> Frame<E> isa() {

		Frame<E> isa = super.isa();
		if (isa != null)
			return isa;

		switch (getState()) {
		case RESOLVED:
		case PROXY:
			return (Frame<E>) getResource().getFrame();
		default:
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Context getContext() {

		if (this.eResource() instanceof ContextProvider) {
			ContextProvider contextProvider = (ContextProvider) this.eResource();
			return contextProvider.getContext();
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource() {
		if (this.eResource() instanceof MimoResourceImpl) {
			@SuppressWarnings("unchecked")
			MimoResourceImpl<E> internal = (MimoResourceImpl<E>) this.eResource();
			return internal.getResource();
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {

		EAttribute eIDAttribute = eClass().getEIDAttribute();
		EStructuralFeature eFeature = eClass().getEStructuralFeature(featureID);

		if (eFeature.isMany()) {
			if (resolve && !eIsSet(featureID)) {

				if (this.getContext() == null)
					return super.eGet(featureID, resolve, coreType);

				Slot slot = isa().getSlot(eFeature.getName());
				if (slot.getDomain() == null)
					return super.eGet(featureID, resolve, coreType);

				String filter = slot.getDomain().getRoute();
				if (filter == null || filter.trim().isEmpty()) {
					if (eIDAttribute != null) {
						switch (slot.getDataType()) {
						case ENUM:
						case STRING:
						case DATE_TIME:
						case ENTITY:
						case OBJECT:
							filter = eIDAttribute.getName() + " = '" + this.getID() + "'";
							break;
						case BINARY:
						case BOOLEAN:
						case IDENTITY:
						case NUMERIC:
							filter = eIDAttribute.getName() + " = " + this.getID();
							break;
						}
					} else
						return super.eGet(featureID, resolve, coreType);
				}

				List<EntityIdentifiable> values = new EDataTypeUniqueEList<EntityIdentifiable>(EntityIdentifiable.class, this, featureID);
				try (EntityIterator<EntityIdentifiable> entities = this.getContext().getResourceManager().getResourceReader(slot.getDomain().getFrame()).find(filter)) {

					// set first key
					for (EntityIdentifiable entityIdentifiable : entities) {
						Frame<?> isa = entityIdentifiable.isa();
						String domainKey = isa.getAllKeys().get(0);
						entityIdentifiable.eSet(isa.getSlot(domainKey), this);
						values.add(entityIdentifiable);
					}
				} catch (ResourceException e) {
					throw new RuntimeException(e);
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
			return null;
		case RESOLVED:
		case TRANSIENT:
		case CHAINED:
			break;
		}

		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {

		Context context = this.getContext();
		this.eSet(context, eFeature, newValue);
	}

	protected void eSet(Context context, EStructuralFeature eFeature, Object newValue) {
		if (eFeature.isMany()) {
			List<Object> values = new ArrayList<Object>();
			for (Object object : (Collection<?>) newValue)
				values.add(buildValue(context, eFeature, object));
			super.eSet(eFeature, values);
		} else {
			try {
				Object object = buildValue(context, eFeature, newValue);
				super.eSet(eFeature, object);
			} catch (Exception e) {
				if (eFeature.getEType() instanceof EDataType) {
					super.eSet(eFeature, EcoreUtil.createFromString((EDataType) eFeature.getEType(), newValue.toString()));
				}
			}
		}
	}

	private Object buildValue(Context context, EStructuralFeature eFeature, Object value) {

		Object object = null;

		if (eFeature instanceof EReference) {
			if (value instanceof Entity) {
				Entity entityIdentifiable = (Entity) value;
				object = entityIdentifiable;
			} else {
				EReference eReference = (EReference) eFeature;
				EClassifier eClassifier = eReference.getEType();

				if (eClassifier instanceof EClass && EntityPackage.eINSTANCE.getEntityIdentifiable().isSuperTypeOf((EClass) eClassifier)) {
					if (context != null)
						object = context.createProxy(eClassifier.getName(), value.toString());
					else
						System.err.println("Unexpected condition bwytn56wn086b787rt874we");
				} else
					System.err.println("Unexpected condition gkvjsfct4rttycgfad908");
			}
		} else {
			switch (eFeature.getEType().getClassifierID()) {
			case EcorePackage.EBOOLEAN: {
				if (String.class.isInstance(value)) {
					if (value.equals("0"))
						object = Boolean.FALSE;
					else if (value.equals("1"))
						object = Boolean.TRUE;
					else if (value.equals("false"))
						object = Boolean.FALSE;
					else if (value.equals("true"))
						object = Boolean.TRUE;
					break;
				}
			}
			default:
				object = value;
			}
		}

		return object;
	}
} // EntityIdentifiableImpl
