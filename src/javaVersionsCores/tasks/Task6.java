package javaVersionsCores.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task6 {

	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		Map<String, List<Product>> productsByCatg = products.stream().collect(Collectors.groupingBy(product -> product.getName().split(" ")[0]));
		productsByCatg.forEach((cat, productList) -> System.out.println(cat + "  " + productList.size()));
	}
}
 