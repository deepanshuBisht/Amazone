package com.amazone.account;

import com.amazone.exception.IdNotFoundException;
import com.amazone.model.ProductDetails;
import com.amazone.services.ProductServices;
import com.amazone.services.ProductServicesImple;

public class Admin {
	public static void main(String[] args) {
		ProductServices services = new ProductServicesImple();
		ProductDetails product = new ProductDetails(07,"Galaxy 52","Samsung","SmartPhone",27999.10);
		services.addProduct(product);
//		System.out.println("**********************************");
//		try {
//			services.updateProduct(1, 63900.10);
//		} catch (IdNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("**********************************");
//		try {
//			services.deleteProduct(2);
//		} catch (IdNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("**********************************");
		services.viewAllProduct().forEach(System.out::println);
		
	}
}
