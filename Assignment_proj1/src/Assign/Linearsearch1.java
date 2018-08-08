package Assign;

import java.util.Scanner;

public class Linearsearch1 {
	
	static int linearsearch(int a[],int n,int d)
	{
		int pos=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==d)
			{
			pos=i+1;
			break;
		    }
		}
		if(pos==0)
			return -1;
		
		return pos;
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter range");
		
		int n=input.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter elements");
		
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.println("enter element to be searched");

		int ele=input.nextInt();
		
		
		int res=linearsearch(arr,n,ele);
		if(res==-1)
		{
			System.out.println("element not present");
		}
		else
			
		System.out.println("element found at pos=" + res);
	}

}
