package javaVersionsCores.collectionsApi;

import java.util.ArrayList;

public class demo1 {
	public static void main(String[] args) {
		ArrayList<String> productNames = new ArrayList<>();
		productNames.add("Phones");
		productNames.add("Electronics");
		productNames.add("Smart tvs");
		productNames.add("Children");
		productNames.add("Womens");
		
		for(String productName : productNames) {
			System.out.println(productName);
		}
		
	}
}
