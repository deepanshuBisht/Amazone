package com.amazone.services;

import java.util.List;

import com.amazone.exception.IdNotFoundException;
import com.amazone.exception.UserNotFoundException;
import com.amazone.model.ProductDetails;

public interface ProductServices {

	void addProduct(ProductDetails product);
	void updateProduct(int proId, double price) throws IdNotFoundException;
	void deleteProduct(int bookId) throws IdNotFoundException;
	public int login(String userName,String password) throws UserNotFoundException;
	List<ProductDetails> viewAllProduct();
	
}
