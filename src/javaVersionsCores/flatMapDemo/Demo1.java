package javaVersionsCores.flatMapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		//map
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6); 
		//list1.stream().map(item -> item +10).forEach(item -> System.out.println(item));
		List<Integer> mapWith = list1.stream().map(item -> item +10).collect(Collectors.toList());
		//When we have a complex data we go with flatMap
		//flatMap
		List<Integer>list = Arrays.asList(1,2 );
		List<Integer>list2 = Arrays.asList(1,2 );
		List<Integer>list3 = Arrays.asList(1,2 );
		List<List<Integer>>finalList = Arrays.asList(list , list2 , list3);
		List<Integer> finalResult = finalList.stream().
				flatMap(x -> x.stream().map(n -> n *12 + 3)).collect(Collectors.toList());
		
		System.out.println(finalResult);
		
		
	}

}
