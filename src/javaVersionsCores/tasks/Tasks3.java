package javaVersionsCores.tasks;

import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Tasks3 {
	public static void main(String[] args) {
		//// Exercise: Count how many products have more than 1 agreement
		List<Product> products = ProductDataGenerator.generateProduct(100);
	long count = products.stream().
		filter(product -> product.getAgreementItemRefs().size()>1).count();
	System.out.println(count);
		
		
	}

}
