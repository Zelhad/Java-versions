package javaVersionsCores.productData;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javaVersionsCores.Product;

public class ProductDataGenerator {
	
	public static List<Product>  generateProduct(int  count) {
		List<Product> products = new ArrayList<Product>();
		Random random = new Random();
		String[] categs = {"Electronics", "Home", "Sports", "Fashion", "Books", "Toys", "Automotive", "Health"};
		String[] adjectives = {"Pro", "Elite", "Basic", "Premium", "Standard", "Deluxe", "Ultra", "Lite"};
		
		for(int i = 0;i< count; i++) {
			String id = "PROD" + String.format("%04d",i);
			String cat = categs[random.nextInt(categs.length)];
			String adj = adjectives[random.nextInt(adjectives.length)];
			String name = cat+" " + adj +" " + (i% 50 +1);
			Boolean isBundle = random.nextDouble() >0.7;
			Boolean isCustumerVisible = random.nextDouble() >0.3;
			
			OffsetDateTime orderDate = OffsetDateTime.now().
					minusDays(random.nextInt(365))
					.minusHours(random.nextInt(24)).
					minusMinutes(random.nextInt(60));
			
			Product product = new Product(
					"api/products" + id,
					"Description for " + name + "In category " + cat , isBundle , isCustumerVisible , name,  orderDate);
			product.setId(id);
			
			product.setName(name);
			
			products.add(product);
			

		}
		return products;
		
	}
	}
		
		
	


