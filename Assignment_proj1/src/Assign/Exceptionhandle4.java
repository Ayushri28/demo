package Assign;

public class Exceptionhandle4 {

	 static void validate(int age){  
		 try
	     {
			 if(age<18)  
	     
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	     }catch(Exception e)
		 {
	    	 System.out.println(e);
		 }
	     }  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*   try{
			int a=9/0;
			
		}catch(NullPointerException e)
		{
			System.out.println("dont divide it with zero");
		}
		
		
		finally{
			
			System.out.println("thiswill always execute");
		}
		*/
		
		 validate(13);  
	     System.out.println("rest of the code...");  
		
		
		
	}

}
