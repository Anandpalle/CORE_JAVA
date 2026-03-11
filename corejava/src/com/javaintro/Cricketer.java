package com.javaintro;

public class Cricketer {
	static int countryId;
	static String countryName;

	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		countryId = 91;
		countryName = "india";

		Cricketer dh = new Cricketer();
		dh.jerseyNo = 7;
		dh.cricketerName = "Dhoni";
		System.out.println("obj1 info.............");
		System.out.println("country Id :" + countryId);
		System.out.println("country Name :" + countryName);
		System.out.println("jersey No. :" + dh.jerseyNo);
		System.out.println("cricketer Name :" + dh.cricketerName);

		Cricketer vk = new Cricketer();
		dh.jerseyNo = 18;
		dh.cricketerName = "virat";
		System.out.println("obj2 info.............");
		System.out.println("country Id :" + countryId);
		System.out.println("country Name :" + countryName);
		System.out.println("jersey No. :" + vk.jerseyNo);
		System.out.println("cricketer Name :" + vk.cricketerName);

		countryId = 92;
		countryName = "bharat";

		Cricketer hp = new Cricketer();
		hp.jerseyNo = 33;
		hp.cricketerName = "hardik";
		System.out.println("obj3 info.............");
		System.out.println("country Id :" + countryId);
		System.out.println("country Name :" + countryName);
		System.out.println("jersey No. :" + hp.jerseyNo);
		System.out.println("cricketer Name :" + hp.cricketerName);

		Cricketer bk = new Cricketer();
		bk.jerseyNo = 15;
		bk.cricketerName = "bhuvi";
		System.out.println("obj4 info.............");
		System.out.println("country Id :" + countryId);
		System.out.println("country Name :" + countryName);
		System.out.println("jersey No. :" + bk.jerseyNo);
		System.out.println("cricketer Name :" + bk.cricketerName);

	}

}
