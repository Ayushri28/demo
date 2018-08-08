package Assign;

public class String2 {

	public static void main(String args[])
	{
		String s1="aBc"; //compareTo returns 0 , any neg or any pos  
		String s2="ABC";
		String s3= "ACB";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s1));
	}
}
