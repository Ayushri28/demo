package Training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freq {

	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in); 
		
		String str=input.next();
		int count=0;
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		for(int i=0; i<str.length()-2; i++)
		{
			int j=i+3;
			if(str.substring(i, j).equals(str.substring(j, j+3)))
			{
				for(int k=j+1; k<str.length()-2; k++)
				{
					if(str.substring(k,k+3).equals(str.substring(k+3,(k+3)+3)))
					{
						count++;
					}
				}
			}
			
			
		}
		
		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+m.getValue());
		}

	}

}
