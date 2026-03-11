package com.javaFundamentals.constructors;

public class Cart {
	double i1;
	double i2;
	double i3;
	double total;
	double discount;
	double gst;

	Cart() {
		this.i1 = 2000;
		this.i2 = 4500;
		this.i3 = 1060;
		this.total = this.i1 + this.i2 + this.i3;
		this.discount = this.total * 10 / 100;
		this.gst = this.total * 18 / 100;
	}
	

	void display() {
		if(this.total>5000){
		System.out.println("Item1 price : " + i1);
		System.out.println("Item2 price : " + i2);
		System.out.println("Item3 price :  " + i3);
		System.out.println("total price : " + total);
		System.out.println("discount price(10%) :" + discount);
		System.out.println("gst(18%) :" + gst);
		System.out.println("payable Amount :" + (total - discount + gst));
	}else {
		System.out.println("Item1 price : " + i1);
		System.out.println("Item2 price : " + i2);
		System.out.println("Item3 price :  " + i3);
		System.out.println("total price : " + total);
		
	}
	}

	public static void main(String[] args) {
		Cart c = new Cart();
		c.display();
	}

}
