package javaVersionsCores.tasks.groupingTrain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.stream.Collectors;

import javaVersionsCores.Product;
import javaVersionsCores.productData.ProductDataGenerator;
/*
 * mysql> SELECT * FROM  products WHERE id = 12 ;
+----+-------------------------------+------------------------------------------------------------+---------------+-----------+---------------------+---------------------+
| id | href                          | description                                                | name          | is_bundle | is_customer_visible | order_date          |
+----+-------------------------------+------------------------------------------------------------+---------------+-----------+---------------------+---------------------+
| 12 | /realHref/devices/electronics | /realHref/devices/electronics/realHref/devices/electronics | XAIMO REMI 4  |         0 |                   0 | 2025-10-28 02:28:00 |
+----+-------------------------------+------------------------------------------------------------+---------------+-----------+---------------------+---------------------+
1 row in set (0.00 sec)

mysql>
 */
public class Task12 {
	public static void main(String[] args) {
		// SELECT * FROM  products WHERE id = ?
		
		//Return one Product  with a condition of id =12 
		//sList<Product> products = ProductDataGenerator.generateProduct(100);
		
//		products.stream().map(product -> )
		
		
	}
}
