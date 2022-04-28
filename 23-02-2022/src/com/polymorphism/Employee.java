package com.polymorphism;


public class Employee extends Organization
{	

	//variables
	double salary;

	static String orgName;

	//constructors
	public Employee() 
	{
		salary = 49383.45;
	}

	//blocks
	static
	{
		orgName = "IBM";
	}
	
	//methods
	public void getInfo2()
	{
		System.out.println(salary);
		System.out.println(orgName);
	}
	
	public void getInfo()//overrides com.polymorphism.Organization.getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(orgName);
	}
	
	//main()
	public static void main(String[] args) 
	{
		Employee employee = new Employee();
		employee.id = 2929;
		employee.name = "Sushma";
		
		employee.getInfo();
		
		System.out.println("====================");
		
		Organization organization = new Organization();
		
		organization.getInfo();

	}


}
