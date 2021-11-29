package com.greatlearning.model;

public class Employee {
//Declaring Data Members
	private String firstname, lastname, departmentName;
//Create a Parameterized Constructor to set the Data Members
	public Employee(String firstname, String lastname, String departmentName) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.departmentName = departmentName;
	}
//Define Getter and Setter Methods
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
