package assignment_s1;

import assignment_s1.Car.Tire;

public class MultiThread {

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

