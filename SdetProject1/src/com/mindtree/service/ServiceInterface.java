package com.mindtree.service;

import com.mindtree.entity.*;
public interface ServiceInterface {

	
	 Patient fetchByEmail(String emailid);
	 Patient fetchByPhone(String phone);
	 Test fetchTestdetails(String testname);
	 void PatientTestInsert(Arraylist<Test> test, int pid);
	 
	
	
}
