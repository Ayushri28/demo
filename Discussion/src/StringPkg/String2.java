package StringPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter string");
		String str=input.next();
		
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		int k=0;
		for(int i=0; i<str.length() && k<str.length(); i++)
		{
			
	          list1.add(str.substring(k, k+1));
				
				k+=3;
				
			
		}
		
		for(String ob: list1) {
			
			System.out.println(ob);
		}
		
		int l=1;
		for(int i=0; i<str.length() && l<str.length()-1; i++)
		{
			
	          list2.add(str.substring(l, l+2));
				
				l+=3;
				
			
		}
		
		for(String ob:list2)
		{
			
			System.out.println(ob);
		}
		
		
		for(int i=0; i<list1.size()-1; i++)
		{
			for(int j=0; j<list2.size()-i-1; j++)
			{
				if((list1.get(j)).compareTo(list1.get(j+1))>0)
				{
					String temp=list1.get(j);
					list1.set(j,list1.get(j+1));
					//list1.set(j,j+1);
					list1.set(j+1,temp);
				}
			}
		}
		
		for(String ob:list1)
		{
			System.out.println(ob);
		}
		
		
		for(int i=0; i<list2.size()-1; i++)
		{
			for(int j=0; j<list2.size()-i-1; j++)
			{

				{
					String temp=list2.get(j);
					list2.set(j, list2.get(j+1));
					list2.set(j+1, temp);
				}
			}
		}
		
		
		for(String ob:list2)
		{
			System.out.println(ob);
		}

	for(int i=0; i<str.length(); i++)
	{
		str+=list1.get(i)+list2.get(i);
		
		
	}
	
	
		System.out.println(str);
	
	
	
	
	}
	

}
