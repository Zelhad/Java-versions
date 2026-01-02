package javaVersionsCores.productData;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javaVersionsCores.AgreementItemRef;
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
					"Description for " + name + "In category " + cat , 
					isBundle , 
					isCustumerVisible ,
					name,  orderDate,new ArrayList<>());
			product.setId(id);
			product.setName(name);
			//Generate some agreementItemRef 
			 int numAgreements = random.nextInt(3); // 0-2 agreements
	            for (int j = 0; j < numAgreements; j++) {
	            	AgreementItemRef  agreement = new AgreementItemRef (
	                    "AGREF" + String.format("%04d", i) + "_" + j,
	                    "api/agreements/AG" + String.format("%04d", i) + "_" + j,
	                    "AG" + String.format("%04d", i) + "_" + j,
	                    "Agreement for " + name,
	                    "BaseType",
	                    "http://schema.example.com",
	                    "AgreementItemRef",
	                    "AgreementItem"
	                );
	                product.addAgreementItemRef(agreement);
	            }
	            
	            products.add(product);
	        }
	        return products;
		
	}
	}
		
		
	


