package javaVersionsCores.streammethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(2,3,1,3,7,5,9);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);// ASCENDING ORDER
		List<Integer> sortedListReverse = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedListReverse);
		
		List<String> names = new ArrayList<>(Arrays.asList(
			    "John", "Mary", "Michael", "Emma", "James",
			    "Sophia", "William", "Olivia", "David", "Isabella"
			));
	}

}
