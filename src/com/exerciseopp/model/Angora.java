package com.exerciseopp.model;

public class Angora extends cat
{
	//properties
	private double mouthLong;
	
	//constructor
	public Angora()
	{}
	public Angora (int id, String name, int age)
	{
		super (id, name, age);
	}
	
	public double getMouthLong()
	{
		return mouthLong;
	}
	public void setMouthLong(double mouthLong)
	{
		this.mouthLong = mouthLong;
		
	}
	
	
}
