package com.multithreading;

class Resource {

	int data;
	boolean available = false;

	synchronized void put(int i) throws InterruptedException {

		while (available)
			wait(); // waiting if data not consumed

		data = i;
		System.out.println("Produced : " + data);

		available = true;
		notify();
	}

	synchronized void get() throws InterruptedException {

		while (!available)
			wait(); // waiting if no data

		System.out.println("Consumed : " + data);

		available = false;
		notify();
	}
}

class Producer implements Runnable {

	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {

		int i = 1;

		try {
			while (true) {
				r.put(i++);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {

	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {

		try {
			while (true) {
				r.get();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class InterThreadCommunicationPC {

	public static void main(String[] args) {

		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
	}
}