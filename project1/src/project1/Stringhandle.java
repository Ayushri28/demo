package project1;

import java.util.Scanner;

public class Stringhandle {

/*	public static printConsecutiveCharacters(String input)
	{
		int count=0;
		int[] count1= new int[20];
       String str1=input.replaceAll("\\s","");
       StringBuilder sb=new StringBuilder("");
       	
		for(int i=0; i<str1.length(); i++){
			char char1= str1.charAt(i);
			int ascii1= (int) char1;
			char char2= str1.charAt(i+1);
			int ascii2=(int) char2;
			
			if(ascii2==(ascii1+1))
			{
				count++;
				count1[i]=count;
				sb.append(str1.substring(i,i+2));
				
			}
			
		}
		for(int j=0; j<str1.length(); j++){
		
			System.out.println(sb.substring(0,2)+" "+ count[j]);
		}
		
	}
	    */
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str= in.next();
		//printConsecutiveCharacters(String str);
		
		int count=0;
		int[] count1= new int[20];
       String str1=str.replaceAll("\\s","");
       StringBuilder sb=new StringBuilder("");
       	
		for(int i=0; i<str1.length(); i++){
			char char1= str1.charAt(i);
			int ascii1= (int) char1;
			char char2= str1.charAt(i+1);
			int ascii2=(int) char2;
			
			if(ascii2==(ascii1+1))
			{
				count++;
				count1[i]=count;
				sb.append(str1.substring(i,i+2));
				
			}
			
		}
		for(int j=0; j<str1.length(); j++){
		
			System.out.println(sb.substring(0,2)+" "+ count1[j]);
		}
		
		
	}
	
}
