package com.amazone.dao;

import java.util.List;

import com.amazone.model.ProductDetails;

public interface ProductDAO {

	void addOneProduct(ProductDetails product);
	int updateOneProduct(int proId, double price);
	int deleteOneProduct(int bookId);
	
	List<ProductDetails> findAllProduct();
	
}
