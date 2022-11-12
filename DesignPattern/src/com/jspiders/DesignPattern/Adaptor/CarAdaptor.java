package com.jspiders.DesignPattern.Adaptor;

public class CarAdaptor extends CarsFeatures implements Car{

	@Override
	public void speed() {
		speed=280;
		System.out.println("The top speed of car is :"+speed);
	}

	@Override
	public void milage() {
		milage=9;
		System.out.println("The milage of car is :"+milage);
	}

	@Override
	public void color() {
		color="Black";
		System.out.println("The color of car is :"+color);
	}

	@Override
	public void airbags() {
		airbags=4;
		System.out.println("The Airbags present inside the car is :"+airbags);		
	}


}
