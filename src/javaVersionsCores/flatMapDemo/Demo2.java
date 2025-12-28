package javaVersionsCores.flatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("Scott" , "David" , "John");
		List<String> teamB = Arrays.asList("Mary" , "Luna" , "Tom");
		List<String> teamC = Arrays.asList("Ken" , "Jony" , "Kitty");
		//List of teams  and a team is a List so the retutn type is a List of List<String>
		List<List<String>> allTeams = Arrays.asList(teamA , teamB , teamC);
		//Before java 8 we would like to print the names of  each team
		/*
		 * for(List<String> teamNames: allTeams) {
			for(String name :teamNames) {
				System.out.println(name);
			}
		}
		 */
		 //Using   steams  flapMap concept
		allTeams.stream().flatMap(name -> name.stream()).forEach(name -> System.out.println(name));
		
		
		
		
		
	}

}
