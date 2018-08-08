package project1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution1 {

	static String mergeStrings(String a, String b) {

		 int len = (int)(a.length()+b.length());
	        String sb="";
	        String ch= new String[20];
	        
	        char[] ch1= new char[10];
	           ch1=a.toCharArray();
	        char[] ch2= new char[10];

	        
	        ch2 = b.toCharArray();
	        
	        for(int i=0; i<len; i++)
	        {
	            ch=(String.valueOf(ch1[i])+String.valueOf(ch2[i]));
	            sb+=(ch);
	        }
	        
	        return sb;

	    }
	
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }
        
        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }
        
        res = mergeStrings(_a, _b);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }

}
