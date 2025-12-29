package javaVersionsCores.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7449,23,23,553,343,223); 
		Optional<Integer> minValue = numbers.stream().min((val1, val2) -> (val1.compareTo(val2)));
		Integer integer = minValue.get();
		System.out.println(integer);
		
		Optional<Integer> maxValue = numbers.stream().max((val1, val2) -> (val1.compareTo(val2)));
		Integer max = maxValue.get();
		System.out.println(max);
	}

}
