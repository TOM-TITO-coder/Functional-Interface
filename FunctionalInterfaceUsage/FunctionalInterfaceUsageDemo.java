package FunctionalInterfaceUsage;

import java.util.List;

public class FunctionalInterfaceUsageDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Dara", "Seyha", "Thida", "Dalin");
        // print all
        names.stream()
             .forEach(name -> System.out.println(name));

        // print length
        names.stream()
             .map(s -> s.length())
             .forEach(n -> System.out.println(n));
        
        // print uppercase 
        names.stream()
        .map(s -> s.toUpperCase())
        .forEach(name -> System.out.println(name));

        // print name which has length more than 4
        names.stream()
        .filter(name -> name.length() > 4)
        .forEach(name -> System.out.println(name));
    }
}
