package com.myretail.restfulservice;

import java.util.List;

import com.myretail.dao.RetailDaoImpl;
import com.myretail.pojo.Product;

/**
 * Retail Controller operates as front controller
 * and receives request from UI.
 * 
 * 
 *
 */
@Path("retailController")
public class RetailController 
{
	
	/*
	 * The method accepts productid i.e id as parameter
	 * make a DB call , i.e fetches data from DB
	 * converts it to JSON object and returns the same
	 * as a resposne.
	 * 
	 */
	
	@GET
	@Path("/products/{id}")
	public JSONObject getProducts(@PathParam("id") int productId) {
		
		RetailDaoImpl retailDaoImpl = new RetailDaoImpl();
		List<Product> products = retailDaoImpl.getProductById(productId);
		
		JSONObject jsonObj = new JSONObject(products);
		return jsonObj;
		
	}
	
}
