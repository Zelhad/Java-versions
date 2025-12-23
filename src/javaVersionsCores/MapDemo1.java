package javaVersionsCores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
public static void main(String[] args) {
	
	List<String>  vehicles = Arrays.asList("bus" , "car" , "bicycle" , "flight" , "train"); 
	/*
	 * List<String> upperVeh = new ArrayList<String>();
	for(String  veh : vehicles  ) {
		upperVeh.add(veh.toUpperCase()); 
	}
	 */
	for(String name : vehicles) {
		System.out.println(name.length());
	}
	
	List<String> vehUppers = vehicles.stream().map(veh -> veh.toUpperCase()).collect(Collectors.toList());
	
	
}
	

}
