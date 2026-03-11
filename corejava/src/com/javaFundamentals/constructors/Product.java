package com.javaFundamentals.constructors;

public class Product {
	int id;
	String name;
	double price;
	int quantity;

	Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	Product() {
		this(1, "unknown", 50, 1);
	}

	Product(int id,String name) {
		this(id, name, 50, 1);
	}

	Product(int id,String name,double price) {
		this(id, name,price , 1);
	}

	

	void display() {
		System.out.println("Product Id   :"+id);
		System.out.println("Product Name :"+name);
		System.out.println("Product Price:"+price);
		System.out.println("product quantity :"+quantity);
		System.out.println(".........................................");
	}
	public static void main(String[] args) {
		Product p = new Product();
		Product p1 = new Product(12,"x");
		Product p2 = new Product(15,"y",100);
		Product p3 = new Product(19,"z", 150, 2);
      p.display();
      p1.display();
      p2.display();
      p3.display();
	}

}
