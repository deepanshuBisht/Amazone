package com.amazone.model;

public class ProductDetails {

	private int ProId;
	private String name;
	private String category;
	private Double price;

	public ProductDetails() {
		super();
	}

	public ProductDetails(int proId, String name, String category, Double price) {
		super();
		this.ProId = proId;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getProId() {
		return ProId;
	}

	public void setProId(int proId) {
		ProId = proId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ProductDetails [ProId=" + ProId + ", name=" + name + ", category=" + category + ", price=" + price
				+ "]";
	}

}
