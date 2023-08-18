package Java_stream_api;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    static  List<String> names = List.of("Dara", "Dara", "Thida", "Cheata", "Seyha");

    public static void main(String[] args) {
       
        Stream<String> streamName = names.stream();    // obtain a stream from a list

        streamName                                     // intermediate operations
         .filter(n -> n.contains("t"))
         .map(name -> name.length())                  // lazy operation
         .forEach(System.out::println);               // terminal operation
        
        names.stream()
         //.limit(2)                    // limit the number of elements
         .filter(p -> p.contains("D"))
         .limit(2)              // limit the name that contains "D"
         .forEach(System.out::println);

        List<Integer> collect = names.stream()
         .distinct()
         .map(String :: length)
         .distinct()
         .collect(Collectors.toList());        // terminal operation

        System.out.println(collect);

        distinct();
        collectDemo();
        
    }

    static void collectDemo(){
        Set<String> namesSet = names.stream()
         .collect(Collectors.toSet());
        
        System.out.println(namesSet);
        
    }

    static void distinct() {
        names.stream()
         .distinct()
         .forEach(System.out::println);
    }

    
}
