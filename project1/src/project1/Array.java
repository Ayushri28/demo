package project1;

import java.util.Scanner;

public class Array {

	public static void main(String args[])
	{
		int n1=0,n2=0;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the size of the array");
		n1= input.nextInt();
		n2=input.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		System.out.println("enter data into the array");
		for(int i=0; i<n1; i++)
		{
			arr1[i]=input.nextInt();
		}
		System.out.println("elements of array 1 is");
		
		for(int i=0; i<n1; i++)
		{
			System.out.println(arr1[i]);
		}
		for(int j=0; j<n1; j++)
		{
			if(arr1[j]==arr1[j+1])
			{
				arr2[j]=arr1[j];
				j++;
			}
			
			else 
			{
				arr2[j]=arr1[j];
			}
		}
		
		System.out.println("After deleting duplicates");
		for(int i=0;i<n2;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
}
