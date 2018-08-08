package Training;

import java.util.Scanner;

public class Frequency1 {

	public static void main(String[] args) {

		
         Scanner input=new Scanner(System.in); 
		//int count=0;
		String str=input.next();
		char ch[]=str.toCharArray();
		char ch1[]=str.toCharArray();
		for(int k=0; k<ch.length; k++)
		{
			int count=0;
			for(int i=k; i<3; i++)
			{
				ch1[i]=ch[i];
			}
			
			for(int j=0; j<ch.length-2; j++)
			{
				if(ch[j]==ch1[j])
				{
					if(ch[j+1]==ch1[j+1])
					{
						if(ch[j+2]==ch1[j+2])
						{
							count++;
						}
					}
				}
			}
			for(int i=0; i<ch1.length; i++)
			{
				System.out.print(ch1[i]);
			}
			System.out.println(count);

		}
		
	}

}
