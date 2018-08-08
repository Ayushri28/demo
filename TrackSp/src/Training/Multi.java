package Training;


public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tire ob1= new Tire();
		ob1.start();
		
		Seat ob2=new Seat();
		ob2.start();
		
		Engine ob3=new Engine();
		ob3.start();
		
		Frame ob4=new Frame();
		ob4.start();
		
		

	}

}
 
	 class Tire extends Thread{
			
			int tire=0;
			
			public void run(){

				while(true)
				{
					try{
						tire++;
						Thread.sleep(2000);
						
					}catch(InterruptedException e)
					{
						System.out.println(e);
					}
					new count().count1(tire);
				}
				
				
			}
			
			
		}


		class Seat extends Thread{
			
			int seat=0;
			
			public void run(){
			
				while(true){
					
					try{
						seat++;
						Thread.sleep(3000);
						
					}catch(InterruptedException e){
						System.out.println(e);
					}
					new count().count2(seat);
				}
			}
			
		}
		class Engine extends Thread{
			
			int engine=0;

			public void run(){
				
				while(true){
					
					try{
						engine++;
						Thread.sleep(5000);
						
					}catch(InterruptedException e){
						System.out.println(e);
					}
					
					new count().count3(engine);
				}
			}
			
			
		}

		class Frame extends Thread{
			
			int frame=0;
			
		public void run(){
				
				while(true){
					
					try{
						frame++;
						Thread.sleep(5000);
						
					}catch(InterruptedException e){
						System.out.println(e);
					}
					
					new count().count4(frame);
				}
			}
			
			
		}



		class count{
			
			int car=0;
		 int tire=0;
		 int seat=0;
		  int frame=0;
		  int engine=0;
			
			void count1(int tire){
			
				this.tire=tire;
				System.out.println("Tyres" + tire);
			}
			
			
			void count2(int seat){
				
				this.seat=seat;
				System.out.println("Seats" + seat);
			}
			
			void count3(int engine){
				
				this.engine=engine;
				System.out.println("Engines" + engine);
			}
			
			void count4(int frame){
				
				this.frame=frame;
				System.out.println("Frames" + frame);
			
			
			if(tire>=4 && seat>=5 &&engine>=1 && frame>=1)
			{
				car++;
				System.out.println("Cars" + car);
			}
			
			
	}
	
		
		
		
		
	

}


