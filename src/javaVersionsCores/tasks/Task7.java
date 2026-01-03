package javaVersionsCores.tasks;

import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task7 {
	public static void main(String[] args) {
		//Task 7: Find all products that have agreements AND are NOT bundled.
		List<Product> products = ProductDataGenerator.generateProduct(100);
		products.stream().filter(
				product -> !product.getAgreementItemRefs().isEmpty()
				&& !product.isBundle()
				).collect(Collectors.toList());
	}

}
