package Assign;

import java.util.Scanner;

public class Localvar {

	 
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter range");
		
		int n=input.nextInt();
		
		String[][] ar=new String[n][n];
		
		
		for(int  i=0; i<n; i++)
		{
			for( int j=0; j<n; j++)
			{
			
				if((i==j) || ((i+j)==(n-1)))
					ar[i][j]="*";
				else
					ar[i][j]=" ";
			}
			
		}
		for(int i=0; i<n ;i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
	}

}
