package Assign;

class Typecaste1{
	void disp1()
	{
		System.out.println("parent class invoked");
	}
}

public class Typecaste extends Typecaste1{
	
	void disp()
	{
		System.out.println("child class invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Typecaste obj=new Typecaste();
		
		Typecaste1 obj1= (Typecaste1) obj;
		obj1.disp1();
		
		
		Typecaste1 obj2= new Typecaste();
		
		obj2.disp1();
		
		
		

	}

}