package com.jspiders.maven.assiogn;

public class Bike {
	
	private String bikeName;
	private String bikeModel;
	private int enginePower;
	
	public String getBikeName() {
		return bikeName;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	@Override
	public String toString() {
		return "Bike \n bikeName=" + bikeName + "\n bikeModel=" + bikeModel + "\n enginePower=" + enginePower + "";
	}
	

}
