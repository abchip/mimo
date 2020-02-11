/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.*;
import org.eclipse.emf.ecore.EClass;
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
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
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
			case DataPackage.AUDIO_DATA_RESOURCE: return (EObject)createAudioDataResource();
			case DataPackage.CHARACTER_SET: return (EObject)createCharacterSet();
			case DataPackage.DATA_CATEGORY: return (EObject)createDataCategory();
			case DataPackage.DATA_RESOURCE: return (EObject)createDataResource();
			case DataPackage.DATA_RESOURCE_ATTRIBUTE: return (EObject)createDataResourceAttribute();
			case DataPackage.DATA_RESOURCE_META_DATA: return (EObject)createDataResourceMetaData();
			case DataPackage.DATA_RESOURCE_PURPOSE: return (EObject)createDataResourcePurpose();
			case DataPackage.DATA_RESOURCE_ROLE: return (EObject)createDataResourceRole();
			case DataPackage.DATA_RESOURCE_TYPE: return (EObject)createDataResourceType();
			case DataPackage.DATA_RESOURCE_TYPE_ATTR: return (EObject)createDataResourceTypeAttr();
			case DataPackage.DATA_TEMPLATE_TYPE: return (EObject)createDataTemplateType();
			case DataPackage.ELECTRONIC_TEXT: return (EObject)createElectronicText();
			case DataPackage.FILE_EXTENSION: return (EObject)createFileExtension();
			case DataPackage.IMAGE_DATA_RESOURCE: return (EObject)createImageDataResource();
			case DataPackage.META_DATA_PREDICATE: return (EObject)createMetaDataPredicate();
			case DataPackage.MIME_TYPE: return (EObject)createMimeType();
			case DataPackage.MIME_TYPE_HTML_TEMPLATE: return (EObject)createMimeTypeHtmlTemplate();
			case DataPackage.OTHER_DATA_RESOURCE: return (EObject)createOtherDataResource();
			case DataPackage.VIDEO_DATA_RESOURCE: return (EObject)createVideoDataResource();
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
	public AudioDataResource createAudioDataResource() {
		AudioDataResourceImpl audioDataResource = new AudioDataResourceImpl();
		return audioDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterSet createCharacterSet() {
		CharacterSetImpl characterSet = new CharacterSetImpl();
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCategory createDataCategory() {
		DataCategoryImpl dataCategory = new DataCategoryImpl();
		return dataCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource createDataResource() {
		DataResourceImpl dataResource = new DataResourceImpl();
		return dataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceAttribute createDataResourceAttribute() {
		DataResourceAttributeImpl dataResourceAttribute = new DataResourceAttributeImpl();
		return dataResourceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceMetaData createDataResourceMetaData() {
		DataResourceMetaDataImpl dataResourceMetaData = new DataResourceMetaDataImpl();
		return dataResourceMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourcePurpose createDataResourcePurpose() {
		DataResourcePurposeImpl dataResourcePurpose = new DataResourcePurposeImpl();
		return dataResourcePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceRole createDataResourceRole() {
		DataResourceRoleImpl dataResourceRole = new DataResourceRoleImpl();
		return dataResourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceType createDataResourceType() {
		DataResourceTypeImpl dataResourceType = new DataResourceTypeImpl();
		return dataResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceTypeAttr createDataResourceTypeAttr() {
		DataResourceTypeAttrImpl dataResourceTypeAttr = new DataResourceTypeAttrImpl();
		return dataResourceTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTemplateType createDataTemplateType() {
		DataTemplateTypeImpl dataTemplateType = new DataTemplateTypeImpl();
		return dataTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectronicText createElectronicText() {
		ElectronicTextImpl electronicText = new ElectronicTextImpl();
		return electronicText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileExtension createFileExtension() {
		FileExtensionImpl fileExtension = new FileExtensionImpl();
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDataResource createImageDataResource() {
		ImageDataResourceImpl imageDataResource = new ImageDataResourceImpl();
		return imageDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaDataPredicate createMetaDataPredicate() {
		MetaDataPredicateImpl metaDataPredicate = new MetaDataPredicateImpl();
		return metaDataPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType createMimeType() {
		MimeTypeImpl mimeType = new MimeTypeImpl();
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeTypeHtmlTemplate createMimeTypeHtmlTemplate() {
		MimeTypeHtmlTemplateImpl mimeTypeHtmlTemplate = new MimeTypeHtmlTemplateImpl();
		return mimeTypeHtmlTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherDataResource createOtherDataResource() {
		OtherDataResourceImpl otherDataResource = new OtherDataResourceImpl();
		return otherDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideoDataResource createVideoDataResource() {
		VideoDataResourceImpl videoDataResource = new VideoDataResourceImpl();
		return videoDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
