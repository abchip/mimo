/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import org.abchip.mimo.biz.product.config.*;
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
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigPackage.eNS_URI);
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
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
			case ConfigPackage.CONFIG_OPTION_PRODUCT_OPTION: return (EObject)createConfigOptionProductOption();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT: return (EObject)createProdConfItemContent();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE: return (EObject)createProdConfItemContentType();
			case ConfigPackage.PRODUCT_CONFIG: return (EObject)createProductConfig();
			case ConfigPackage.PRODUCT_CONFIG_CONFIG: return (EObject)createProductConfigConfig();
			case ConfigPackage.PRODUCT_CONFIG_ITEM: return (EObject)createProductConfigItem();
			case ConfigPackage.PRODUCT_CONFIG_OPTION: return (EObject)createProductConfigOption();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN: return (EObject)createProductConfigOptionIactn();
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT: return (EObject)createProductConfigProduct();
			case ConfigPackage.PRODUCT_CONFIG_STATS: return (EObject)createProductConfigStats();
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
	public ConfigOptionProductOption createConfigOptionProductOption() {
		ConfigOptionProductOptionImpl configOptionProductOption = new ConfigOptionProductOptionImpl();
		return configOptionProductOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdConfItemContent createProdConfItemContent() {
		ProdConfItemContentImpl prodConfItemContent = new ProdConfItemContentImpl();
		return prodConfItemContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdConfItemContentType createProdConfItemContentType() {
		ProdConfItemContentTypeImpl prodConfItemContentType = new ProdConfItemContentTypeImpl();
		return prodConfItemContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfig createProductConfig() {
		ProductConfigImpl productConfig = new ProductConfigImpl();
		return productConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigConfig createProductConfigConfig() {
		ProductConfigConfigImpl productConfigConfig = new ProductConfigConfigImpl();
		return productConfigConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigItem createProductConfigItem() {
		ProductConfigItemImpl productConfigItem = new ProductConfigItemImpl();
		return productConfigItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigOption createProductConfigOption() {
		ProductConfigOptionImpl productConfigOption = new ProductConfigOptionImpl();
		return productConfigOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigOptionIactn createProductConfigOptionIactn() {
		ProductConfigOptionIactnImpl productConfigOptionIactn = new ProductConfigOptionIactnImpl();
		return productConfigOptionIactn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigProduct createProductConfigProduct() {
		ProductConfigProductImpl productConfigProduct = new ProductConfigProductImpl();
		return productConfigProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigStats createProductConfigStats() {
		ProductConfigStatsImpl productConfigStats = new ProductConfigStatsImpl();
		return productConfigStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
