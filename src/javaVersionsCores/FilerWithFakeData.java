package javaVersionsCores;

import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaVersionsCores.productData.ProductDataGenerator;

public class FilerWithFakeData {
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(1000);
		/*
		 * Task: Given a list of Products, filter products that are bundles (isBundle =
		 * true) and collect them into a List.
		 */
		List<Product> bundles = products.stream().filter(p -> p.isBundle()).collect(Collectors.toList());

		for (Product isBundleProduct : bundles) {
			System.out.println(isBundleProduct.getId());
			System.out.println(isBundleProduct.getHref());
			System.out.println(isBundleProduct.getDescription());
			System.out.println(isBundleProduct.getName());
			System.out.println(isBundleProduct.getOrderDate());
			System.out.println(bundles.size());

		}

		/*
		 * Task: Given a list of Products, filter products that are bundles (isBundle =
		 * true) and collect them by names .
		 */
		List<String> bundleByNames = products.stream().filter(Product::isBundle).map(product -> product.getName())
				.collect(Collectors.toList());
		for (String bundleName : bundleByNames) {
			System.out.println(bundleName);
		}
		/*
		 * Exercise 2: Filter & Count Task: Count how many products are customer visible
		 * (isCustomerVisible = true).
		 */
		long countCustomerVisible = products.stream().filter(Product::isCustomerVisible).count();
		System.out.println(countCustomerVisible);
		/*
		 * 
		 * Task: Get a list of hrefs for products that were ordered after a specific
		 * date.
		 * 
		 * Let's say: products ordered after OffsetDateTime.now().minusDays(7) (last 7
		 * days).
		 */
		OffsetDateTime minusDays = OffsetDateTime.now().minusDays(7);
		List<String> collect = products.stream().filter(product -> product.getOrderDate().isAfter(minusDays))
				.map(Product::getHref).collect(Collectors.toList());
		for (String href : collect) {
			System.out.println(href);
		}
		/*
		 * Exercise 4: Multiple Filters Task: Find products that are both bundles AND
		 * customer visible, then get their descriptions.
		 */
		List<String> productIsBundleAndVisibles = products.stream().filter(product -> product.isBundle())
				.filter(product -> product.isCustomerVisible()).map(product -> product.getDescription())
				.collect(Collectors.toList());

		for (String productvisible : productIsBundleAndVisibles) {
			System.out.println(productvisible);
		}
		/*
		 * Exercise 4: Multiple Filters Task: Find products that are both bundles AND
		 * customer visible, then get their descriptions. with one filer
		 * 
		 */
		List<String> visiblesAndBundles = products.stream()
				.filter(product -> product.isCustomerVisible() && product.isBundle()).map(Product::getDescription)
				.collect(Collectors.toList());
		// Task: Get unique product names for products ordered in the last 30 days.
		products.stream().filter(product -> product.getOrderDate().isAfter(OffsetDateTime.now().minusDays(30))).map(product -> product.getName())
				.distinct().collect(Collectors.toList());

	}
}
