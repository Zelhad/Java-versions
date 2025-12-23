package javaVersionsCores;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("juan", "Yoousef", "Mohamed"); 
		names.stream()
		.filter(name -> name.length()> 6  && name.length()<8)
		.collect(Collectors.toList()).
		forEach(name -> System.out.println(name));
		
	}

}
