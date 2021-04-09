package com.amazone.services;

import java.util.List;
import java.util.stream.Collectors;

import com.amazone.dao.UserDAO;
import com.amazone.dao.UserDAOImple;
import com.amazone.exception.BrandNotFoundException;
import com.amazone.exception.CategoryNotFoundException;
import com.amazone.exception.UserAlreadyExistException;
import com.amazone.exception.UserNotFoundException;
import com.amazone.model.ProductDetails;
import com.amazone.model.UserDetails;

public class UserServicesImple implements UserServices{

UserDAO userDAO = new UserDAOImple();
	
	public int login(String userId, String Password) throws UserNotFoundException {
		int result = userDAO.DAOlogin(userId, Password);
		if(result == 0)
			throw new UserNotFoundException("User Not Found");
		else {
			return result;
		}
	}

	public void register(UserDetails userdetails) throws UserAlreadyExistException {
		userDAO.DAOregister(userdetails);
		
	}

	public void addMoney(int amount) {
		userDAO.DAOaddMoney(amount);
		
	}

	public List<ProductDetails> viewAllProducts() {
		return userDAO.findAllProducts()
				.stream()
				.sorted((b1,b2)->b1.getName().compareTo(b2.getName()))
				.collect(Collectors.toList());

	}

	public List<ProductDetails> viewProductByCategory(String category) throws CategoryNotFoundException {
		List<ProductDetails> productListByCategory = userDAO.findProductByCategory(category);
		if(productListByCategory.isEmpty())
			throw new CategoryNotFoundException("Category Not Found");
		return productListByCategory;
	}

	public List<ProductDetails> ViewProductByPrice(int choice) {
		if(choice == 1)
			return  userDAO.findAllProducts()
					.stream()
					.sorted((b1,b2)->b1.getPrice().compareTo(b2.getPrice()))
					.collect(Collectors.toList());
		else
			return  userDAO.findAllProducts()
					.stream()
					.sorted((b1,b2)->b2.getPrice().compareTo(b1.getPrice()))
					.collect(Collectors.toList());
	}

	public List<ProductDetails> addToCart() {
		return null;
	}

	public List<ProductDetails> ViewProductByBrand(String brand) throws BrandNotFoundException {
		List<ProductDetails> productListByBrand = userDAO.findProductByBrand(brand);
		if(productListByBrand.isEmpty())
			throw new BrandNotFoundException("Brand Not Found");
		return productListByBrand;
	}

}
