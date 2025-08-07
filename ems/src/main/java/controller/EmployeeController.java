package controller;
import model.entity_Classes.Employee;

import model.dao.EmployeeDao;
import java.util.Scanner;


public class EmployeeController {
	
	EmployeeDao eDao = new EmployeeDao();
	
	Scanner sc = new Scanner(System.in);
	
	public boolean validateAdmin() {
		
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the password : ");
		String password = sc.nextLine();
		Employee emp = new Employee(id, password, id, id, password, password); 

		
		emp.setId(id);
		emp.setPassword(password);
		
		return eDao.validateAdmin(emp);
		
		
		
	}
	
	public static void main(String[] args) {
		
		EmployeeController empControl = new EmployeeController();
		
		System.out.println(empControl.validateAdmin());
		
		
		
		
	}
	
	
	
}
 