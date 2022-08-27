package com.EmpTrail5.Model;

import org.springframework.stereotype.Component;

@Component
public class classStGtMeth {
	private int Id;
	private String Name;
	private int Salary;
	private String Department;
	
	public classStGtMeth() {
		super();
	}
	public classStGtMeth(int id, String name, String department, int salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		Department = department;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	
}
