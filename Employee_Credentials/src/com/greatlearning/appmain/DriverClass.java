package com.greatlearning.appmain;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import java.util.Scanner;
public class DriverClass {

	public static void main(String[] args) {
		String department = null;
		boolean optionFlag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical ");
		System.out.println("2. Admin ");
		System.out.println("3. Human Resource ");
		System.out.println("4. Legal ");
		int option = sc.nextInt();
		sc.close();
		Employee employee = new Employee(firstName,lastName,department);
		CredentialService c1 = new CredentialService();
//Check for the options selected
		if(option == 1) {
			employee.setDepartmentName("Technical");//Set the Department Name to "Technical"
			optionFlag = true; //Set a Flag to confirm one of the 4 options are selected
		}
		else if(option == 2){
			employee.setDepartmentName("Admin");//Set the Department Name to "Admin"
			department = employee.getDepartmentName();
			optionFlag = true; //Set a Flag to confirm one of the 4 options are selected
		}
		else if(option == 3){
			//department  = "Human Resource";
			employee.setDepartmentName("Human_Resource");//Set the Department Name to "Human Resource"
			optionFlag = true; //Set a Flag to confirm one of the 4 options are selected
		}
		else if(option == 4){
			employee.setDepartmentName("Legal");//Set the Department Name to "Legal"
			optionFlag = true; //Set a Flag to confirm one of the 4 options are selected
		}
		else {
			System.out.println("Select a valid option! ");
		}
//Check if one of the Options are selected. If yes, then generate the credentials for the employee
		if(optionFlag == true) {
			c1.showCredentials(employee);//Generate Employee Credentials
		}
	}

}