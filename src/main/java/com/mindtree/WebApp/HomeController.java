package com.mindtree.WebApp;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.DatabaseConnect;
@CrossOrigin
@EnableAutoConfiguration
@Controller
public class HomeController {

	public HomeController() {

	}
	
	@RequestMapping(value = "/h", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public String serveHome() {
        String result= "";
		
        result = "home";

		
		 
		 return result;
		
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getResponse")
	public String getResponse(String addbyKey , String tstnameKey  , String idorphoneKey)
	{
		//System.out.println("hdfksdjkkfjkjsjksdf"+addbyKey);
		int i = -1;
		
		try {
			
			DatabaseConnect ob=new DatabaseConnect();
		 i=ob.verifyByEmail( addbyKey, tstnameKey, idorphoneKey);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		 
		return String.valueOf(i);
		
	}

	/*
	
	@ResponseBody
	@RequestMapping(value = "/getResponseP")
	public String getResponsep(String addbyKeyP, String tstnameKey)
	{
		int i=-1;
		
     try {
			
			DatabaseConnect ob=new DatabaseConnect();
			 i=ob.verifyByPhone( addbyKeyP, tstnameKey);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return String.valueOf(i);
		
	}  */
	    


	
	
	@ResponseBody
	@RequestMapping(value = "/getReport")
	public String getReport(String generatebyKey, String tstdateKey, String idorphoneKey)
	{
		//System.out.println("email or ph:"+generatebyKey+"date"+tstdateKey+"cri"+idorphoneKey);
		String i="";
		try {
			DatabaseConnect ob=new DatabaseConnect();
			i=ob.verifyReport(generatebyKey, tstdateKey, idorphoneKey);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
		return i;
	
	
  }   
}


