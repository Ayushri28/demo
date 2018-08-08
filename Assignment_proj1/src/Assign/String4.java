package Assign;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="mindtree";
		String s2=new String("mindtree").intern();
		if(s1==s2)
		{
			System.out.println(s2);
		}

	}

}
