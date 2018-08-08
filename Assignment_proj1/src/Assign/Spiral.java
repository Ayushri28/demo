package Assign;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter no of rows");
		int r= input.nextInt();
		System.out.println("enter no of columns");
		int c= input.nextInt();
		
		int[][] ar=new int[r][c];
		int[][] ar1=new int[r][c];
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				ar[i][j]=input.nextInt();
			}
		}
		
		
		for(int i=0; i<3;i++)
		{
			int k=0;
			int j=0;
			while(k<=2 && i!=j)
			{
				
				for( j=0; j<3; j++)
				{
					System.out.print(ar[i][j]);
					k++;
				}
				
				
				for(int l=0; l<3; l++)
				{
					System.out.println(ar[l][k]);
				}

			}
	       
			//while(k)
			int l=2;
			for(l=2; l>=0; l--)
			{
				System.out.println(ar[k][l]);
			}

			if(k==0)
			{
				System.out.println(ar[l][k]);
				
			}
			
			for(int )
			
	
		}
		

	}

}
