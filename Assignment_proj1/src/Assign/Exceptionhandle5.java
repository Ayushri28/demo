package Assign;

import java.io.IOException;

public class Exceptionhandle5 {
	
	
	void p() 
	
	{
	
		throw new Exception("device error");
		
	}
	void n()
	{
		try{
			
			p();
			
		}catch( Exception e)
		{
			System.out.println("handled");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Exceptionhandle5 obj= new Exceptionhandle5();
		obj.n();
		System.out.println("normal flow");
		
	
	
	}

}
