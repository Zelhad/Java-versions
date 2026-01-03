package javaVersionsCores.tasks;

import java.util.List;
import java.util.OptionalDouble;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task8 {
	public static void main(String[] args) {
		//Task 8:
			//Calculate the average number of agreements per product.
		List<Product> products = ProductDataGenerator.generateProduct(100);
		OptionalDouble average = products.stream().mapToInt(product -> product.getAgreementItemRefs().size()).average();
	}

}
