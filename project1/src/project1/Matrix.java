package project1;

import java.util.Scanner;

public class Matrix {

	public static void main(String args[])
	{
		int r=0, c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter rows and column");
		r= input.nextInt();
		c= input.nextInt();
		int[][] arr=new int[r][c];
		int[][] trans=new int[r][c];
		
		System.out.println("enter the elements of matrix");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
				arr[i][j]=input.nextInt();
		}
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++)
				//trans[i][j]=arr[i][j];
		System.out.print( arr[j][i] + " ");
		
		System.out.println();}
	/*	for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
				System.out.print(trans[i][j]+" ");
			
			System.out.println();*/
		
	}
}
