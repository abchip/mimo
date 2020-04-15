/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.entity.EntityIdentifiable;

import org.abchip.mimo.resource.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceFactoryImpl extends EFactoryImpl implements ResourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceFactory init() {
		try {
			ResourceFactory theResourceFactory = (ResourceFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcePackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourcePackage.RESOURCE_CONFIG: return (EObject)createResourceConfig();
			case ResourcePackage.RESOURCE_MAPPING: return (EObject)createResourceMapping();
			case ResourcePackage.RESOURCE_MAPPING_RULE_BY_FRAME: return (EObject)createResourceMappingRuleByFrame();
			case ResourcePackage.RESOURCE_MAPPING_RULE_BY_PACKAGE: return (EObject)createResourceMappingRuleByPackage();
			case ResourcePackage.RESOURCE_NOTIFIER: return (EObject)createResourceNotifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ResourcePackage.MAPPING_TYPE:
				return createMappingTypeFromString(eDataType, initialValue);
			case ResourcePackage.RESOURCE_EVENT_TYPE:
				return createResourceEventTypeFromString(eDataType, initialValue);
			case ResourcePackage.SERIALIZATION_TYPE:
				return createSerializationTypeFromString(eDataType, initialValue);
			case ResourcePackage.RESOURCE_EXCEPTION:
				return createResourceExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ResourcePackage.MAPPING_TYPE:
				return convertMappingTypeToString(eDataType, instanceValue);
			case ResourcePackage.RESOURCE_EVENT_TYPE:
				return convertResourceEventTypeToString(eDataType, instanceValue);
			case ResourcePackage.SERIALIZATION_TYPE:
				return convertSerializationTypeToString(eDataType, instanceValue);
			case ResourcePackage.RESOURCE_EXCEPTION:
				return convertResourceExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceConfig createResourceConfig() {
		ResourceConfigImpl resourceConfig = new ResourceConfigImpl();
		return resourceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMapping createResourceMapping() {
		ResourceMappingImpl resourceMapping = new ResourceMappingImpl();
		return resourceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMappingRuleByFrame createResourceMappingRuleByFrame() {
		ResourceMappingRuleByFrameImpl resourceMappingRuleByFrame = new ResourceMappingRuleByFrameImpl();
		return resourceMappingRuleByFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMappingRuleByPackage createResourceMappingRuleByPackage() {
		ResourceMappingRuleByPackageImpl resourceMappingRuleByPackage = new ResourceMappingRuleByPackageImpl();
		return resourceMappingRuleByPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <E extends EntityIdentifiable> ResourceNotifier<E> createResourceNotifier() {
		ResourceNotifierImpl<E> resourceNotifier = new ResourceNotifierImpl<E>();
		return resourceNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEventType createResourceEventTypeFromString(EDataType eDataType, String initialValue) {
		ResourceEventType result = ResourceEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationType createSerializationTypeFromString(EDataType eDataType, String initialValue) {
		SerializationType result = SerializationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSerializationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceException createResourceExceptionFromString(EDataType eDataType, String initialValue) {
		return (ResourceException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingTypeFromString(EDataType eDataType, String initialValue) {
		MappingType result = MappingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePackage getResourcePackage() {
		return (ResourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcePackage getPackage() {
		return ResourcePackage.eINSTANCE;
	}

} //ResourceFactoryImpl
