package javaVersionsCores.collectors;

import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task3 {
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);

		/*
		 * // Task: Use Collectors.toList() to get all products where description
		 * contains "Gaming" // Return: List<Product> containing matching products
		 */
		List<Product> gamingProducts = products.stream()
		.filter(product -> product.getDescription()
				.contains("Gaming"))
		.collect(Collectors.toList());
		System.out.println(gamingProducts);
	}
}
