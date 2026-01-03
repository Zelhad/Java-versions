package javaVersionsCores.tasks;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;
public class TestDataAfterAddingAgr {
	public static void main(String[] args) {
		System.out.println("Generating some data   to use in Stream demos");
		List<Product> products = ProductDataGenerator.generateProduct(3);
		//// Task: Find all products that are both bundled AND visible to customers
		List<Product> bundlesAndVisibles = products.stream().filter(
				product -> 
				product.isBundle() && product.isCustomerVisible()
				).
				collect(Collectors.toList());
		for(Product product : bundlesAndVisibles) {
		System.out.println(product.getId());
		System.out.println(product.getHref());
		System.out.println(product.getDescription());
		System.out.println(product.isBundle());
		System.out.println(product.isCustomerVisible());
		System.out.println(product.getOrderDate());
		System.out.println(product.getAgreementItemRefs());
	
		}
		
	}

}
