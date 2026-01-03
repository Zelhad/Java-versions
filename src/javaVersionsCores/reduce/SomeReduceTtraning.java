package javaVersionsCores.reduce;

import java.util.List;
import java.util.stream.Collectors;

public class SomeReduceTtraning {
	public static void main(String[] args) {
		var words = List.of("Java", "is", "powerful");
		var  prices = List.of(100, 200, 50, 150);

		String maxString = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(maxString);

	}
}
