package entity;

public class Test {

	private int tID;
	private String testname;
	private int cost;
	
	public Test()
	{
		
	}

	public Test(int tID, String testname, int cost) {
		super();
		this.tID = tID;
		this.testname = testname;
		this.cost = cost;
	}

	public int gettID() {
		return tID;
	}

	public void settID(int tID) {
		this.tID = tID;
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
