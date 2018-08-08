package Assign;

import java.util.Scanner;

public class Fibonacci {

	static int fibonacci(int k)
	{
		if(k==0)
			return 0;
		else
			if(k==1)
				return 1;
			else
				return fibonacci(k-1)+fibonacci(k-2);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the range");
		int n=input.nextInt();
		int k=0;
		
		for(int j=0; j<n; j++)
		{
			System.out.println(fibonacci(k));
			k++;
		}
		
		

	}

}
