package collection;

import java.util.Objects;

public class Students {

	private int rollNo;

	private String name;

	private int age;

	public Students(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name, rollNo);
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
//		Students other = (Students) obj;
//		return age == other.age && Objects.equals(name, other.name) && rollNo == other.rollNo;
//	}
//
//	@Override
//	public int compareTo(Students o) {
//		return this.age-o.age;
//	}
}
