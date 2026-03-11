package com.javaFundamentals;

public class Book {
	String title = "physics";
	String author = "HC verma";
	int bookId = 123;
	double orginalPrice = 250.00;
	int discoutPercentage = 10;
	double discountAmount;
	double sellingprice;

	public static void main(String[] args) {
		Book b = new Book();
		b.discountAmount = (b.orginalPrice) * (b.discoutPercentage) / 100;
		System.out.println("Title :" + b.title);
		System.out.println("Author :" + b.author);
		System.out.println("Book Id :" + b.bookId);
		System.out.println("Orignal Price" + b.orginalPrice);
		System.out.println("DiscountAmount :" + b.discountAmount);
		System.out.println("Selling Price :" + (b.orginalPrice - b.discountAmount));

	}

}
