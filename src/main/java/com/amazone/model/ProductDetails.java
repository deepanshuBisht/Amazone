package com.amazone.model;

public class ProductDetails {

	private int proId;
	private String name;
	private String brand;
	private String category;
	private Double price;

	public ProductDetails() {
		super();
	}

	public ProductDetails(int proId, String name, String brand, String category, Double price) {
		super();
		this.proId = proId;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [proId=" + proId + ", name=" + name + ", brand=" + brand + ", category=" + category
				+ ", price=" + price + "]";
	}
	
}
