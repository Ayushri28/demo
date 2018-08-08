package Assign;


import java.util.Scanner;

public class Exceptionhandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		try{
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.println(arr[6]);
		}
		catch(Exception e)
		{
			//System.out.println("Array out of bound");
			System.out.println(e);
		}
	}

}
