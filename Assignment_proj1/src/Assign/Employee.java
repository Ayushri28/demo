package Assign;

import java.util.Scanner;

public class Employee {
	
	String name;
	int sal;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	static int binarysearch(Employee ob1[], int l, int h, String na)
	{
		
		if(h>=l)
		{
			int mid=(l+h)/2;
			
			if((ob1[mid].name).compareTo(na)==0)
				
				return mid;
			
			else if((ob1[mid].name).compareTo(na)>0)
				
				return binarysearch(ob1,l,mid-1,na);
			
			else
				//((ob1[mid].name).compareTo(na)>0)
				
				return binarysearch(ob1,mid+1, h,na);
			
		}
		
		
		return -1;
	}



	public static void main(String[] args) {
		
		Employee[] ob=new Employee[3];
		int n=ob.length;
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter details");
		
		for(int i=0; i<n; i++)
		{
			ob[i]= new Employee();
			System.out.println("enter details of employee no."+(i+1));
			String str=input.next();
			ob[i].setName(str);
			int s=input.nextInt();
			ob[i].setSal(s);
		}
		
		//SORTING OF ARRAY OF OBJECTS
		System.out.println("sorting according to name :");
		for(int i=1; i<n; i++)
		{
			Employee d=ob[i];
			int j=i-1;
			
			while(j>=0 && (ob[j].name).compareTo(d.name)>0)
			{
				ob[j+1]=ob[j];
				j--;
			}
			ob[j+1]=d;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(ob[i].name);
			System.out.println(ob[i].sal);
		}
		//SEARCHING OF ARRAY OF OBJECTS
		
		System.out.println("searching by name");
		System.out.println("enter name to be searched");
		String str1=input.next();
		
		int res=binarysearch(ob,0,n-1,str1);
		
		if(res==-1)
			
		{
			System.out.println("employee name not present");
		}
		
		else 
		{
			System.out.println("employee name is present at pos : " + (res+1));
		}
		
		
		
		//DELETION
		
		System.out.println("enter name to be deleted");
		String del=input.next();
		
		int position= binarysearch(ob,0,n-1,del);
         if(position==-1)
			
		{
			System.out.println("employee name not present");
		}
         else
         {
        	 for(int i=position; i<n-1; i++)
     		{
     			ob[i]=ob[i+1];
     		} 
         
		
         for(int k=0; k<n-1;k++)
         {
        	 System.out.println(ob[k].name);
        	 System.out.println(ob[k].sal);
         }
        
         }

	}

}
