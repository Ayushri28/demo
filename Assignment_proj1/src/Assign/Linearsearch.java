package Assign;

import java.util.Scanner;

public class Linearsearch {
	
	
	static int binarysearch(int a[], int l, int h, int d)
	{
	
		if(h>=l)
		{
		int mid=l+(h-l)/2;
		//int m=0;
		if(a[mid]==d)
			  return mid;
		else if(a[mid]>d)
			return binarysearch(a,l,mid-1,d);
		else if(a[mid]<d)
			return binarysearch(a,mid+1,h,d);
		}
			return -1;
	/*	if(m==-1)
		{
			return -1;
		}
		else */
			
		//return m;
		 
	
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
		
		System.out.println("enter the element to be searched");
		int ele=input.nextInt();
		
		int res=binarysearch(arr,0,n-1,ele);
		if(res==-1)
		{
			System.out.println("element not present");
		}
	
		else
		
			System.out.println("element present at pos=" + (res+1));
		
		
		
		
		

	}

}