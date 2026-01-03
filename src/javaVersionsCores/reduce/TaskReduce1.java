package javaVersionsCores.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javaVersionsCores.AgreementItemRef;
import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;

public class TaskReduce1 {
	public static void main(String[] args) {
		List<Product> products = ProductDataGenerator.generateProduct(100);
		//Ex1 Concatenate all product names into a single string separated by " | "
		String AllNames = products.stream().
		map(product -> product.getName()).
		reduce("" , (acc , productName) -> acc + productName + "|");
		System.out.println(AllNames);
		//Ex 2 : Total Agreements
		//Calculate the total number of agreements across all products using reduce
		int totalAgreements = products.stream()
	            .mapToInt(product -> product.getAgreementItemRefs().size())
	            .reduce(0, (acc, cntAccount) -> acc + cntAccount);
		
		//Exercise 3: Longest Product Name
		products.stream().
		map(product-> product.getName())
		.reduce("", (a,b)-> 
			a.length()>b.length() ? a : b
		);
//Find the product with the highest number of agreements
		Optional<Product> reduce = products.stream()
		.reduce((a,b) -> a.getAgreementItemRefs().size()> b.getAgreementItemRefs().size() ? a : b);
		reduce.get();
	 
		/*
		 * 	for(List<AgreementItemRef> aggrs :collect) {
			for(AgreementItemRef arg : aggrs) {
				System.out.println(arg);
			}
			
		}
		 */
	
		
	
	}

}
