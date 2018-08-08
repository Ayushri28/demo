package StringPkg;

public class Fibo extends Thread {

	int x,answer;

	public Fibo(int x) {
		// TODO Auto-generated constructor stub
		 this.x=x;
	}

	
	public void run() 
	{
	    if( x < 2 )
	        answer=1;
	    else {
	        try {
	        	Fibo tf1= new Fibo(x-1);
	        	Fibo tf2= new Fibo(x-2);
	            
	            tf1.start();
	            tf2.start();
	            
	            tf1.join();
	            tf2.join(); 

	            answer=tf1.answer+tf2.answer;

	        }
	        catch(InterruptedException ex) {
	        	ex.printStackTrace();
	        }
	    }
	}

	public static void main(String[] args)

	{
	    try 
	    {
	           for (int i=0;i<10;i++)
	            {
	            	Fibo f= new Fibo(i);
	                //Thread tf= new Thread(f);
	                f.start();
	                f.join();

	                System.out.print(f.answer + " ");

	            }
	       }

	    catch(Exception e) 
	    {
	        e.printStackTrace();
	    }
	  }

}


