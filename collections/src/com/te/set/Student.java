package com.te.set;

import java.util.Objects;

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	String gender;

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + "]";
	}

	public Student(int rollNo, String name, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
	}

//	@Override
//	public int hashCode() {
//		return  this.rollNo ;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student) obj;
//		if (this.rollNo == student.rollNo ) {
//			return true;
//		}
//		return false;
//}

	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;
	}

}
