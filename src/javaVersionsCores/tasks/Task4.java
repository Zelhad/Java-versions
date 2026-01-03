package javaVersionsCores.tasks;

import java.util.List;
import java.util.Optional;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task4 {
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		// Exercise: Find the first product that has no agreements
		Optional<Product> firstProduct = products.stream().filter(product -> product.getAgreementItemRefs().size() == 0)
				.findFirst();
		/*
		 * if(firstProduct.isPresent()) {
			System.out.println(firstProduct.get().getName());
		}else 
		{
			System.out.println("Product ot found");
		}
		 */
		
		//or 
		Product product = firstProduct.orElse(null);
		if(product != null) {
			System.out.println(firstProduct.get().getName());
		}else {
            System.out.println("No product without agreements");
        }
		
	}
}
