package javaVersionsCores.collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");
        //ToList
        List<String> nameLists = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        nameLists.stream().forEach(name -> System.out.println(name));
        //toSet
        Set<String> toSetNames = names.stream().collect(Collectors.toSet());
        toSetNames.stream().forEach(name -> System.err.println(name));
        //ToMap
      Map<String, Integer> nameToMap = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
      System.out.println(nameToMap);
      //// 4. joining() - Concatenates strings
     
      String joining = names.stream().collect(Collectors.joining(" , "));
      System.out.println(joining);
      //counting
      Long counting = names.stream().collect(Collectors.counting());
      System.out.println(counting);
      // // 6. summarizingInt/Long/Double - Statistics
      
      IntSummaryStatistics summuraing = names.stream().collect(Collectors.summarizingInt(String :: length));
      System.out.println("Stats :" + summuraing);
      
	}

}
