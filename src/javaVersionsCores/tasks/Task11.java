package javaVersionsCores.tasks;

import java.util.List;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task11 {
	/*
	 * Task 1: Total number of products
	 */
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		long countProducts = products.stream().count();
		// System.out.println("Total products is " + countProducts);
		/*
		 * Task 2:
		 * 
		 * Add code to count bundled and non-bundled products
		 */
		long countBundleProduct = products.stream().filter(product -> product.isBundle()).count();
		long countNotBundleProduct = products.stream().filter(product -> !product.isBundle()).count();
		// System.out.println("Bundle product is " + countBundleProduct + " And not
		// bundle product is " + countNotBundleProduct);
		/*
		 * Task 3: Number of visible vs hidden products
		 */
		long countVisibleProduct = products.stream().filter(product -> product.isCustomerVisible()).count();
		long countNotVisibleProduct = products.stream().filter(product -> !product.isCustomerVisible()).count();
		System.out.println("Visble  product is " + countVisibleProduct + " And not visible product is " +countNotVisibleProduct );
	}

}
