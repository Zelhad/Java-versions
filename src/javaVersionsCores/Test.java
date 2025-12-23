package javaVersionsCores;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test {
	
	//"EXE 1 "
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jack");
		names.add("David");
		names.add("Noel");
		names.add("Jose");
		names.add("raja");
	//names.forEach(name -> System.out.println(  name.toUpperCase() + " WITH  " +name.length()));
	//"EXE 2 "
	//FILET NAMES  LONGER THEN 4 CHARACHTHERS
	List<String> moreThenforChars = 
			names.stream()
			.filter(name-> name.length()>4)
			.collect(Collectors.toList());
	moreThenforChars.forEach(name -> System.out.println(name));
	//REMOVE A NAME
	names.remove("Jack");
	//CHECK IF THE NAME EXISTS
	String nameToCheck ="Jack";
		List<String> checkNames  = names.stream().filter(name -> name.contains(nameToCheck)).collect(Collectors.toList());
		for(String name : checkNames ) {
			System.out.println(name);
		}
		boolean anyMatch = names.stream().anyMatch(name -> name.equals(checkNames));
		if(!anyMatch ) System.out.println(" false and not exist");
		
		long count = names.stream().filter(name -> name.startsWith("J")).sorted().count();
		System.out.println(count);
		
		names.stream().filter(name -> name.startsWith("J")).sorted().forEach(System.out::println);
		
		//Exercice 4 
		//Task A 
		Stream<String> map = names.stream().map(name -> name.toUpperCase());
		map.forEach(System.out::println);
		//TASK B 
		Set<String> uniqueNames  = names.stream().collect(Collectors.toSet());
		for(String name : uniqueNames) {
			System.out.println(name);
		}
		//taskc 
		Map<Character, List<String>> collect = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		Set<Character> keySet = collect.keySet();
		for(Character chr : keySet ) {
			System.out.println(chr);
		}
	}
	

}
