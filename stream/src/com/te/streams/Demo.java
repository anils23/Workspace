package com.te.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Demo implements Comparable<Demo> {
	private int id;
	private String name;
	private String department;

	public Demo(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", department=" + department + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(department);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Demo other = (Demo) obj;
//		return Objects.equals(department, other.department);
//	}

	public static void main(String[] args) {

		ArrayList<Demo> arrayList = new ArrayList<>();
		arrayList.add(new Demo(101, "anil", "technical"));
		arrayList.add(new Demo(102, "sanjay", "technical"));
		arrayList.add(new Demo(1011, "bharat", "technical"));
		arrayList.add(new Demo(109, "renuka", "account"));
		arrayList.add(new Demo(105, "asmita", "account"));
		arrayList.add(new Demo(106, "sharmeela", "hr"));

//		arrayList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
//		
//		for (Demo demo : arrayList) {
//			System.out.println(demo);
//		}
//		

//	   List<Demo> collect = arrayList.stream().sorted((a1, a2)-> a1.getId().compareTo(a2.getId())).collect(Collectors.toList());
//	   
//	   for (Demo demo : collect) {
//		System.out.println(demo);
//	}
//		

//	List<Demo> collect = arrayList.stream().sorted().collect(Collectors.toList());
//	
//	   for (Demo demo : collect) {
//		System.out.println(demo);
//	}

//		arrayList.stream().max((a1, a2)->a1.getId().compareTo(a2.getId())).ifPresent(System.out::println);
//		long count = arrayList.stream().count();
//		System.out.println(count);
////		
//		List<Demo> collect2 = arrayList.stream().dropWhile((a)->a.getId()<110).collect(Collectors.toList());
//		
//		   for (Demo demo : collect2) {
//			System.out.println(demo);
//		}

		
	}

	@Override
	public int compareTo(Demo o) {
		return this.id - o.id;
	}
}
