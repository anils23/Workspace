package com.jspiders.DesignPattern.Adaptor;

public class MobileAdaptor extends MobileFeatures implements Mobile {

	@Override
	public void price() {
		price=30000;
		System.out.println("The price of mobile is :"+price);
		
	}

	@Override
	public void model() {
		model="Vivo V21";
		System.out.println("The model of mobile is :"+model);

	}

	@Override
	public void color() {
		color="Blue";
		System.out.println("The color of mobile is :"+color);

	}

	@Override
	public void ram() {
		ram=8;
		System.out.println("The ram of mobile is :"+ram);

	}

	@Override
	public void rom() {
		rom=128;
		System.out.println("The rom of mobile is :"+rom);
		
	}

}
