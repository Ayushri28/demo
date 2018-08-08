package Assign;

import java.util.Scanner;

public class Mergesort1 {
	
	static void merge(int a[], int l,int m, int h)
	{
		int r1= m-l+1;
		int r2= h-m;
		
		int[] L=new int[r1];
		int[] H=new int[r2];
		
		for(int i=0; i<r1; i++)
		{
			L[i]=a[l+i];
			
		}
		
		for(int j=0; j<r2; j++)
		{
			H[j]=a[m+1+j];
			
		}
		
		int I=0,J=0,K=l;
		
		while(I<r1 && J<r2)
		{
			if(L[I]<H[J])
			{
				a[K]=L[I];
				I++;
			}
			else
			{
				a[K]=H[J];
				J++;
			}
			K++;
		}
		
		while(I<r1)
		{
			a[K]=L[I];
			K++;
			I++;
		}
		
		while(J<r2)
		{
			a[K]=H[J];
			K++;
			J++;
		}
		
	}
	
	static void mergesort(int a[], int l, int h)
	{
		if(l<h)
		{
		int m=(l+h)/2;
		
		mergesort(a,l,m);
		mergesort(a,m+1,h);
		
		merge(a,l,m,h);
		}
		
		
	}
	static void display(int a[],int n)
	{
		for(int i=0 ;i<n; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter range");
		int n=input.nextInt();
		
		System.out.println("enter elements");

		int[] arr=new int[n];
		
		for(int i=0; i<n ;i++)
		{
			arr[i]=input.nextInt();
		}

		Mergesort1 obj= new Mergesort1();
		obj.mergesort(arr,0,n-1);
		
		
		obj.display(arr,n);
	}

}