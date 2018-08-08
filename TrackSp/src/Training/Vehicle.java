package Training;

import java.util.Scanner;

public class Vehicle {

	int currentSpeed;
	int maximumSpeed;
	
	Vehicle()
	{
		
	}
	
	Vehicle(int currentSpeed, int maximumSpeed)
	{
		this.currentSpeed=currentSpeed;
		this.maximumSpeed=maximumSpeed;
	}
	
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public int increaseSpeed(int sp)throws SpeedMoreThanMaxSpeedException
	{
		
		if((sp+currentSpeed)>maximumSpeed)
			throw new SpeedMoreThanMaxSpeedException("greater");
		else
			
		{
		    int s=(sp+getCurrentSpeed());
			return s;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int res=0;
		Scanner input=new Scanner(System.in);
		try
		{
		
			System.out.println("enter maximum speed");
			int max=input.nextInt();
			
			System.out.println("enter current speed");
			int curr=input.nextInt();
			
			System.out.println("enter increase speed value");
			int inc=input.nextInt();
			
			Vehicle ob=new Vehicle(curr, max);
			
			res=ob.increaseSpeed(inc);
			
		 /*  if(res> ob.getMaximumSpeed())
			{
				throw new SpeedMoreThanMaxSpeedException("speed is greater than max speed");
			}  */
		}catch(SpeedMoreThanMaxSpeedException e)
		{
			System.out.println(e);
			//System.out.println("handled");
		}
		
		
		System.out.println(res);

	}

}
