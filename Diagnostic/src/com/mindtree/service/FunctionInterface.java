package com.mindtree.service;

import java.util.ArrayList;

import com.mindtree.entity.GReport;

public interface FunctionInterface {
	
	
	void addDetailsbyEmail(String email, String testname);
	void addDetailsbyPhone(String phone, String testname);

	void generateReportbyEmail(String email, String date );
	void generateReportbyPhone(String phone, String date );
	
	void display(ArrayList<GReport> list);
}
