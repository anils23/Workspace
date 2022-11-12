package com.te.prac;

import java.util.ArrayList;

public class Demo{
	
	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("anil", 1, 22));
		arrayList.add(new Student("manish", 5, 23));
		arrayList.add(new Student("darshan", 2, 24));
		
		
//		List<Student> collect = arrayList.stream().sorted().collect(Collectors.toList());
//		
//		for (Student student : collect) {
//			System.out.println(student);
//		}
//		
//		arrayList.stream().sorted((s1, s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList()).forEach(System.out::println);
//		
//      arrayList.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
	
      arrayList.stream().mapToInt((f1)-> f1.getId()).sorted().forEach(System.out::println);
	}
}
