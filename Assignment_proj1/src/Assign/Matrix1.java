package Assign;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		
		
        Scanner input = new Scanner(System.in);
		
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

		int[] one= new int[r*c];
		int k=0;
		for(int m=0; m<c; m++)
		{
			//int k=0;
			int p=1;
			k=0;
			if(m%2==1)
			
			for(int j=0; j<c; j++)
			{
				one[k]=arr[i][j];
				k++;
			}
			
			for(int m=0; m<c-1; m++)                     //SORTING
			{
				for(int m1=0; m1<(c-i-1); m1++)
				{
					if(one[m] < one[m1])
					{
						int temp=one[m];
						one[m]=one[m1];
						one[m1]=temp;
					}
				}
			}
			
			for(int p=0; p<=c; p++)
			{
				System.out.print(one[p] + " ");
				p++;
			}
			System.out.println();
		}
		
			
		
		
	}

}
