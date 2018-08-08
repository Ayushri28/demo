package com.mindtree.dao;

import java.util.ArrayList;

import com.mindtree.entity.GReport;

public interface DatabaseConnectInterface {
	
	void verifyByEmail(String email, String testname);
	
	void verifyByPhone(String phone , String testname);
	
	ArrayList<GReport> VerifyReportbyEmail(String email, String date);
	
	ArrayList<GReport> VerifyReportbyPhone(String phone, String date);
	
	
	

}
