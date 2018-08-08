package sorting;

import java.util.Scanner;

public class sortingbubble {

	public static void main(String[] args){
		Scanner  inpt = new Scanner(System.in);
		int n = inpt.nextInt();
		int[] arr= new int[n];
		System.out.println("enter elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=inpt.nextInt();
		}
		
		for(int i=1; i<n-1; i++)
		{
			for(int j=0; j<n-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}  
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
