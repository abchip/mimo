/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.context.Capability;
import org.abchip.mimo.context.CapabilityRight;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.CapabilityImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.CapabilityImpl#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityImpl extends EntityImpl implements Capability {
	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRight> rights;
	/**
	 * The default value of the '{@link #getEntityURI() <em>Entity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI ENTITY_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEntityURI() <em>Entity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityURI()
	 * @generated
	 * @ordered
	 */
	protected URI entityURI = ENTITY_URI_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<CapabilityRight> getRights() {
		if (rights == null) {
			rights = new EDataTypeUniqueEList<CapabilityRight>(CapabilityRight.class, this, ContextPackage.CAPABILITY__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getEntityURI() {
		return entityURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityURI(URI newEntityURI) {
		URI oldEntityURI = entityURI;
		entityURI = newEntityURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CAPABILITY__ENTITY_URI, oldEntityURI, entityURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getEntityName() {
		return getEntityURI().getFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CAPABILITY__RIGHTS:
				return getRights();
			case ContextPackage.CAPABILITY__ENTITY_URI:
				return getEntityURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.CAPABILITY__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends CapabilityRight>)newValue);
				return;
			case ContextPackage.CAPABILITY__ENTITY_URI:
				setEntityURI((URI)newValue);
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
			case ContextPackage.CAPABILITY__RIGHTS:
				getRights().clear();
				return;
			case ContextPackage.CAPABILITY__ENTITY_URI:
				setEntityURI(ENTITY_URI_EDEFAULT);
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
			case ContextPackage.CAPABILITY__RIGHTS:
				return rights != null && !rights.isEmpty();
			case ContextPackage.CAPABILITY__ENTITY_URI:
				return ENTITY_URI_EDEFAULT == null ? entityURI != null : !ENTITY_URI_EDEFAULT.equals(entityURI);
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
		result.append(" (rights: ");
		result.append(rights);
		result.append(", entityURI: ");
		result.append(entityURI);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
