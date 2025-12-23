package javaVersionsCores;
import  java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i=0 ; i<= 10; i++) {
			numberList.add(i);
		}
		for(Integer i: numberList) {
			System.out.println(i);
		}
		numberList.stream().filter(item -> item %2 == 0).forEach(item -> System.out.println(item));
	}
	List<String> names = Arrays.asList("Jamal" , "Hanana" , "Rachid"); 
	
	

}
