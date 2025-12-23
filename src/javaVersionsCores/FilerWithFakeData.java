package javaVersionsCores;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.productData.ProductDataGenerator;

public class FilerWithFakeData {
public static void main(String[] args) {
	List<Product> products = ProductDataGenerator.generateProduct(1000);
	/*
	 * Task: Given a list of Products, filter products that are bundles (isBundle = true) and collect them into a List.
	 */
	List<Product> bundles =products.stream().filter(p->p.isBundle()).collect(Collectors.toList()); 
	for(Product isBundleProduct : bundles) {
		System.out.println(isBundleProduct.getId());
		System.out.println(isBundleProduct.getHref());
		System.out.println(isBundleProduct.getDescription());
		System.out.println(isBundleProduct.getName());
		System.out.println(isBundleProduct.getOrderDate());
		System.out.println(bundles.size());
		
	}
}
}
