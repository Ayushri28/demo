package Assign;

public class Typecasteprimitive {

	public static void main(String[] args) {
	
		//INT TO FLOAT
		int i=10;
		float f=i;
		System.out.println(f);
		
		//FLOAT TO DOUBLE
		float f1= 20.8f;
		double d=f1;
		System.out.println(d);
		
		//DOUBLE TO INT
		double d1=90.3;
		int i1=(int) d1;
		System.out.println(i1);
		
		//FLOAT TO INT
		float f2=89.6f;
		int i2=(int) f2;
		System.out.println(i2);
		
		//CHAR TO STRING
		char[] ch={'m','i','n','d','t','r','e','e'};
		String str=ch.toString();
		System.out.println(str);
		
		//STRING TO CHAR
		String str1="kalinga";
		char[] ch1=str.toCharArray();
		System.out.println(ch1);
		
		//STRING TO INT
		String str2="12345";
		int ar=Integer.parseInt(str2);
		

	}

}
