package Assign;

import java.util.Scanner;

public class Stringform {
	
	
	static int changeascii(int ascii)
	{
		int a=0;
	
		if(ascii==48)
			a=0;
		else if(ascii==49)
			a=1;
		else if(ascii==50)
			a=2;
		else if(ascii==51)
			a=3;
		else if(ascii==52)
			a=4;
		else if(ascii==53)
			a=5;
		else if(ascii==54)
			a=6;
		else if(ascii==55)
			a=7;
		else if(ascii==56)
			a=8;
		else if(ascii==57)
			a=9;
		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String inpt1="";
		
		
	
		//int inpt = 0;
		do
		{
			
			System.out.println("enter string ");
			String str=input.next();
			int[] ar=new int[str.length()];
			System.out.println("enter choice 1 for conversion  0r 2 for exit");
		
		int ch=input.nextInt();
	    switch(ch){
	    
	    case 1:
		try
		{
		for(int i=0 ;i<str.length(); i++)
		{
		switch(str.charAt(i))
		{
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9'://int[] ar=new int[str.length()];
		         
		             int ascii=(int)(str.charAt(i));
		        	 ar[i]=changeascii(ascii);
		        	 break;
		        	
		         
		default : throw new Exception("it cointains char value");
		}
		
		}
        for(int i=0; i<str.length(); i++)
			
		{
			System.out.print(ar[i]);
		}
        System.out.println();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	    
	    break;
	    case 2 : System.exit(0);
	            break;
	    }
	    
	    System.out.println("want to continue? select Y or N");
	    inpt1= input.next();
	    if(inpt1.equals("N"))
	    	System.out.println("bye bye");
		}while(inpt1.equalsIgnoreCase("Y"));
		
		

	}

}
