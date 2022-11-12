package com.te.assingment;

public class Engine {
	
	int liters;
	String horsePower;
	int cyclinder;
	
	public Engine(int liters, String horsePower, int cyclinder) {
		super();
		this.liters = liters;
		this.horsePower = horsePower;
		this.cyclinder = cyclinder;
	}

	@Override
	public String toString() {
		return "Engine [liters=" + liters + ", horsePower=" + horsePower + ", cyclinder=" + cyclinder + "]";
	}
	
	
	
	
	

}
