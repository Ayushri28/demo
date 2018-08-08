package project1;

import java.sql.SQLException;

public class Account {

	public static Account createAccount() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class class1= Class.forName("bank.Account");
		bank obj=(bank) class1.newInstance();
		if(class1==null)
			throw new ClassNotFoundException();
		
			Account account1=(Account) class1.newInstance();
			return account1;
		
			
	}
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		
		createAccount();
		
		
	}
	
	
}
