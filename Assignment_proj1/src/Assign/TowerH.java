package Assign;

import java.util.Scanner;

public class TowerH {
	
	static int c;
	static void TowerOfHanoi(int n)
	{
		
		if(n==1)
		{
			c++;
			return;
		}
		
		
			TowerOfHanoi(n-1);
			
			c++;
			
			TowerOfHanoi(n-1);
			
			
		
		
	}

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter the no of disks");
		
		int n= input.nextInt();
		
		TowerOfHanoi(n);
	    System.out.println("no of count =" + c);

	}

}