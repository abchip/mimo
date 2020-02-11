/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.biz.product.price.PriceFactory;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Product")
public class ProductTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void doTest() {
		// Product
		String productId = "ProductCanary";
		
		Product product = ProductFactory.eINSTANCE.createProduct();
		testAsserter.assertNotNull("Frame Product creation", product);
		ResourceReader<Product> productReader = resourceManager.getResourceReader(testRunner.getContext(), Product.class);
		testAsserter.assertNotNull("Product Reader", productReader);
		
		if (productReader != null) {
			Product productTest = productReader.lookup(productId);
			testAsserter.assertNotNull("Product '" + productId + "' exist", productTest);
			
			if(productTest != null) {
				testAsserter.assertEquals("Product description", "ProductCanary description", productTest.getProductName());
				testAsserter.assertEquals("Product type id", "DIGITAL_GOOD", productTest.getProductTypeId().getProductTypeId());
			} else {
				testAsserter.assertEquals("Product description", "ProductCanary description", "");
				testAsserter.assertEquals("Product type id", "DIGITAL_GOOD", "");
			}
		}
		
		// Price
		ProductPrice productPrice = PriceFactory.eINSTANCE.createProductPrice();
		testAsserter.assertNotNull("Frame ProductPrice creation", productPrice);
		
		ResourceReader<ProductPrice> productPriceReader = resourceManager.getResourceReader(testRunner.getContext(), ProductPrice.class);
		testAsserter.assertNotNull("Product Reader", productPriceReader);
		
		if (productPriceReader != null) {
			ProductPrice productPriceTest = productPriceReader.lookup(productId);
			testAsserter.assertNotNull("ProductPrice '" + productId + "' exist", productPriceTest);
			
			if(productPriceTest != null) {
				testAsserter.assertEquals("ProductPrice price", "1.000", productPriceTest.getPrice().toString());
				testAsserter.assertEquals("ProductPrice price", "PURCHASE", productPriceTest.getProductPricePurposeId().getProductPricePurposeId());
			} else {
				testAsserter.assertEquals("ProductPrice price", 1, 0);
				testAsserter.assertEquals("ProductPrice price", "PURCHASE", "");
			}
		}
	}
}