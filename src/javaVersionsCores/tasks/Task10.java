package javaVersionsCores.tasks;

import java.util.Comparator;
import java.util.List;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task10 {
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		
		//Total number of products
		products.stream().count();

		//Number of bundled vs non-bundled products
		products.stream().filter(p->p.isBundle()).count();
		products.stream().filter( p-> !p.isBundle()).count();

		//Number of visible vs hidden products
		products.stream().filter(p-> p.isCustomerVisible()).count();
		products.stream().filter(p-> !p.isCustomerVisible()).count();

		//Average agreements per product
		products.stream().mapToInt(p->p.getAgreementItemRefs().size()).average();

		//Top 3 categories with most products

		//List of all products that are bundled AND visible, sorted by name
		products.stream().filter(product->  product.isBundle() && product.isCustomerVisible()).sorted(Comparator.comparing(Product::getName));
		//All unique agreement IDs across all products
products.stream().map(product -> product.getId()).distinct();
		//The product with the most agreements
//roducts.stream().filter(product-> product.getAgreementItemRefs().size());
	}
	
	/*
	 * 
	 * package javaVersionsCores.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task10 {
    public static void main(String[] args) {
        List<Product> products = ProductDataGenerator.generateProduct(100);
        
        System.out.println("=== COMPREHENSIVE PRODUCT REPORT ===\n");
        
        // 1. Total number of products
        long totalProducts = products.stream().count();
        System.out.println("1. Total products: " + totalProducts);
        
        // 2. Number of bundled vs non-bundled products
        long bundledCount = products.stream().filter(p -> p.isBundle()).count();
        long nonBundledCount = products.stream().filter(p -> !p.isBundle()).count();
        System.out.println("2. Bundled products: " + bundledCount);
        System.out.println("   Non-bundled products: " + nonBundledCount);
        
        // 3. Number of visible vs hidden products
        long visibleCount = products.stream().filter(p -> p.isCustomerVisible()).count();
        long hiddenCount = products.stream().filter(p -> !p.isCustomerVisible()).count();
        System.out.println("3. Visible products: " + visibleCount);
        System.out.println("   Hidden products: " + hiddenCount);
        
        // 4. Average agreements per product
        double avgAgreements = products.stream()
            .mapToInt(p -> p.getAgreementItemRefs().size())
            .average()
            .orElse(0.0);
        System.out.println("4. Average agreements per product: " + String.format("%.2f", avgAgreements));
        
        // 5. Top 3 categories with most products
        List<String> top3Categories = products.stream()
            .collect(Collectors.groupingBy(
                p -> p.getName().split(" ")[0],
                Collectors.counting()
            ))
            .entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .limit(3)
            .map(entry -> entry.getKey() + " (" + entry.getValue() + " products)")
            .collect(Collectors.toList());
        System.out.println("5. Top 3 categories:");
        top3Categories.forEach(cat -> System.out.println("   - " + cat));
        
        // 6. List of all products that are bundled AND visible, sorted by name
        List<String> bundledVisibleProducts = products.stream()
            .filter(p -> p.isBundle() && p.isCustomerVisible())
            .sorted(Comparator.comparing(Product::getName))
            .map(p -> p.getName())
            .collect(Collectors.toList());
        System.out.println("6. Bundled & visible products (sorted): " + bundledVisibleProducts.size() + " products");
        bundledVisibleProducts.forEach(p -> System.out.println("   - " + p));
        
        // 7. All unique agreement IDs across all products
        List<String> uniqueAgreementIds = products.stream()
            .flatMap(p -> p.getAgreementItemRefs().stream())
            .map(agreement -> agreement.getId())
            .distinct()
            .collect(Collectors.toList());
        System.out.println("7. Unique agreement IDs: " + uniqueAgreementIds.size());
        
        // 8. The product with the most agreements
        String productWithMostAgreements = products.stream()
            .max(Comparator.comparingInt(p -> p.getAgreementItemRefs().size()))
            .map(p -> p.getName() + " (" + p.getAgreementItemRefs().size() + " agreements)")
            .orElse("No products found");
        System.out.println("8. Product with most agreements: " + productWithMostAgreements);
        
        System.out.println("\n=== REPORT COMPLETE ===");
    }
}
to look after Tomorrow
	 */

}
