package com.springbootangular;

public class EmployeeDto {

	String name;
	String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public EmployeeDto(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public EmployeeDto() {
		super();
	}
	
	
}
