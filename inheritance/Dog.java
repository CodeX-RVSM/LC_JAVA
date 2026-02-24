package com.linkcode.inheritance;

public class Dog extends Animal{
	    String breed;
	    String name;

	    public void bark() {
	        System.out.println("Dog is barking...");
	    }

	    public void display() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Breed: " + this.breed);
	        System.out.println("Color: " + this.color);
	        System.out.println("Age: " + this.age);
	    }

	    public static void main(String[] args) {

	        Dog d = new Dog();

	        // Parent properties
	        d.color = "Brown";
	        d.age = 3;

	        // Child properties
	        d.name = "Tommy";
	        d.breed = "Labrador";

	        // Parent methods
	        d.eat();
	        d.sleep();

	        // Child methods
	        d.bark();
	        d.display();
	    }
	

}
