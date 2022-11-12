package com.te.spring.list;

import java.util.List;

public class Demo {

	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "[list=" + list + "]";
	}
	
	

}
