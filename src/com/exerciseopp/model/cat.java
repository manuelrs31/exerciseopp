package com.exerciseopp.model;

public class cat
{
	private int id;
	private String name;
	private int age;
	// constructors
	public cat ()
	{
	}
	
	public cat(int id, String name, int age)
	{
		this.age = age;
		this.id = id;
		this.name = name;
	}
	
	// getters and setters 
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//To String method
	public String ToString()
	{
		return "Id:["+id+"], name:["+name+"], age:["+age+"]";
	}

}
