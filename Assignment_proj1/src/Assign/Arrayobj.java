package Assign;
import java.util.*;
public class Arrayobj {
	
	
	
	private int a=0;
	private int b=0;
	private String name="";
	
	
public Arrayobj(int a, int b, String name) {
		//super();
		this.a = a;
		this.b = b;
		this.name = name;
	}


/*
	public void setdata(int c, int d)
	{
		a=c;
		b=d;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void showdata()
	{
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	

  */ 

	
	

	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}


	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String name=sc.next();
		Arrayobj ao[]=new Arrayobj[2];
		//ao[0]= new Arrayobj();
		ao[0]=new Arrayobj(a,b,name);
		System.out.println(ao[0].getA());
		ao[1]=new Arrayobj(a,b,name);
		System.out.println(ao[1].getA()+ao[1].getB()+ao[1].getName());
		//ao.ar
	/*	Arrayobj obj[]= new Arrayobj[3];
		/*obj[0]= new Arrayobj();
		obj[0].setdata(3, 4);
		obj[0].showdata();
		String name="ayushi";
		obj[0].setname(name);
		System.out.println(obj[0].getname());
		obj[1]= new Arrayobj();
		obj[1].setdata(4, 5);
		obj[1].showdata();
		obj[2]= new Arrayobj();
		obj[2].setdata(2, 9);
        obj[2].showdata();*/
        
       
		
		

	}
	
	

}
