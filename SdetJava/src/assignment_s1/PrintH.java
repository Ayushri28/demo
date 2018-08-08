package assignment_s1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PrintH {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		HashSet<String> set=new HashSet<String>();
		set.add("abc");
		set.add("def");
		set.add("xyz");
		
	System.out.println(set);
		
	System.out.println("enter two position");

	int a=input.nextInt();
	int b=input.nextInt();

	int i=0; String s="";
	
	Iterator<String> t=set.iterator();
	
	while(t.hasNext())
	{
		if(a<set.size() && b<set.size()){
			if(i==a || i==b)
			{
				System.out.println(t.next());
				
			}
			else
			{
				t.next();
			}
			
			i++;
			
		}
		else
		{
			System.out.println("enter invalid");
		}
			
	}
		

	
	//System.out.println(set);
	
		
	
	}

}
