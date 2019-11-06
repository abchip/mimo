/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.product.catalog.ProdCatalog;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getContentPathPrefix <em>Content Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getHeaderLogo <em>Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#isPurchaseAllowPermReqd <em>Purchase Allow Perm Reqd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getStyleSheet <em>Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#getTemplatePathPrefix <em>Template Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#isUseQuickAdd <em>Use Quick Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogImpl#isViewAllowPermReqd <em>View Allow Perm Reqd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdCatalogImpl extends BizEntityImpl implements ProdCatalog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_CATALOG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected String prodCatalogId = PROD_CATALOG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String catalogName = CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentPathPrefix() <em>Content Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PATH_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentPathPrefix() <em>Content Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected String contentPathPrefix = CONTENT_PATH_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderLogo() <em>Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderLogo() <em>Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderLogo()
	 * @generated
	 * @ordered
	 */
	protected String headerLogo = HEADER_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #isPurchaseAllowPermReqd() <em>Purchase Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPurchaseAllowPermReqd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PURCHASE_ALLOW_PERM_REQD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPurchaseAllowPermReqd() <em>Purchase Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPurchaseAllowPermReqd()
	 * @generated
	 * @ordered
	 */
	protected boolean purchaseAllowPermReqd = PURCHASE_ALLOW_PERM_REQD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleSheet() <em>Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleSheet() <em>Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected String styleSheet = STYLE_SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplatePathPrefix() <em>Template Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatePathPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PATH_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplatePathPrefix() <em>Template Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatePathPrefix()
	 * @generated
	 * @ordered
	 */
	protected String templatePathPrefix = TEMPLATE_PATH_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseQuickAdd() <em>Use Quick Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseQuickAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_QUICK_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseQuickAdd() <em>Use Quick Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseQuickAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean useQuickAdd = USE_QUICK_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isViewAllowPermReqd() <em>View Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewAllowPermReqd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIEW_ALLOW_PERM_REQD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isViewAllowPermReqd() <em>View Allow Perm Reqd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewAllowPermReqd()
	 * @generated
	 * @ordered
	 */
	protected boolean viewAllowPermReqd = VIEW_ALLOW_PERM_REQD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PROD_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCatalogName() {
		return catalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogName(String newCatalogName) {
		catalogName = newCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentPathPrefix() {
		return contentPathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPathPrefix(String newContentPathPrefix) {
		contentPathPrefix = newContentPathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderLogo() {
		return headerLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderLogo(String newHeaderLogo) {
		headerLogo = newHeaderLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPurchaseAllowPermReqd() {
		return purchaseAllowPermReqd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseAllowPermReqd(boolean newPurchaseAllowPermReqd) {
		purchaseAllowPermReqd = newPurchaseAllowPermReqd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleSheet() {
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleSheet(String newStyleSheet) {
		styleSheet = newStyleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplatePathPrefix() {
		return templatePathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatePathPrefix(String newTemplatePathPrefix) {
		templatePathPrefix = newTemplatePathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseQuickAdd() {
		return useQuickAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseQuickAdd(boolean newUseQuickAdd) {
		useQuickAdd = newUseQuickAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isViewAllowPermReqd() {
		return viewAllowPermReqd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewAllowPermReqd(boolean newViewAllowPermReqd) {
		viewAllowPermReqd = newViewAllowPermReqd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> cartAbandonedLines() {
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
	public String getProdCatalogId() {
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(String newProdCatalogId) {
		prodCatalogId = newProdCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.PROD_CATALOG__PROD_CATALOG_ID:
				return getProdCatalogId();
			case CatalogPackage.PROD_CATALOG__CATALOG_NAME:
				return getCatalogName();
			case CatalogPackage.PROD_CATALOG__CONTENT_PATH_PREFIX:
				return getContentPathPrefix();
			case CatalogPackage.PROD_CATALOG__HEADER_LOGO:
				return getHeaderLogo();
			case CatalogPackage.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD:
				return isPurchaseAllowPermReqd();
			case CatalogPackage.PROD_CATALOG__STYLE_SHEET:
				return getStyleSheet();
			case CatalogPackage.PROD_CATALOG__TEMPLATE_PATH_PREFIX:
				return getTemplatePathPrefix();
			case CatalogPackage.PROD_CATALOG__USE_QUICK_ADD:
				return isUseQuickAdd();
			case CatalogPackage.PROD_CATALOG__VIEW_ALLOW_PERM_REQD:
				return isViewAllowPermReqd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.PROD_CATALOG__PROD_CATALOG_ID:
				setProdCatalogId((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__CONTENT_PATH_PREFIX:
				setContentPathPrefix((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__HEADER_LOGO:
				setHeaderLogo((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD:
				setPurchaseAllowPermReqd((Boolean)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__STYLE_SHEET:
				setStyleSheet((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__TEMPLATE_PATH_PREFIX:
				setTemplatePathPrefix((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__USE_QUICK_ADD:
				setUseQuickAdd((Boolean)newValue);
				return;
			case CatalogPackage.PROD_CATALOG__VIEW_ALLOW_PERM_REQD:
				setViewAllowPermReqd((Boolean)newValue);
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
			case CatalogPackage.PROD_CATALOG__PROD_CATALOG_ID:
				setProdCatalogId(PROD_CATALOG_ID_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__CONTENT_PATH_PREFIX:
				setContentPathPrefix(CONTENT_PATH_PREFIX_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__HEADER_LOGO:
				setHeaderLogo(HEADER_LOGO_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD:
				setPurchaseAllowPermReqd(PURCHASE_ALLOW_PERM_REQD_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__STYLE_SHEET:
				setStyleSheet(STYLE_SHEET_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__TEMPLATE_PATH_PREFIX:
				setTemplatePathPrefix(TEMPLATE_PATH_PREFIX_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__USE_QUICK_ADD:
				setUseQuickAdd(USE_QUICK_ADD_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG__VIEW_ALLOW_PERM_REQD:
				setViewAllowPermReqd(VIEW_ALLOW_PERM_REQD_EDEFAULT);
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
			case CatalogPackage.PROD_CATALOG__PROD_CATALOG_ID:
				return PROD_CATALOG_ID_EDEFAULT == null ? prodCatalogId != null : !PROD_CATALOG_ID_EDEFAULT.equals(prodCatalogId);
			case CatalogPackage.PROD_CATALOG__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case CatalogPackage.PROD_CATALOG__CONTENT_PATH_PREFIX:
				return CONTENT_PATH_PREFIX_EDEFAULT == null ? contentPathPrefix != null : !CONTENT_PATH_PREFIX_EDEFAULT.equals(contentPathPrefix);
			case CatalogPackage.PROD_CATALOG__HEADER_LOGO:
				return HEADER_LOGO_EDEFAULT == null ? headerLogo != null : !HEADER_LOGO_EDEFAULT.equals(headerLogo);
			case CatalogPackage.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD:
				return purchaseAllowPermReqd != PURCHASE_ALLOW_PERM_REQD_EDEFAULT;
			case CatalogPackage.PROD_CATALOG__STYLE_SHEET:
				return STYLE_SHEET_EDEFAULT == null ? styleSheet != null : !STYLE_SHEET_EDEFAULT.equals(styleSheet);
			case CatalogPackage.PROD_CATALOG__TEMPLATE_PATH_PREFIX:
				return TEMPLATE_PATH_PREFIX_EDEFAULT == null ? templatePathPrefix != null : !TEMPLATE_PATH_PREFIX_EDEFAULT.equals(templatePathPrefix);
			case CatalogPackage.PROD_CATALOG__USE_QUICK_ADD:
				return useQuickAdd != USE_QUICK_ADD_EDEFAULT;
			case CatalogPackage.PROD_CATALOG__VIEW_ALLOW_PERM_REQD:
				return viewAllowPermReqd != VIEW_ALLOW_PERM_REQD_EDEFAULT;
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
		result.append(" (prodCatalogId: ");
		result.append(prodCatalogId);
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", contentPathPrefix: ");
		result.append(contentPathPrefix);
		result.append(", headerLogo: ");
		result.append(headerLogo);
		result.append(", purchaseAllowPermReqd: ");
		result.append(purchaseAllowPermReqd);
		result.append(", styleSheet: ");
		result.append(styleSheet);
		result.append(", templatePathPrefix: ");
		result.append(templatePathPrefix);
		result.append(", useQuickAdd: ");
		result.append(useQuickAdd);
		result.append(", viewAllowPermReqd: ");
		result.append(viewAllowPermReqd);
		result.append(')');
		return result.toString();
	}

} //ProdCatalogImpl
