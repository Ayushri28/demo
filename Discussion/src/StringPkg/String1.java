package StringPkg;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		String str1 = null, str2=null;
		for(int i=0; i<str.length(); i++)
		{
			try {
				int k=0;
				while(k<3)
				{
					//str1=str1+str.substring(i, i+1);
				
					if(k==0)
					{
						str1=str1+ str.substring(i, i+1);      //asc
					

						
					}
					else 
					{
						str2=str2+ str.substring(i,i+2);      //desc
						//i++;
						k++;
					}
					
					k++;
					
				}
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			
		
			
			//while(k!=3)
			//{
			//	str1+=str.charAt(i);
			//}
			
		}
		System.out.println(str1);
		System.out.println(str2);
		
		/*
		
		for(int i=0; i<(str1.length()-1); i++)
		{
			for(int j=0; j<(str1.length()-i-1); i++ )
			{
				
				String s2=str2.substring(j, j+2);
				String s3=str2.substring(j+1,j+3);
				
				if(s2.compareTo(s3)>0)
				{
					
				}
				
			}
		}   */
		
		

	}

}
	