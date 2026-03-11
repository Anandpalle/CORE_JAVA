package com.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("child " + i);

		}
	}

	public void show() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println(" main :" + i);
		}
	}

	public static void main(String[] args) {
		MyThread t = new MyThread();
	
		t.start();
		t.show();
	}

}
