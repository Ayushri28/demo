package assignment_s1;

public class ProducerConsumer extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
	 
		final Producer ob= new Producer();
		
		Thread t1=new Thread(new Runnable(){
			
			
			public void run()
			{
				try
				{
					ob.producer();
					
				}catch(Exception e)
				{
				    e.printStackTrace();
				}
					
		   }
				
			
		
	
		});
		
		
		Thread t2= new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					ob.consumer();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
	
				
				
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();
				
				
	
		
		

	}

}
