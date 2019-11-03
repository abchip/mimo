/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderId <em>Acquire Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getActualEndOfLife <em>Actual End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getClassEnumId <em>Class Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateAcquired <em>Date Acquired</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateLastServiced <em>Date Last Serviced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateNextService <em>Date Next Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDepreciation <em>Depreciation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getExpectedEndOfLife <em>Expected End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getInstanceOfProductId <em>Instance Of Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtFacilityId <em>Located At Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getParentFixedAssetId <em>Parent Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getProductionCapacity <em>Production Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCost <em>Purchase Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSalvageValue <em>Salvage Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetIdents <em>Fixed Asset Idents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetMaints <em>Fixed Asset Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset()
 * @model
 * @generated
 */
public interface FixedAsset extends BizEntityTyped<FixedAssetType> {
	/**
	 * Returns the value of the '<em><b>Acquire Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Order Id</em>' attribute.
	 * @see #setAcquireOrderId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_AcquireOrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getAcquireOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderId <em>Acquire Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire Order Id</em>' attribute.
	 * @see #getAcquireOrderId()
	 * @generated
	 */
	void setAcquireOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Acquire Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Order Item Seq Id</em>' attribute.
	 * @see #setAcquireOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_AcquireOrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getAcquireOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire Order Item Seq Id</em>' attribute.
	 * @see #getAcquireOrderItemSeqId()
	 * @generated
	 */
	void setAcquireOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Actual End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual End Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual End Of Life</em>' attribute.
	 * @see #setActualEndOfLife(Date)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ActualEndOfLife()
	 * @model
	 * @generated
	 */
	Date getActualEndOfLife();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getActualEndOfLife <em>Actual End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual End Of Life</em>' attribute.
	 * @see #getActualEndOfLife()
	 * @generated
	 */
	void setActualEndOfLife(Date value);

	/**
	 * Returns the value of the '<em><b>Calendar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Id</em>' attribute.
	 * @see #setCalendarId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_CalendarId()
	 * @model annotation="mimo-ent-domain frame='TechDataCalendar'"
	 * @generated
	 */
	String getCalendarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getCalendarId <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Id</em>' attribute.
	 * @see #getCalendarId()
	 * @generated
	 */
	void setCalendarId(String value);

