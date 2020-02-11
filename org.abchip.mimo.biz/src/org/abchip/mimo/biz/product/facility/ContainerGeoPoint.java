/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.geo.GeoPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Geo Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getContainerGeoPoint()
 * @model annotation="mimo-ent-frame title='Container Geo Location with history' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ContainerGeoPoint extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getContainerGeoPoint_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' reference.
	 * @see #setGeoPointId(GeoPoint)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getContainerGeoPoint_GeoPointId()
	 * @model keys="geoPointId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GeoPoint getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getGeoPointId <em>Geo Point Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' reference.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getContainerGeoPoint_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id</em>' reference.
	 * @see #setContainerId(Container)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getContainerGeoPoint_ContainerId()
	 * @model keys="containerId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Container getContainerId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getContainerId <em>Container Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' reference.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(Container value);

} // ContainerGeoPoint
