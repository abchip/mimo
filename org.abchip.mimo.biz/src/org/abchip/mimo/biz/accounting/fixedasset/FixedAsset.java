/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetIdents <em>Fixed Asset Idents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetMaints <em>Fixed Asset Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}</li>
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
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset()
 * @model
 * @generated
 */
public interface FixedAsset extends BizEntityTyped<FixedAssetType> {
	/**
	 * Returns the value of the '<em><b>Acquire Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Order Id</em>' reference.
	 * @see #setAcquireOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_AcquireOrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getAcquireOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderId <em>Acquire Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire Order Id</em>' reference.
	 * @see #getAcquireOrderId()
	 * @generated
	 */
	void setAcquireOrderId(OrderHeader value);

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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Calendar Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Id</em>' reference.
	 * @see #setCalendarId(TechDataCalendar)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_CalendarId()
	 * @model keys="calendarId"
	 * @generated
	 */
	TechDataCalendar getCalendarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getCalendarId <em>Calendar Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Id</em>' reference.
	 * @see #getCalendarId()
	 * @generated
	 */
	void setCalendarId(TechDataCalendar value);

	/**
	 * Returns the value of the '<em><b>Class Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Enum Id</em>' reference.
	 * @see #setClassEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ClassEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getClassEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getClassEnumId <em>Class Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Enum Id</em>' reference.
	 * @see #getClassEnumId()
	 * @generated
	 */
	void setClassEnumId(Enumeration value);

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * Returns the value of the '<em><b>Fixed Asset Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetAttribute> getFixedAssetAttributes();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Idents</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Idents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Idents</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetIdents()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetIdent> getFixedAssetIdents();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Maints</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Maints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Maints</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetMaints()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetMaint> getFixedAssetMaints();

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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * Returns the value of the '<em><b>Fixed Asset Registrations</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Registrations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Registrations</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetRegistrations()
	 * @model derived="true"
	 * @generated
	 */
	List<FixedAssetRegistration> getFixedAssetRegistrations();

	/**
	 * Returns the value of the '<em><b>Instance Of Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Product Id</em>' reference.
	 * @see #setInstanceOfProductId(Product)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_InstanceOfProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getInstanceOfProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getInstanceOfProductId <em>Instance Of Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Product Id</em>' reference.
	 * @see #getInstanceOfProductId()
	 * @generated
	 */
	void setInstanceOfProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Located At Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At Facility Id</em>' reference.
	 * @see #setLocatedAtFacilityId(Facility)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_LocatedAtFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getLocatedAtFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtFacilityId <em>Located At Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At Facility Id</em>' reference.
	 * @see #getLocatedAtFacilityId()
	 * @generated
	 */
	void setLocatedAtFacilityId(Facility value);

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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

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
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' reference.
	 * @see #setUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_UomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Id</em>' reference.
	 * @see #setFixedAssetTypeId(FixedAssetType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_FixedAssetTypeId()
	 * @model keys="fixedAssetTypeId"
	 * @generated
	 */
	FixedAssetType getFixedAssetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type Id</em>' reference.
	 * @see #getFixedAssetTypeId()
	 * @generated
	 */
	void setFixedAssetTypeId(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Parent Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Fixed Asset Id</em>' reference.
	 * @see #setParentFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAsset_ParentFixedAssetId()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getParentFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getParentFixedAssetId <em>Parent Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Fixed Asset Id</em>' reference.
	 * @see #getParentFixedAssetId()
	 * @generated
	 */
	void setParentFixedAssetId(FixedAsset value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
