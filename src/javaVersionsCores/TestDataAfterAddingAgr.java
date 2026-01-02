package javaVersionsCores;
import java.util.List;

import javaVersionsCores.productData.ProductDataGenerator;
public class TestDataAfterAddingAgr {
	public static void main(String[] args) {
		System.out.println("Generating some data   to use in Stream demos");
		List<Product> products = ProductDataGenerator.generateProduct(5);
		for(Product product : products) {
			System.out.println(product.getDescription());
			System.out.println(product.getAgreementItemRefs());
		}
		
	}

}
