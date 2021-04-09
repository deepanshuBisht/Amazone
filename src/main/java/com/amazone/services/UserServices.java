package com.amazone.services;

import java.util.List;

import com.amazone.exception.CategoryNotFoundException;
import com.amazone.model.ProductDetails;

public interface UserServices {

	List<ProductDetails> viewAllProduct();
	
	public void addMoney(int price);
	
	public void addToCart(int proId);
	
	List<ProductDetails> getBookByCategory(String category) throws CategoryNotFoundException;
	
	List<ProductDetails> viewProductByPrice(String type) throws CategoryNotFoundException;
	
}
