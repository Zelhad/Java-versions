package javaVersionsCores.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class Task9 {
    public static void main(String[] args) {
        List<Product> products = ProductDataGenerator.generateProduct(100);
        
        // Sort by: visible first, bundled first, then name alphabetically
        List<Product> sortedProducts = products.stream()
            .sorted(Comparator
                .comparing(Product::isCustomerVisible).reversed()  // visible first
                .thenComparing(Product::isBundle).reversed()       // bundled first  
                .thenComparing(Product::getName)                   // name A-Z
            )
            .collect(Collectors.toList());
        
        // Print first 10 sorted products
        sortedProducts.stream()
            .limit(10)
            .forEach(p -> System.out.println(
                (p.isCustomerVisible() ? "[Visible] " : "[Hidden] ") +
                (p.isBundle() ? "[Bundle] " : "[Single] ") +
                p.getName()
            ));
    }
}