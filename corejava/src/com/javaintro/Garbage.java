package com.javaintro;

public class Garbage {
	static class MyClass{
		

	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage collected");
	}
	}

	static  void objectCreate() {
		MyClass gc=new MyClass();
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		objectCreate();
		
//		Garbage gc=new Garbage();
//		Garbage gc1=new Garbage();
//		System.out.println(gc);
//		System.out.println(gc1);
//		gc=gc1;
		System.gc();
	}

}
