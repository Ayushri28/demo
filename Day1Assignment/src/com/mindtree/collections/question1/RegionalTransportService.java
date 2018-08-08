package com.mindtree.collections.question1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author C2
 *
 */
public class RegionalTransportService {
	
	//Map RTO CODE with Area Name
	private static final Map<String, String> rtoCodeMap = new TreeMap<String, String>();
	
	// RTO Codes and Area Names of Regional Transport offices in Bangalore
	static{
		rtoCodeMap.put("KA-01", "Koramangala");
		rtoCodeMap.put("KA-02", "Rajajinagar");
		rtoCodeMap.put("KA-03", "Indiranagar");
		rtoCodeMap.put("KA-04", "Yeshwanthpur");
		rtoCodeMap.put("KA-05", "Jayanagar");
		rtoCodeMap.put("KA-50", "Yelahanka");
		rtoCodeMap.put("KA-51", "Electronics City");
		rtoCodeMap.put("KA-52", "Nelamangala");
		rtoCodeMap.put("KA-53", "K.R.Puram");
		rtoCodeMap.put("KA-54", "Nagamangala");
		rtoCodeMap.put("KA-55", "Mysore East");
		rtoCodeMap.put("KA-56", "Basvakalyan");
		rtoCodeMap.put("KA-57", "Shantinagar");
		
	}
	/**
	 * 
	 * @param vehicleList 
	 * @return sorted list of vehicles based on Area Name
	 */
	public static List<String> sortVehiclesRegisteredBasedOnArea(List<String> vehicleList){
		return null;

	}
}
