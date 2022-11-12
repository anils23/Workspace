package com.te.builder;

public class Employee {
	
	public Employee(EmployeeBuilder employeeBuilder) {
       this.id= employeeBuilder.id;
       this.name = employeeBuilder.name;
       this.designation = employeeBuilder.designation;
	}

	public Employee() {
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + "]";
	}



	private String name;
	private int id;
	private String designation;
	
	
	public static EmployeeBuilder builder() {
		return new Employee().new EmployeeBuilder();
	}
	
	class EmployeeBuilder{
		private String name;
		private int id;
		private String designation;
		
		public EmployeeBuilder name(String name) {
			this.name=name;
			return this;
		}
		
		public EmployeeBuilder id(int id) {
			this.id=id;
			return this;
		}
		
		public EmployeeBuilder designation(String dessignation) {
			this.designation=designation;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
		
	}
	
	

}
