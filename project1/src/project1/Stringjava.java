package project1;

import java.util.Scanner;

public class Stringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		
		
		System.out.println("enter string");
		String str=new String();
		str= input.next();
		String str1=new String();
		
		for(int i=0; i<str.length(); i++)
		{
			str1= str.Substring(i,i+2);
		}
		
		System.out.println(str1);
	

	}

}