package javaVersionsCores.flatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Seller {

	String sname;
	int sId;
	char sGrad;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public char getsGrad() {
		return sGrad;
	}

	public void setsGrad(char sGrad) {
		this.sGrad = sGrad;
	}

	public Seller(String sname, int sId, char sGrad) {
		this.sname = sname;
		this.sId = sId;
		this.sGrad = sGrad;
	}
}

public class Demo3 {
	
	public static void main(String[] args) {
		
		List<Seller> sellers = new ArrayList<Seller>();

		sellers.add(new Seller("Antonio", 101, 'A'));
		sellers.add(new Seller("Neol", 201, 'B'));
		sellers.add(new Seller("Jose", 301, 'A'));
		sellers.add(new Seller("jack", 401, 'C'));

		List<Seller> sellers2 = new ArrayList<Seller>();
		
		sellers2.add(new Seller("Zouhair", 501, 'A'));
		sellers2.add(new Seller("Jassir", 601, 'B'));
		sellers2.add(new Seller("Mohammed", 701, 'A'));
		sellers2.add(new Seller("Layla", 801, 'C'));
		
		List<List<Seller>> sellerList = Arrays.asList(sellers, sellers2);
		List<String> sellerNames = sellerList.stream().
		flatMap(
				seller -> seller.stream().
				map(sellerName -> sellerName.getSname()))
		.collect(Collectors.toList());
		sellerNames.forEach(sellerName-> System.out.println(sellerName));
		
		
		

	}

}
