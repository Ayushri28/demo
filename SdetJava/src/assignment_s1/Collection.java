package assignment_s1;


import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> map=new TreeMap<String,String>();
		map.put("KA-01","Koramangala");
		map.put("KA-02","Rajajinagar");
		map.put("KA-03","Indiranagar");
		map.put("KA-04","Yashwanthpur");
		map.put("KA-05","Jayanagar");
		map.put("KA-50","Yelahanka");
		map.put("KA-51","Electronics City");
		map.put("KA-52","Nelamangala");
		map.put("KA-53","K.R.Puram");
		map.put("KA-54","Nagamangala");
		map.put("KA-55","Mysore East");
		map.put("KA-56","Basavakalyan");
		map.put("KA-57","Shantinagar");
		
		TreeMap<String,String> map1=new TreeMap<String,String>();
		
		for(Map.Entry m: map.entrySet())
		{
			map1.put(m.getValue().toString(), m.getKey().toString());
		}
		
		//System.out.println(map1);
		
		ArrayList<String> list= new ArrayList<String>();
 		
		list.add("KA-55-AB4555");
		list.add("KA-01-EF4444");
		list.add("KA-04-AB9000");
		list.add("KA-56-200");
		list.add("KA-50-T3111");
		list.add("KA-02-AG9243");
		
		Collections.sort(list);
		
		ArrayList<String> list1= new ArrayList<String>();
		
		for(Map.Entry m: map1.entrySet())
		{
			for(String ob:list)
			{
				if((m.getValue().toString().equals(ob.toString().substring(0,5))))
				{
					list1.add(ob.toString());
				}
			}
		}
		System.out.println(list1);
		
		
		
		
		
	}

}
