package com.abstraction;

//super class
public class Organization 
{
	
	/*
	 * private int id; 
	 * private String name;
	 */
	int id; 
	String name;
	
	public Organization()
	{
		id = 3039;
		name = "IBM";
	}
	
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
	}

}
