
package com.mindtree.manager;

import java.sql.Date;

public class InvalidEmailIdException extends Exception {
	
	public InvalidEmailIdException(String str)
	{
		super(str);
	}

	

  


public class InvalidPhoneNumberException extends Exception{
	

	public InvalidPhoneNumberException(String str)
	{
		super(str);
	}

	
	
}


public class InvalidTestNameException extends Exception{
	
	public InvalidTestNameException(String str)
	{
		super(str);
	}
}


public class InvalidDateException extends Exception{
	
	public InvalidDateException(String date)
	{
		super(date);
	}

	
}

}
