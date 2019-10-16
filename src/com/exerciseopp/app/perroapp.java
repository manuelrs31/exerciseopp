package com.exerciseopp.app;
import com.exerciseopp.model.perro;
public class perroapp
{

	public static void main(String[] args)
	{
		
		perro pluto = new perro();
		 pluto.age = 15;
		 pluto.height = 50;
		 pluto.id = 10;
		 
		 System.out.println("pluto's age: "+pluto.age);
		 System.out.println("pluto's height: "+pluto.height);
		 System.out.println("pluto's id: "+pluto.id);
		 
		 
		 perro firulais = new perro(1, "firulais", "labrador", 5, 60.0);
		 
		 System.out.println("firulais age: "+firulais.age);
		 System.out.println("firulais height: "+firulais.height);
		 System.out.println("firulais id: "+firulais.id);
		 
		 

	}

}
