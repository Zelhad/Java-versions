package javaVersionsCores.tasks.groupingTrain;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class TrainGrouping1 {
	/*
	 * Products: [P1(bundled), P2(not bundled), P3(bundled), P4(not bundled),
	 * P5(bundled)]
	 * 
	 * After grouping by isBundle(): Group "true" (bundled): [P1, P3, P5] Group
	 * "false" (not bundled): [P2, P4]
	 */
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		Map<Boolean, List<Product>> groupIsbundle = products.stream()
				.collect(Collectors.groupingBy(product -> product.isBundle()));
		Set<Entry<Boolean, List<Product>>> entrySet = groupIsbundle.entrySet();
		
		
	}

}
