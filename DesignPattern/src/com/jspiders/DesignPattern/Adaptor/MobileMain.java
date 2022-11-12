package com.jspiders.DesignPattern.Adaptor;

public class MobileMain {
	
	public static void main(String[] args) {
		
		MobileAdaptor obj=new MobileAdaptor();
		obj.model();
		obj.color();
		obj.ram();
		obj.rom();
		obj.price();
	}

}
