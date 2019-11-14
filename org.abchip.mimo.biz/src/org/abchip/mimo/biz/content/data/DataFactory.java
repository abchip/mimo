/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.content.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = org.abchip.mimo.biz.content.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Audio Data ResourceDriver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Data ResourceDriver</em>'.
	 * @generated
	 */
	AudioDataResource createAudioDataResource();

	/**
	 * Returns a new object of class '<em>Character Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Set</em>'.
	 * @generated
	 */
	CharacterSet createCharacterSet();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	DataCategory createDataCategory();

	/**
	 * Returns a new object of class '<em>ResourceDriver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver</em>'.
	 * @generated
	 */
	DataResource createDataResource();

	/**
	 * Returns a new object of class '<em>ResourceDriver Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Attribute</em>'.
	 * @generated
	 */
	DataResourceAttribute createDataResourceAttribute();

	/**
	 * Returns a new object of class '<em>ResourceDriver Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Meta Data</em>'.
	 * @generated
	 */
	DataResourceMetaData createDataResourceMetaData();

	/**
	 * Returns a new object of class '<em>ResourceDriver Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Purpose</em>'.
	 * @generated
	 */
	DataResourcePurpose createDataResourcePurpose();

	/**
	 * Returns a new object of class '<em>ResourceDriver Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Role</em>'.
	 * @generated
	 */
	DataResourceRole createDataResourceRole();

	/**
	 * Returns a new object of class '<em>ResourceDriver Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Type</em>'.
	 * @generated
	 */
	DataResourceType createDataResourceType();

	/**
	 * Returns a new object of class '<em>ResourceDriver Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ResourceDriver Type Attr</em>'.
	 * @generated
	 */
	DataResourceTypeAttr createDataResourceTypeAttr();

	/**
	 * Returns a new object of class '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type</em>'.
	 * @generated
	 */
	DataTemplateType createDataTemplateType();

	/**
	 * Returns a new object of class '<em>Electronic Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electronic Text</em>'.
	 * @generated
	 */
	ElectronicText createElectronicText();

	/**
	 * Returns a new object of class '<em>File Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Extension</em>'.
	 * @generated
	 */
	FileExtension createFileExtension();

	/**
	 * Returns a new object of class '<em>Image Data ResourceDriver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Data ResourceDriver</em>'.
	 * @generated
	 */
	ImageDataResource createImageDataResource();

	/**
	 * Returns a new object of class '<em>Meta Data Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Data Predicate</em>'.
	 * @generated
	 */
	MetaDataPredicate createMetaDataPredicate();

	/**
	 * Returns a new object of class '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type</em>'.
	 * @generated
	 */
	MimeType createMimeType();

	/**
	 * Returns a new object of class '<em>Mime Type Html Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type Html Template</em>'.
	 * @generated
	 */
	MimeTypeHtmlTemplate createMimeTypeHtmlTemplate();

	/**
	 * Returns a new object of class '<em>Other Data ResourceDriver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Data ResourceDriver</em>'.
	 * @generated
	 */
	OtherDataResource createOtherDataResource();

	/**
	 * Returns a new object of class '<em>Video Data ResourceDriver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Data ResourceDriver</em>'.
	 * @generated
	 */
	VideoDataResource createVideoDataResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
