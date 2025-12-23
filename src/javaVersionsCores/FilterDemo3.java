package javaVersionsCores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello" , null, "sky" , "forest", "book" , null, "socialty"); 
		List<String> result = new ArrayList<String>();
		result =words.stream().filter(item -> item!= null).collect(Collectors.toList());
		System.out.println(result);

	}

}
