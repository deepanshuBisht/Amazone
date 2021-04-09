package com.amazone.account;

import com.amazone.model.ProductDetails;
import com.amazone.services.ProductServices;
import com.amazone.services.ProductServicesImple;

public class Admin {
	public static void main(String[] args) {
		
		ProductDetails product = new ProductDetails(01,"IPhone 12Mini","Apple","SmartPhone",65000.50);
		ProductServices services = new ProductServicesImple();
		services.addProduct(product);
	}
}
