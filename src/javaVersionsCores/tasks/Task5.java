package javaVersionsCores.tasks;

import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

record ProductSummary(String id, String name, boolean isBundle) {}
public class Task5 {
	public static void main(String[] args) {
		//Create a list of ProductSummary objects containing only id, name, and isBundle
		//from each Product.
		List<Product> products = ProductDataGenerator.generateProduct(100);
		List<ProductSummary> ProductSummarys = products.stream() 
		.map(product -> new ProductSummary(product.getId(), product.getName(), product.isBundle()))
		.collect(Collectors.toList());
		ProductSummarys.forEach(summary -> System.out.println(
			    summary.id() + " - " + summary.name() + " [Bundle: " + summary.isBundle() + "]"
			));
		
	}

}
