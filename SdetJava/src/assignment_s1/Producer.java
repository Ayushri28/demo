package assignment_s1;

import java.util.LinkedList;

public class Producer {
	
	LinkedList<Integer> list=new LinkedList<Integer>();
	int capacity=1;
	
		public void producer() throws InterruptedException
		{
			int value=0;
			synchronized(this)
		    {
				while(value<3)
				{
				
					if(list.size()==capacity){
						wait();
					}
					
					System.out.println("Producer has produced the value" + value);
					list.add(value++);
					//if(value!=0)
					notify();
					
					Thread.sleep(100);
				}	
			}
			
			
		}
		
		
		
		public void consumer() throws InterruptedException{
			
			//synchronized(this)
			//{
				while(true)
				{
					if(list.size()==0)
					wait();
					
					int value=list.remove();
					System.out.println("Consumer has consumed the value" + value);
					//if(value==0)
					notify();
					
					Thread.sleep(100);
				
				
				}
				
				
			//}
			
		}
		

	

}
