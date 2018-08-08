package assignment_s1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrayP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter range of the array");
		int n=input.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}

		System.out.println("Elements are :");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int j=0; j<n; j++)
		{
			
				list.add(arr[j]);
			
		}
		
		
        	   
		
		System.out.println("List are : ");
		System.out.println(list);
	   
		//int count=0;

		int arr1[]=new int[n];
		int ar[]=new int[n];
		
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(Integer ob1: list)
			{
			
				if(ob1.intValue()==arr[i])
				{
			
					count++;
				}
				
				
			}
			arr1[i]=count;
			ar[i]=arr[i];
			i=i+(count-1);
		}
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0; i<n; i++)
		{
				 map.put(ar[i], arr1[i]);
			
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)//sorting keys
		{
			list1.add(ar[i]);
		}
			
		
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		 
		 for(int i=0; i<n; i++)//sorting values
			{
				list2.add(arr1[i]);
			}
			
		
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if(list2.get(j)>list2.get(j+1))
				{
					int temp=list2.get(j);
					list2.set(j,list2.get(j+1));
					list2.set(j+1,temp);
					
					
					int temp1=list1.get(j);
					list1.set(j,list1.get(j+1));
					list1.set(j+1,temp1);
				}
			}
		}
		
	
		System.out.println("Sorted according to frequency");
		
		
		for(int i=0; i<list2.size(); i++)
		{
			for(int j=0; j<list1.get(i);j++)
			{
				System.out.println(list1.get(i));
			}
	}
		//System.out.println(list1);
	
		
		
		
	
		
		
		
		
		
		
	}

	

}
