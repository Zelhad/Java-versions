package javaVersionsCores.dealingWithNuls;

import java.util.Optional;

public class tpOptional {
	public static void main(String[] args) {
		Optional<String> itCouldBeName = Optional.of("Zouhair");
		Optional<String> emptyName = Optional.empty();
		if(itCouldBeName.isPresent()) {
			System.out.println("Name is not empty   " + itCouldBeName.get());
		}
		String name = emptyName.orElse("DEFAULT NAME ");
		// with lampda expression
		// 1 - ifPresent
		itCouldBeName.ifPresent(namee ->  System.out.println("Found" + namee ));
		// 1 - orElseThrow()
		//String nameSearch = emptyName.orElseThrow(()-> new RuntimeException("not found"));
		
	}

}
