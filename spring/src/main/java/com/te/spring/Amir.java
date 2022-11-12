package com.te.spring;

import java.util.List;

public class Amir {

	private String name;
	private long phoneNo;
	private int age;

	private Phone phone;
	
	private List<Phone> list;
	
	
	public Amir(List<Phone> list) {
		this.list=list;
	}

	public Amir(Phone phone) {
		super();
		this.phone=phone;
	}
	
	
	public List<Phone> getList() {
		return list;
	}

	public void setList(List<Phone> list) {
		this.list = list;
	}

	public Amir(String name, long phoneNo, int age, Phone phone) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.phone = phone;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Amir [name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", phone=" + phone + "]";
	}

}
