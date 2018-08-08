package Training;

import java.util.Scanner;

public class Thread1 extends Thread {
	
	public Thread1(int x)
	{
		run(x);
	}
	public void run(int y)
	{
		System.out.print(y);
	}

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		
		int n=input.nextInt();
		
		for(int i=0; i<n; i++)
		{
			Thread1 ob1=new Thread1(1);
			Thread1 ob2=new Thread1(2);
			Thread1 ob3=new Thread1(3);
			ob1.start();
			ob2.start();
			ob3.start();
			
		}
		input.close();

	}

}