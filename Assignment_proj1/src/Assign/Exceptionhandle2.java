package Assign;



public class Exceptionhandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
		int[] ar=new int[5];
		
		ar[7]=3/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task 1");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("task 2");
		}
		catch(Exception e)
		{
			System.out.println("general");
		}
		
		System.out.println("rest");
	}

}
