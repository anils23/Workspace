package com.te.assignment;

public class Address {

	private int buldingNo;
	private String buildingName;
	private String landmark;

	public int getBuldingNo() {
		return buldingNo;
	}

	public void setBuldingNo(int buldingNo) {
		this.buldingNo = buldingNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public Address() {
	}

	public Address(int buldingNo, String buildingName, String landmark) {
		super();
		this.buldingNo = buldingNo;
		this.buildingName = buildingName;
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "[BuldingNo=" + buldingNo + ", BuildingName=" + buildingName + ", Landmark=" + landmark + "]";
	}

}
