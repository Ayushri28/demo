package Assign;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String str="Aditya kumar";
		str=str.replaceAll("\\s", "*");
		char[] ch=str.toCharArray();
		
		for(int i= 0; i<ch.length; i++)
		{
		while(C)
			if(i%2==0)
				
			{
				System.out.print(Character.toLowerCase(ch[i]));
			}
			
			else if(i%2!=0)
				
			{
				System.out.print(Character.toUpperCase(ch[i]));
			}
			else if(ch[i]=='*')
			{
				System.out.print('*');
			}
			
		}
		
		/*for(int i=0 ;i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}*/

	}

}
