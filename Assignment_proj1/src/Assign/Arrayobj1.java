package Assign;

import java.util.Scanner;

public class Arrayobj1 {
	int roll;
	String name="";
	
	void setroll(int roll)
	{
		this.roll=roll;
		
	}
	void setname(String name)
	{
		this.name=name;
		
	}
	
	int getroll()
	{
		return roll;
	}
	String getname()
	{
		return name;
	}

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Arrayobj1[] ob=new Arrayobj1[2];
	for(int i=0; i<ob.length; i++)
	{
		ob[i]=new Arrayobj1();
		
		System.out.println("enter roll");
		int roll1=input.nextInt();
		ob[i].setroll(roll1);
		
		System.out.println("enter name");
		String name1=input.next();
		ob[i].setname(name1);
	}
		/*ob[0]=new Arrayobj1();
		ob[0].setroll(4);
		ob[0].setname("Ayushi");
		System.out.println("displaying result");
		System.out.println("roll :" + ob[0].getroll());
		System.out.println("name :" + ob[0].getname());
		
		ob[1]=new Arrayobj1();
		ob[1].setroll(3);
		ob[1].setname("ankita");*/
		
		int n= ob.length;
		//SORTING ACCORDING TO ROLL
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if(ob[j].roll > ob[j+1].roll)
				{
					int temp=ob[j].roll;
					ob[j].roll=ob[j+1].roll;
					ob[j+1].roll=temp;
				}
			}
		}
		
		//SORTING ACCORDING TO STRINGS
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if((ob[j].name).compareTo(ob[j+1].name)>0)
				{
					String temp1=ob[j].name;
					ob[j].name=ob[j+1].name;
					ob[j+1].name=temp1;
				}
			}
		}
		System.out.println("displaying result after sorting");
		for(int i=0; i<ob.length; i++)
		{
		System.out.println("roll :" + ob[i].getroll());
		System.out.println("name :" + ob[i].getname());
		}
		
		
		

	}

}
