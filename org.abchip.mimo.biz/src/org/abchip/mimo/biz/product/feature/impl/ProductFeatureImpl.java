/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.feature.ProductFeatureCategory;
import org.abchip.mimo.biz.product.feature.ProductFeatureType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDefaultAmount <em>Default Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDefaultSequenceNum <em>Default Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getNumberSpecified <em>Number Specified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureTypeId <em>Product Feature Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getMainProductFeatureIactns <em>Main Product Feature Iactns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureImpl extends BizEntityTypedImpl<ProductFeatureType> implements ProductFeature {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbbrev() <em>Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrev()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbrev() <em>Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrev()
	 * @generated
	 * @ordered
	 */
	protected String abbrev = ABBREV_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultAmount() <em>Default Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEFAULT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultAmount() <em>Default Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal defaultAmount = DEFAULT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSequenceNum() <em>Default Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long DEFAULT_SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDefaultSequenceNum() <em>Default Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long defaultSequenceNum = DEFAULT_SEQUENCE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdCode() <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdCode() <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCode()
	 * @generated
	 * @ordered
	 */
	protected String idCode = ID_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberSpecified() <em>Number Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSpecified()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMBER_SPECIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberSpecified() <em>Number Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSpecified()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numberSpecified = NUMBER_SPECIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductFeatureCategoryId() <em>Product Feature Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureCategory productFeatureCategoryId;

	/**
	 * The cached value of the '{@link #getProductFeatureTypeId() <em>Product Feature Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureType productFeatureTypeId;

	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;

	/**
	 * The cached value of the '{@link #getMainProductFeatureIactns() <em>Main Product Feature Iactns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainProductFeatureIactns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mainProductFeatureIactns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbrev() {
		return abbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrev(String newAbbrev) {
		String oldAbbrev = abbrev;
		abbrev = newAbbrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__ABBREV, oldAbbrev, abbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDefaultAmount() {
		return defaultAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAmount(BigDecimal newDefaultAmount) {
		BigDecimal oldDefaultAmount = defaultAmount;
		defaultAmount = newDefaultAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__DEFAULT_AMOUNT, oldDefaultAmount, defaultAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultSequenceNum() {
		return defaultSequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSequenceNum(long newDefaultSequenceNum) {
		long oldDefaultSequenceNum = defaultSequenceNum;
		defaultSequenceNum = newDefaultSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM, oldDefaultSequenceNum, defaultSequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdCode() {
		return idCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCode(String newIdCode) {
		String oldIdCode = idCode;
		idCode = newIdCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__ID_CODE, oldIdCode, idCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getNumberSpecified() {
		return numberSpecified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberSpecified(BigDecimal newNumberSpecified) {
		BigDecimal oldNumberSpecified = numberSpecified;
		numberSpecified = newNumberSpecified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__NUMBER_SPECIFIED, oldNumberSpecified, numberSpecified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getMainProductFeatureIactns() {
		if (mainProductFeatureIactns == null) {
			mainProductFeatureIactns = new EDataTypeUniqueEList<String>(String.class, this, FeaturePackage.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS);
		}
		return mainProductFeatureIactns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> assocProductFeatureIactns() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> costComponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> desiredFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productFeatureDataResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productManufacturingRules() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> supplierProductFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureCategory getProductFeatureCategoryId() {
		if (productFeatureCategoryId != null && ((EObject)productFeatureCategoryId).eIsProxy()) {
			InternalEObject oldProductFeatureCategoryId = (InternalEObject)productFeatureCategoryId;
			productFeatureCategoryId = (ProductFeatureCategory)eResolveProxy(oldProductFeatureCategoryId);
			if (productFeatureCategoryId != oldProductFeatureCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, oldProductFeatureCategoryId, productFeatureCategoryId));
			}
		}
		return productFeatureCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureCategory basicGetProductFeatureCategoryId() {
		return productFeatureCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureCategoryId(ProductFeatureCategory newProductFeatureCategoryId) {
		ProductFeatureCategory oldProductFeatureCategoryId = productFeatureCategoryId;
		productFeatureCategoryId = newProductFeatureCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, oldProductFeatureCategoryId, productFeatureCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureType getProductFeatureTypeId() {
		if (productFeatureTypeId != null && ((EObject)productFeatureTypeId).eIsProxy()) {
			InternalEObject oldProductFeatureTypeId = (InternalEObject)productFeatureTypeId;
			productFeatureTypeId = (ProductFeatureType)eResolveProxy(oldProductFeatureTypeId);
			if (productFeatureTypeId != oldProductFeatureTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, oldProductFeatureTypeId, productFeatureTypeId));
			}
		}
		return productFeatureTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureType basicGetProductFeatureTypeId() {
		return productFeatureTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureTypeId(ProductFeatureType newProductFeatureTypeId) {
		ProductFeatureType oldProductFeatureTypeId = productFeatureTypeId;
		productFeatureTypeId = newProductFeatureTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, oldProductFeatureTypeId, productFeatureTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case FeaturePackage.PRODUCT_FEATURE__ABBREV:
				return getAbbrev();
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_AMOUNT:
				return getDefaultAmount();
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM:
				return getDefaultSequenceNum();
			case FeaturePackage.PRODUCT_FEATURE__DESCRIPTION:
				return getDescription();
			case FeaturePackage.PRODUCT_FEATURE__ID_CODE:
				return getIdCode();
			case FeaturePackage.PRODUCT_FEATURE__NUMBER_SPECIFIED:
				return getNumberSpecified();
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID:
				if (resolve) return getProductFeatureCategoryId();
				return basicGetProductFeatureCategoryId();
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID:
				if (resolve) return getProductFeatureTypeId();
				return basicGetProductFeatureTypeId();
			case FeaturePackage.PRODUCT_FEATURE__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
			case FeaturePackage.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS:
				return getMainProductFeatureIactns();
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
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__ABBREV:
				setAbbrev((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_AMOUNT:
				setDefaultAmount((BigDecimal)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM:
				setDefaultSequenceNum((Long)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__ID_CODE:
				setIdCode((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__NUMBER_SPECIFIED:
				setNumberSpecified((BigDecimal)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID:
				setProductFeatureCategoryId((ProductFeatureCategory)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID:
				setProductFeatureTypeId((ProductFeatureType)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__UOM_ID:
				setUomId((Uom)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS:
				getMainProductFeatureIactns().clear();
				getMainProductFeatureIactns().addAll((Collection<? extends String>)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__ABBREV:
				setAbbrev(ABBREV_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_AMOUNT:
				setDefaultAmount(DEFAULT_AMOUNT_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM:
				setDefaultSequenceNum(DEFAULT_SEQUENCE_NUM_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__ID_CODE:
				setIdCode(ID_CODE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__NUMBER_SPECIFIED:
				setNumberSpecified(NUMBER_SPECIFIED_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID:
				setProductFeatureCategoryId((ProductFeatureCategory)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID:
				setProductFeatureTypeId((ProductFeatureType)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE__UOM_ID:
				setUomId((Uom)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS:
				getMainProductFeatureIactns().clear();
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
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case FeaturePackage.PRODUCT_FEATURE__ABBREV:
				return ABBREV_EDEFAULT == null ? abbrev != null : !ABBREV_EDEFAULT.equals(abbrev);
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_AMOUNT:
				return DEFAULT_AMOUNT_EDEFAULT == null ? defaultAmount != null : !DEFAULT_AMOUNT_EDEFAULT.equals(defaultAmount);
			case FeaturePackage.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM:
				return defaultSequenceNum != DEFAULT_SEQUENCE_NUM_EDEFAULT;
			case FeaturePackage.PRODUCT_FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FeaturePackage.PRODUCT_FEATURE__ID_CODE:
				return ID_CODE_EDEFAULT == null ? idCode != null : !ID_CODE_EDEFAULT.equals(idCode);
			case FeaturePackage.PRODUCT_FEATURE__NUMBER_SPECIFIED:
				return NUMBER_SPECIFIED_EDEFAULT == null ? numberSpecified != null : !NUMBER_SPECIFIED_EDEFAULT.equals(numberSpecified);
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID:
				return productFeatureCategoryId != null;
			case FeaturePackage.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID:
				return productFeatureTypeId != null;
			case FeaturePackage.PRODUCT_FEATURE__UOM_ID:
				return uomId != null;
			case FeaturePackage.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS:
				return mainProductFeatureIactns != null && !mainProductFeatureIactns.isEmpty();
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
		result.append(" (productFeatureId: ");
		result.append(productFeatureId);
		result.append(", abbrev: ");
		result.append(abbrev);
		result.append(", defaultAmount: ");
		result.append(defaultAmount);
		result.append(", defaultSequenceNum: ");
		result.append(defaultSequenceNum);
		result.append(", description: ");
		result.append(description);
		result.append(", idCode: ");
		result.append(idCode);
		result.append(", numberSpecified: ");
		result.append(numberSpecified);
		result.append(", mainProductFeatureIactns: ");
		result.append(mainProductFeatureIactns);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureImpl
