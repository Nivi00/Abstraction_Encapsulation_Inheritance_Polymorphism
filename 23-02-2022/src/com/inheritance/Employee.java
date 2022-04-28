package com.inheritance;

/**
 * Inheritance: reusing the properties of one class from another.
 *
 */
public class Employee extends Organization
{	
	/**
	 * From the instruction line number 7 indicates,
	 * 
	 * 'Employee' class is behave like sub/child/derived class
	 * 
	 * 						and
	 * 
	 * 'Organization' class is behave like super/parent/base class
	 * 
	 * 
	 */

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
		System.out.println(id);
		System.out.println(name);
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
