package project1;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0, count=0;
		Scanner input= new Scanner(System.in);
		
		n=input.nextInt();
		
		while(n!=1)
		{
			if(n%2==0)
			{
				n/=2;
				System.out.println(n+" is even so i take half");
				count++;
			}
			else if(n%2!=0)
			{
				n=(3*n)+1;
				System.out.println(n+" is odd so i make 3n+1");
				count++;
				
			}
		}
		
		if(n==1)
		{
			System.out.println("There are total "+ count +" steps to reach 1");
			
		}
		

	}

}
