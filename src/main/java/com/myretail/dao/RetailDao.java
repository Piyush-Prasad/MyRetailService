package com.myretail.dao;

import java.util.List;

import com.myretail.pojo.Product;

public interface RetailDao {
	
	List<Product> getProductById(int id);

}
