package project1;

import java.util.Scanner;

public class Tower {
	
	static int count;
	
	static void TOH(int n)
	{
	
		
		if(n==1)
		{
			count++;
			return;
		}
		
		TOH(n-1);
		
		count++;
		
		TOH(n-1);
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		TOH(n);
		System.out.println(count);
		//System.out.println(t);
		
	}

}
