package Training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in); 
		
		String str="12401244634630";
	
		
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		

	
	for(int i=0; i<(str.length()-3); i++)
	{
		
		//int p=0;
		int j=i+3;
		int c=0;
		//int k=0;
		
		
		

		
		if(str.substring(i,j).equals(map.get(1)) || str.substring(i,j).equals(map.get(2)) || str.substring(i,j).equals(map.get(3)))	
		{
			
			do {
			
				
					c++;
			 i++;
			j=i+3;
			
			
			
		}while(str.substring(i,j).equals(map.get(1)) || str.substring(i,j).equals(map.get(2)) || str.substring(i,j).equals(map.get(3)));
			
			
		}
		else
		{
		
		
		
 /*
		if(str.substring(i, j).equals(map.get(1)) || str.substring(i, j).equals(map.get(2)) || str.substring(i, j).equals(map.get(3)))
		{
		
			i++;
			j=i+3;
			
			if(str.substring(i, j).equals(map.get(1)) || str.substring(i, j).equals(map.get(2)) ||str.substring(i, j).equals(map.get(3)))
			{
				i++;
				j=i+3;
				
				if(str.substring(i,j).equals(map.get(1)) || str.substring(i, j).equals(map.get(2)) || str.substring(i, j).equals(map.get(3)))
				{
					i++;
					j=i+3;
					
					if(str.substring(i, j).equals(map.get(1)) || str.substring(i, j).equals(map.get(2)) || str.substring(i, j).equals(map.get(3)))
					{
						i++;
						j=i+3;	
					}
				}
			}
		}  
		
		*/
		
			
			for(int k=0; k<(str.length()-2); k++)
			{
				if(k<(str.length()-2))
				{
					if((str.substring(i, j).equals(str.substring(k, k+3))))
					{
				
						
							c++;
							 map.put(str.substring(i, j), c);
							
							 
						     k=k+2;
						    
						     //System.out.println("sdff");
						     
						     // k=j;
						
						
					}
					
				}
				
					
				
				
				
			}
		
		
		}	
		
		
			
		
    }
	
	
	
	

		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+ "---- " + m.getValue());
			}
		}

   }
}
