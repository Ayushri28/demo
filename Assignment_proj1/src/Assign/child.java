package Assign;



public class child extends Classobj

	{
		public void disp()
		{
			System.out.println("Child disp called");
		}
		public static void main(String args[])
		{
			child p = new child();
			p.disp();
			Classobj c = (Classobj) p;
			c.disp();
		}
	}

	

