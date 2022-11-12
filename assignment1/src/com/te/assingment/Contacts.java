package com.te.assingment;

public class Contacts {
	
	private String name;
	private long phoneNo;
	private String group;
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", phoneNo=" + phoneNo + ", group=" + group + "]";
	}


	public Contacts(String name, long phoneNo, String group) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.group = group;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}
		
	
}
