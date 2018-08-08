package com.mindtree.exceptions.question2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestVehicle {
	
	@Test
	public void UTC02_01() {
		
		Vehicle vehicle1 = new Vehicle(10, 20);
		int expected = 15;
		int actual = vehicle1.increaseSpeed(5);
		assertEquals(expected, actual,0);
		
	}
	
	@Test
	public void UTC02_02() {
		
		Vehicle vehicle1 = new Vehicle(10, 30);
		int expected = 30;
		int actual = vehicle1.increaseSpeed(20);
		assertEquals(expected, actual,0);
		
	}
	
	@Test(expected = SpeedMoreThanMaxSpeedException.class) 
	public void UTC02_03() {
		
		Vehicle vehicle1 = new Vehicle(10, 30);
		int actual = vehicle1.increaseSpeed(25);
		
		
	}

}
