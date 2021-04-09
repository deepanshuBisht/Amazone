package com.amazone.services;

import java.util.List;
import java.util.stream.Collectors;

import com.amazone.dao.ProductDAO;
import com.amazone.dao.ProductDAOImple;
import com.amazone.exception.IdNotFoundException;
import com.amazone.model.ProductDetails;

public class ProductServicesImple implements ProductServices{

	ProductDAO productdao = new ProductDAOImple();
	
	public void addProduct(ProductDetails product) {
		productdao.addOneProduct(product);
		
	}

	public void updateProduct(int proId, double price) throws IdNotFoundException {
		int result = productdao.updateOneProduct(proId, price);
		if(result == 0)
			throw new IdNotFoundException("Invalid ID for Updating Book");
	}

	public void deleteProduct(int proId) throws IdNotFoundException {
		int result = productdao.deleteOneProduct(proId);
		if(result == 0)
			throw new IdNotFoundException("ID not Found for Delete");
	}

	public List<ProductDetails> viewAllProduct() {
		return productdao.findAllProduct().stream()
				.sorted((p1,p2)->p1.getCategory().compareToIgnoreCase(p2.getCategory()))
				.collect(Collectors.toList());
	}

}
