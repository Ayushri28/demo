package com.mindtee.dao;

import java.util.ArrayList;

import com.mindtree.entity.Patient;
import com.mindtree.entity.Test;

public interface DaoInterface {

	Patient patientDetailsbyEmail(String email) ;
	Patient patientDetailsbyPhone(String phone);
	Test validTestDetails(String testname);
	
	void insertPatientTest(ArrayList<Test> test, int pid);
	
	ArrayList<List> 
	 
	
	
	
}
