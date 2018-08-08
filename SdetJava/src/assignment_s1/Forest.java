package assignment_s1;

import java.util.Scanner;

public class Forest {

	static void remove(int arr[][], int r, int c)
	{
		int i,j;
		//int c=0;
		
		for( i=r, j=c; j<arr.length; j++)
		{
			if(arr[i][j]==1)
			{
				arr[i][j]=0;
				remove(arr,j,0);
			}
		}
	}
	
	static int count(int arr[][], int r, int c)
	{
		int i,j,ct=0;
		
		for(i=0; i<r; i++)
		{
			for(j=0;j<c;j++)
			{
				if(arr[i][j]==1)
				{
					arr[i][j]=0;
					ct++;
					remove(arr,i,j);
				}
			}
		}
		
		return ct;
		
	}
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int r=input.nextInt();
		int c=input.nextInt();
		int i,j;
		int arr[][]=new int[r][c];
		
		
		System.out.println("enter elements");
		int max=arr[0][0];
		for( i=0; i<r; i++)
		{
			for( j=0; j<c; j++)
			{
				
				arr[i][j]=input.nextInt();
				if(arr[i][j]>max)
					max=arr[i][j];
			
			}
		}
		int arr1[][]=new int[max+1][max+1];
		
		for(i=0; i<r; i++)
		{
			int k=arr[i][0];
			int l=arr[i][1];
			
			arr1[k][l]=1;
		}
		
		int ct=count(arr1,max+1,max+1);
		
		System.out.println("No of trees in forest : " + ct);

	}

}
