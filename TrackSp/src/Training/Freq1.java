package Training;

import java.util.HashMap;
import java.util.Map;

public class Freq1 {

	public static void main(String[] args) {
		
		
		String str=" Hello this is Test. The test is succesfull. But, this is not the end.";
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		int j=0,c=1, k=0;
		/*
		for(int i=0; i<str.length(); i++)
		{
			if(str.contains(" ") || str.contains(". ") || str.contains(", "))
			{
				c++;
				//System.out.println(str.substring(j,i));
				map.put(str.substring(j,i), c);
				
				j=i+1;				
			}
			else k++;
			
			
		}  */
		
		String str1=null;
		
		
		for(int i=0 ;i<str.length(); i++)
		{
			if(str.contains(" "))
			{
			 str1=str.replace(" ", "x");
			}
		}
		
		char ch[]=new char[str.length()];
		int p=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.contains("x"))
			{
				while(str.charAt(p+1)!='x')
				{
					ch[p]=str.charAt(p+1);
					p++;
				}
				
				for(int l=0; l<str.length(); l++)
				{
					System.out.println(ch[l]);
				}
			}
			
			
		}
		
		
		System.out.println(str1);
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getValue());
		}
		

	}

}
