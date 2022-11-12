package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet{
	
	static EntityManagerFactory factory;
	static EntityManager manager;
	static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	public static void closeConnection() {
		factory.close();
		manager.close();

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String parameter = req.getParameter("firstName");
		String parameter1 = req.getParameter("lastName");
		String parameter2 = req.getParameter("email");
		long no = Long.parseLong(req.getParameter("phoneNo"));
		String name = parameter +" "+parameter1;
		
		EmployeeRegistration emp = hibernate(name, parameter2, no);
		
		PrintWriter writer = res.getWriter();
		writer.println(name +" "+"data added successfully in DATABASE..!!");
		writer.println(emp);
	}
	
	public EmployeeRegistration hibernate(String fullName, String email, long phoneNo) {
		openConnection();
		transaction.begin();
		
		EmployeeRegistration emp = new EmployeeRegistration();
		emp.setFullName(fullName);
		emp.setEmail(email);
		emp.setPhoneNo(phoneNo);
		
		manager.persist(emp);
		transaction.commit();
		
		closeConnection();
		
		return emp;
	}
	

}
