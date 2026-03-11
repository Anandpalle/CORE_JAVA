package com.javaFundamentals.constructors;

class Vechile {
	String brand;
	int speed;
	Vechile(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
		System.out.println("brand of the car :"+brand);
		System.out.println("Speed of the Car :"+ speed+"kph");
	}
}

class Car extends Vechile{
	String fuelType;
	Car(String brand,int speed,String fuelType){
		super(brand,speed);
		this.fuelType=fuelType;
		System.out.println("Fuel used :"+fuelType);
	}

}

public class TestConstructors {

	public static void main(String[] args) {
      Car c=new Car("Toyota",200,"disel");
	}

}
