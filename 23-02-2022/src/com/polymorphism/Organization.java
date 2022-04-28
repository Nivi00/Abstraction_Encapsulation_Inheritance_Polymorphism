package com.polymorphism;

public class Organization 
{
	
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
