package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int empId;
	
	private String fullName;
	
	private String email;
	
	private long phoneNo;

	@Override
	public String toString() {
		return "Employee Data [EmpId = " + empId + ", FullName = " + fullName + ", Email = " + email + ", PhoneNo = "
				+ phoneNo + "]";
	}
	
	

}
