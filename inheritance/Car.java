package com.linkcode.inheritance;

public class Car extends vehical{

	    String model;
	    int price;

	    public void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {

	        Car c = new Car();

	        c.brand = "Toyota";
	        c.speed = 180;
	        c.model = "Fortuner";
	        c.price = 3500000;

	        c.start();
	        c.display();
	    }
	
}
