package com.myretail.restfulservice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.myretail.pojo.Product;

import junit.framework.Assert;

public class RetailController_Junit {

	RetailController retailController;

	@Before
	protected void setUp() {

		retailController = new RetailController();

	}

	@Test
	public void testGetProducts() {

		List<Product> products = retailController.getProducts(10);
		Assert.assertNotNull(products);

	}

}
