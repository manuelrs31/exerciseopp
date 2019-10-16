package com.exerciseopp.app;
import com.exerciseopp.model.cat;
import com.exerciseopp.model.Angora;
import com.exerciseopp.model.persa;
public class CatApp 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		cat michi = new cat();
		
		michi.setId(1);
		michi.setName("michi");
		michi.setAge(3);
		/* System.out.println(" michi's id is :"+michi.getId());
		 System.out.println(" michi's age is :"+michi.getAge());
		 System.out.println(" michi's name is :"+michi.getName()); */
		 
		 System.out.println(michi.ToString());
		 
		 Angora tom = new Angora(2, "tom", 4);
		 System.out.println(tom.ToString());
		 

	}

}
