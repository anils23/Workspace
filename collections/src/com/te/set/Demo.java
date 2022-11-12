package com.te.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	
	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet<>();
		Student student = new Student(01, "anil", "male");
		hashSet.add(student);
		hashSet.add(new Student(02, "anil", "male"));
		hashSet.add(new Student(03, "renuka", "female"));
		hashSet.add(new Student(01, "sharmeela", "female"));
		hashSet.add(new Student(04, "sharmeela", "female"));
		
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList);
		Iterator<Student> iterator = arrayList.iterator();
	
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}

}
