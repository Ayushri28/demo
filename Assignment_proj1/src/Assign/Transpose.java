package Assign;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.println("enter no of rows");
		int r=input.nextInt();
		
		System.out.println("enter no of columns");
		int c=input.nextInt();
		
		int[][] arr=new int[r][c];
		
		System.out.println("enter elements");
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println("Normal matrix : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of a matrix : ");
		
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
