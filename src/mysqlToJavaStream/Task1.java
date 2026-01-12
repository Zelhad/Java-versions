package mysqlToJavaStream;

import java.util.List;
import java.util.Optional;

import javaVersionsCores.AgreementItemRef;
import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task1 {
	
	public static void main(String[] args) {
		
		List<Product> products = ProductDataGenerator.generateProduct(100);
		Optional<Product> firstProduct = products.stream().findFirst();
		
		Product product = firstProduct.get();
		System.out.println(product.getId());
		System.out.println(product.getHref());
		
		

		product.getHref(); 
		product.getDescription();
		product.getOrderDate();
		AgreementItemRef first = product.getAgreementItemRefs().getFirst();
		
	}
}
