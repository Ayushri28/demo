package Assign;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		
		int i=0,j=0;
		Scanner input= new Scanner(System.in);
		
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements");
		
		for( i=0; i<n ;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(i=1; i<n; i++)
		{
			int d=arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>d)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=d;
		}
		
		for(int k=0; k<n; k++)
		{
			System.out.println(arr[k]+" ");
		}

	}

}