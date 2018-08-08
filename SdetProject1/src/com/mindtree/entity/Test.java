package com.mindtree.entity;

public class Test {

	
	private int T_ID;
	private String testname;
	private int cost;
	public Test()
	{
		
	}
	public Test(int t_ID, String testname, int cost) {
		super();
		T_ID = t_ID;
		this.testname = testname;
		this.cost = cost;
	}
	public int getT_ID() {
		return T_ID;
	}
	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	
	
}
