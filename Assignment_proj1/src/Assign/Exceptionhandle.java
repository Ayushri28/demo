package Assign;

import java.util.Scanner;

public class Exceptionhandle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		try{
			System.out.println("enter first no");
			int a=input.nextInt();
			
			System.out.println("enter second no");
			int b=input.nextInt();
			
		
			int div=a/b;

			if(b==0)
			{
				throw new Exception("b cannot be zero");
			}
			
			
			System.out.println(div);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
