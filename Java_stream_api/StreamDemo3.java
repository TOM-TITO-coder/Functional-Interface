package Java_stream_api;

import java.util.List;
import java.util.Optional;

public class StreamDemo3 {
    static List<String> names = List.of("Dara", "Dara", "Thida", "Cheata", "Seyha");

    public static void main(String[] args) {
        names.stream()
         .distinct()
         .forEach(System.out::println);

        boolean anyMatch = names.stream()
             //.anyMatch(name -> name.endsWith("ra"));
             //  .allMatch(name -> name.endsWith("a"));
               .noneMatch(name -> name.endsWith("la"));
        System.out.println(anyMatch);

        // findFirst() and findAny()
        Optional<String> findFirst = names.stream()
             .filter(n -> n.length() > 4)
             .findFirst();
             //.orElse("No name found");
        System.out.println(findFirst);
        

        Optional<String> findAny = names.stream()
             .filter(n -> n.length() > 4)
             .findAny();
        System.out.println(findAny);

        // max() and min()
        Optional<String> longestName = names.stream()
             .max((x,y) -> x.length() - y.length());
        
        System.out.println(longestName);

        Optional<String> shortestName = names.stream()
             .min((x,y) -> x.length() - y.length());
        
        System.out.println(shortestName);

        // reduce()
        Optional<String> concatName = names.stream().reduce((a,b) -> a + "-" + b);
        System.out.println(concatName);
        
        String concatName2 = names.stream().reduce("",(a, b) -> a + "=>" +b);
        System.out.println(concatName2);
    }
}
