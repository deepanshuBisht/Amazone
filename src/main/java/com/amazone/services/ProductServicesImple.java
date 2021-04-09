package com.amazone.services;

import java.util.List;
import java.util.stream.Collectors;

import com.amazone.dao.ProductDAO;
import com.amazone.dao.ProductDAOImple;
import com.amazone.dao.UserDAO;
import com.amazone.dao.UserDAOImple;
import com.amazone.exception.IdNotFoundException;
import com.amazone.exception.UserNotFoundException;
import com.amazone.model.ProductDetails;

public class ProductServicesImple implements ProductServices{

	ProductDAO productdao = new ProductDAOImple();
	UserDAO userDAO = new UserDAOImple();
	
	public int login(String userId, String Password) throws UserNotFoundException {
		int result = userDAO.DAOlogin(userId, Password);
		if(result == 0)
			throw new UserNotFoundException("Admin Not Found");
		else {
			return result;
		}
	}
	
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
