package Assign;

class Classobj1
{
	
	void disp1()
	{
		System.out.println("parent class called" );
	}
}
public class Classobj2 extends Classobj1 {
	void disp()
	{
		System.out.println("child class called" );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classobj1 c1= new Classobj1();
		c1.disp1();
		
		Classobj2 c2= (Classobj2) c1;
		c2.disp1();
	}

}
