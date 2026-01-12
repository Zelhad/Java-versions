package javaVersionsCores.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
	            new Person("Alice", "London", 25, "IT"),
	            new Person("Bob", "Paris", 30, "HR"),
	            new Person("Charlie", "London", 35, "IT"),
	            new Person("David", "New York", 28, "Finance"),
	            new Person("Eve", "Paris", 32, "IT")
	        );
		//
		Map<String, List<Person>> byCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
		
		System.out.println( "Group by citys"+byCity);
		System.out.println();
		   Map<String, Long> countByCity = people.stream()
		            .collect(Collectors.groupingBy(
		                Person::getCity,
		                Collectors.counting()
		            ));
		        System.out.println("Count by city: " + countByCity);
		        
		        
		        // 3. groupingBy() with averaging
		        Map<String, Double> avgAgeByCity = people.stream()
		            .collect(Collectors.groupingBy(
		                Person::getCity,
		                Collectors.averagingInt(Person::getAge)
		            ));
		        System.out.println("Average age by city: " + avgAgeByCity);
		        
		        //// 3. groupingBy() with averaging
		        /// // 3. groupingBy() with averaging
        Map<String, Double> avgAgeByCityy = people.stream()
            .collect(Collectors.groupingBy(
                Person::getCity,
                Collectors.averagingInt(Person::getAge)
            ));
		
		
		
	}

}