	/**
	 * Returns the value of the '<em><b>Class Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Enum Id</em>' attribute.
	 * @see #setClassEnumId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ClassEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getClassEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getClassEnumId <em>Class Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Enum Id</em>' attribute.
	 * @see #getClassEnumId()
	 * @generated
	 */
	void setClassEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Date Acquired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Acquired</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Acquired</em>' attribute.
	 * @see #setDateAcquired(Date)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateAcquired()
	 * @model
	 * @generated
	 */
	Date getDateAcquired();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateAcquired <em>Date Acquired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Acquired</em>' attribute.
	 * @see #getDateAcquired()
	 * @generated
	 */
	void setDateAcquired(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Serviced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Serviced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Serviced</em>' attribute.
	 * @see #setDateLastServiced(Date)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateLastServiced()
	 * @model
	 * @generated
	 */
	Date getDateLastServiced();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateLastServiced <em>Date Last Serviced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Serviced</em>' attribute.
	 * @see #getDateLastServiced()
	 * @generated
	 */
	void setDateLastServiced(Date value);

	/**
	 * Returns the value of the '<em><b>Date Next Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Next Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Next Service</em>' attribute.
	 * @see #setDateNextService(Date)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_DateNextService()
	 * @model
	 * @generated
	 */
	Date getDateNextService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateNextService <em>Date Next Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Next Service</em>' attribute.
	 * @see #getDateNextService()
	 * @generated
	 */
	void setDateNextService(Date value);

	/**
	 * Returns the value of the '<em><b>Depreciation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depreciation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciation</em>' attribute.
	 * @see #setDepreciation(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_Depreciation()
	 * @model
	 * @generated
	 */
	BigDecimal getDepreciation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDepreciation <em>Depreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciation</em>' attribute.
	 * @see #getDepreciation()
	 * @generated
	 */
	void setDepreciation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Expected End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected End Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected End Of Life</em>' attribute.
	 * @see #setExpectedEndOfLife(Date)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ExpectedEndOfLife()
	 * @model
	 * @generated
	 */
	Date getExpectedEndOfLife();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getExpectedEndOfLife <em>Expected End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected End Of Life</em>' attribute.
	 * @see #getExpectedEndOfLife()
	 * @generated
	 */
	void setExpectedEndOfLife(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Name</em>' attribute.
	 * @see #setFixedAssetName(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetName()
	 * @model
	 * @generated
	 */
	String getFixedAssetName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Name</em>' attribute.
	 * @see #getFixedAssetName()
	 * @generated
	 */
	void setFixedAssetName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Of Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Product Id</em>' attribute.
	 * @see #setInstanceOfProductId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_InstanceOfProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getInstanceOfProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getInstanceOfProductId <em>Instance Of Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Product Id</em>' attribute.
	 * @see #getInstanceOfProductId()
	 * @generated
	 */
	void setInstanceOfProductId(String value);

	/**
	 * Returns the value of the '<em><b>Located At Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At Facility Id</em>' attribute.
	 * @see #setLocatedAtFacilityId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_LocatedAtFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getLocatedAtFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtFacilityId <em>Located At Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At Facility Id</em>' attribute.
	 * @see #getLocatedAtFacilityId()
	 * @generated
	 */
	void setLocatedAtFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Located At Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At Location Seq Id</em>' attribute.
	 * @see #setLocatedAtLocationSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_LocatedAtLocationSeqId()
	 * @model
	 * @generated
	 */
	String getLocatedAtLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At Location Seq Id</em>' attribute.
	 * @see #getLocatedAtLocationSeqId()
	 * @generated
	 */
	void setLocatedAtLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Production Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Capacity</em>' attribute.
	 * @see #setProductionCapacity(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ProductionCapacity()
	 * @model
	 * @generated
	 */
	BigDecimal getProductionCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getProductionCapacity <em>Production Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Capacity</em>' attribute.
	 * @see #getProductionCapacity()
	 * @generated
	 */
	void setProductionCapacity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Cost</em>' attribute.
	 * @see #setPurchaseCost(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_PurchaseCost()
	 * @model
	 * @generated
	 */
	BigDecimal getPurchaseCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCost <em>Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Cost</em>' attribute.
	 * @see #getPurchaseCost()
	 * @generated
	 */
	void setPurchaseCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Purchase Cost Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Cost Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Cost Uom Id</em>' attribute.
	 * @see #setPurchaseCostUomId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_PurchaseCostUomId()
	 * @model
	 * @generated
	 */
	String getPurchaseCostUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Cost Uom Id</em>' attribute.
	 * @see #getPurchaseCostUomId()
	 * @generated
	 */
	void setPurchaseCostUomId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_RoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Salvage Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salvage Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salvage Value</em>' attribute.
	 * @see #setSalvageValue(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_SalvageValue()
	 * @model
	 * @generated
	 */
	BigDecimal getSalvageValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSalvageValue <em>Salvage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salvage Value</em>' attribute.
	 * @see #getSalvageValue()
	 * @generated
	 */
	void setSalvageValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_UomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetAttribute'"
	 * @generated
	 */
	List<String> getFixedAssetAttributes();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Idents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Idents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Idents</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetIdents()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetIdent'"
	 * @generated
	 */
	List<String> getFixedAssetIdents();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Maints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Maints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Maints</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetMaints()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetMaint'"
	 * @generated
	 */
	List<String> getFixedAssetMaints();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Registrations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Registrations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Registrations</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetRegistrations()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetRegistration'"
	 * @generated
	 */
	List<String> getFixedAssetRegistrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AccommodationMap' route='fixedAssetId'"
	 * @generated
	 */
	List<String> accommodationMaps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AccommodationSpot' route='fixedAssetId'"
	 * @generated
	 */
	List<String> accommodationSpots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='fixedAssetId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='parentFixedAssetId'"
	 * @generated
	 */
	List<String> childFixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponent' route='fixedAssetId'"
	 * @generated
	 */
	List<String> costComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Delivery' route='fixedAssetId'"
	 * @generated
	 */
	List<String> deliveries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetDepMethod' route='fixedAssetId'"
	 * @generated
	 */
	List<String> fixedAssetDepMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem' route='fixedAssetId'"
	 * @generated
	 */
	List<String> fixedAssetInventoryItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Requirement' route='fixedAssetId'"
	 * @generated
	 */
	List<String> requirements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='fixedAssetId'"
	 * @generated
	 */
	List<String> workEfforts();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #setFixedAssetTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetTypeId()
	 * @model annotation="mimo-ent-domain frame='FixedAssetType'"
	 * @generated
	 */
	String getFixedAssetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #getFixedAssetTypeId()
	 * @generated
	 */
	void setFixedAssetTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Fixed Asset Id</em>' attribute.
	 * @see #setParentFixedAssetId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ParentFixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getParentFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getParentFixedAssetId <em>Parent Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Fixed Asset Id</em>' attribute.
	 * @see #getParentFixedAssetId()
	 * @generated
	 */
	void setParentFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

} // FixedAsset
