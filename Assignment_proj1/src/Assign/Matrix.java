package Assign;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("enter no of rows");
		int r=input.nextInt();
		
		System.out.println("enter no of columns");
		int c=input.nextInt();
		
		int[][] arr=new int[r][c];
		System.out.println("enter elements");
		for(int i=0; i<r; i++)
		{
			for(int j=0;j<c; j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Matrix before sorting : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//SORTING ALONG ROWS
		int p=0;
		while(p<=r)
		{
			for(int i=0; i<r; i++)
			{
				
				for(int j=0; j<c; j++)
				{
					if(p%2==0)                   //descending order
					{
						for(int m=0; m<c-1; m++ )
						{
							for(int n=0; n<(c-m-1); n++)
							{
								if(arr[m][n]<arr[m][n+1])       
								{
									int temp=arr[m][n];
									arr[m][n]=arr[m][n+1];
									arr[m][n+1]=temp;
								}
							}
						}
						break;
						
					}
					else
				
                      if(p%2!=0)                    //ascending order
					{
						for(int m=0; m<c-1; m++ )
						{
							for(int n=0; n<(c-m-1); n++)
							{
								if(arr[m][n]>arr[m][n+1])       
								{
									int temp=arr[m][n];
									arr[m][n]=arr[m][n+1];
									arr[m][n+1]=temp;
								}
							}
						}
						
						break;
					}
					
				}
				
				p++;
			}
		
			
		}
		
		
		System.out.println("Matrix after sorting :");
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
