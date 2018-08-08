package Assign;

public class Exceptionhandle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			try{
				int div=6/0;
			}catch(ArithmeticException e)
			{
				System.out.println("cannot be divided by zero");
			}
			
			try{
				
				int[] arr=new int[5];
				arr[9]=7;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("other statement");
		}catch( Exception e)
		{
			System.out.println("exception handled");
		}
		System.out.println("normal flow");
	}

}
