package com.te.assingment2;

public class Flipkart {
	
	private int productId;
	private String productName;
	private double productCost;
	private String productColor;
	private String description;
	private int noOfProducts;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	
	public Flipkart(int productId, String productName, double productCost, String productColor, String description,
			int noOfProducts) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productColor = productColor;
		this.description = description;
		this.noOfProducts = noOfProducts;
	}
	
	@Override
	public String toString() {
		return "[productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productColor=" + productColor + ", description[" + description +"]"+ ", noOfProducts=" + noOfProducts
				+ "]";
	}
	
	
	
	
  

}
