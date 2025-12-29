package javaVersionsCores.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Demo1 {
	public static void main(String[] args) {
		//Terminal methods : Count , forEach, min(), max()
		//count to  return totalItems as Long 
		//Non-terminal /processing methods
		List<String>vehiclesList = Arrays.asList("Bus", "Car", "Bycle", "Bus", "Car", "Car", "Bike");
		//distinct to remove duplicates
		vehiclesList.stream().distinct().forEach(v -> System.out.println(v));
		
		long count = vehiclesList.stream().distinct().count();
		System.out.println(count);
		//limit(maxSize)
		 vehiclesList.stream().limit(3).forEach(veh -> System.out.println(veh));
	
		
	}

}
