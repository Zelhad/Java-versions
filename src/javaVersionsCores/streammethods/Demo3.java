package javaVersionsCores.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	//reduce()
	public static void main(String[] args) {
		List<String> stringLists = Arrays.asList("A","B", "C", "1", "2", "3");
		Optional<String> reduce = stringLists.stream().reduce((iden, acum) -> {
			return acum + iden;
		});
		String string = reduce.get();
		System.out.println(string);
		
		//toArray()
		Object[] array = stringLists.stream().toArray();
		for(Object o : array) {
			System.out.println(o);
		}
	
	}

}
