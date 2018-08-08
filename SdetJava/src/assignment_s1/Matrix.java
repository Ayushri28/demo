package assignment_s1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//System.out.println("enter range");
		
	//	int n=input.nextInt();
		
		System.out.println("enter rows");
		int r=input.nextInt();
		int arr[][]=new int[r][r]; 
		int arr1[][]=new int[r][r];
		
		System.out.println("enter elements");
		
		for(int i=0; i<r; i++)
		{
			for(int j=0;j<r; j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Matrix before shifting : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		} 
		
	/*	
		for(int i=0; i<r; i++)
		{
			int k=2;

			while(k>0)
			{
			for(int j=0; j<r; j++)
			{
				
				int temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
					
				k--;
				
				}
				//k--;
				
			}
		} */
		
		System.out.println("Matrix after shifting : ");
		int k=2;
		int i=0;
		while(i<r)
		{
			for(int j=k; j<r; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			
			
			for(int j=0; j<k; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			i++;
			System.out.println();
		}
		
		
		
		
		
	/*	for(int i=0; i<r; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			
			System.out.println();
		}  */
	}

}
