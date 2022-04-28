package com.abstraction;

/**
 * Abstraction: hiding the properties of one class from another class.
 *
 */

//sub class
public class Employee extends Organization
{	
	
	//variables
	double salary;

	static String orgName;

	//constructors
	public Employee() 
	{

	}


	//blocks
	static
	{
		orgName = "IBM";
	}
	//methods
	public void getEmployeeInfo()
	{
		System.out.println(id);//The field Organization.id is not visible
		System.out.println(name);//The field Organization.name is not visible
		System.out.println(salary);
		System.out.println(orgName);
	}
	//main()
	public static void main(String[] args) 
	{
		//objects
		Employee employee = new Employee();
		employee.id = 3930;
		employee.name = "Ajay";
		employee.salary = 63833.33;

		employee.getEmployeeInfo();

		System.out.println("======================");

		Employee employee1 = new Employee();
		employee1.id = 2029;
		employee1.name = "Dinesh";
		employee1.salary = 45833.33;

		employee1.getEmployeeInfo();

		System.out.println("======================");

		Employee employee2 = new Employee();
		employee2.id = 2079;
		employee2.name = "Rajesh";
		employee2.salary = 90833.33;

		employee2.getEmployeeInfo();

	}


}
