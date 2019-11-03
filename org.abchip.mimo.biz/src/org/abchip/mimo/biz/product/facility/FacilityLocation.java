/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAisleId <em>Aisle Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAreaId <em>Area Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLevelId <em>Level Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationTypeEnumId <em>Location Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getPositionId <em>Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getSectionId <em>Section Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation()
 * @model
 * @generated
 */
public interface FacilityLocation extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Aisle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aisle Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisle Id</em>' attribute.
	 * @see #setAisleId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_AisleId()
	 * @model
	 * @generated
	 */
	String getAisleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAisleId <em>Aisle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aisle Id</em>' attribute.
	 * @see #getAisleId()
	 * @generated
	 */
	void setAisleId(String value);

	/**
	 * Returns the value of the '<em><b>Area Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Id</em>' attribute.
	 * @see #setAreaId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_AreaId()
	 * @model
	 * @generated
	 */
	String getAreaId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAreaId <em>Area Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Id</em>' attribute.
	 * @see #getAreaId()
	 * @generated
	 */
	void setAreaId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' attribute.
	 * @see #setGeoPointId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_GeoPointId()
	 * @model annotation="mimo-ent-domain frame='GeoPoint'"
	 * @generated
	 */
	String getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getGeoPointId <em>Geo Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' attribute.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(String value);

	/**
	 * Returns the value of the '<em><b>Level Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Id</em>' attribute.
	 * @see #setLevelId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_LevelId()
	 * @model
	 * @generated
	 */
	String getLevelId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLevelId <em>Level Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Id</em>' attribute.
	 * @see #getLevelId()
	 * @generated
	 */
	void setLevelId(String value);

	/**
	 * Returns the value of the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id</em>' attribute.
	 * @see #setLocationSeqId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_LocationSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Location Type Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type Enum Id</em>' attribute.
	 * @see #setLocationTypeEnumId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_LocationTypeEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getLocationTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationTypeEnumId <em>Location Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type Enum Id</em>' attribute.
	 * @see #getLocationTypeEnumId()
	 * @generated
	 */
	void setLocationTypeEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Id</em>' attribute.
	 * @see #setPositionId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_PositionId()
	 * @model
	 * @generated
	 */
	String getPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getPositionId <em>Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Id</em>' attribute.
	 * @see #getPositionId()
	 * @generated
	 */
	void setPositionId(String value);

	/**
	 * Returns the value of the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Id</em>' attribute.
	 * @see #setSectionId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_SectionId()
	 * @model
	 * @generated
	 */
	String getSectionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getSectionId <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Id</em>' attribute.
	 * @see #getSectionId()
	 * @generated
	 */
	void setSectionId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityLocation_FacilityId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

} // FacilityLocation
