package javaVersionsCores.tasks;

import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task2 {
public static void main(String[] args) {
	List<Product> products = ProductDataGenerator.generateProduct(100);
	
	//// Task: Create a list of product names that are in the "Electronics" category
	List<String> productElectronics = products.stream().filter( product -> product.getName().startsWith("Electronics")).
	map(Product::getName).collect(Collectors.toList());
	System.out.println("Electronics product  found ------>" + productElectronics.size());
	productElectronics.forEach(System.out::println);
	
}
}
