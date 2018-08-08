package project1;

import java.util.Scanner;

public class Typecasting {

	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int d1= input.nextInt();
		int d2= input.nextInt();
		double[] arr1=new double[d1];
		double[] arr2=new double[d2];
		System.out.println("enter elements in 1st array");
		for(int i=0; i<d1; i++)
		{
			arr1[i]=input.nextDouble();
		}
		
		System.out.println("enter elements in 2nd array");
		for(int i=0; i<d2; i++)
		{
			arr2[i]=input.nextDouble();
		}
		int len=0;
		if(d1>d2)
			len=d1;
		else
			len=d2;

		int[] arr=new int[len];
		
		for(int i=0; i<len; i++)
		{ 
			
			if(i<d1)
			{
			 arr[i]= (int)(arr1[i]+arr2[i]);
			}
			else if(i>=d1)
			{
				arr[i]=(int)(arr2[i]);
			}
		    
		/*	else if(d1>d2)
			{
				if(i>d2)
				{
					arr[i]= (int)(arr1[i]+arr2[i]);
				}
				else if(i<=d2)
				{
					arr[i]= (int)(arr1[i]);
				}
			}
			*/
		for(int k=0; k<len; k++)
		{
		   System.out.println(arr[k]+" ");
		}
	   }
	}
}
