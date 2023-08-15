import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = text -> System.out.println(text);
        print.accept("Hello World!");

        List<Integer> list = List.of(23, 30, 40, 59);
        
        Consumer<List<Integer>> display = intList -> {
            System.out.println("==================================");
            System.out.println(list);
        };
        display.accept(list);

        Consumer<Integer> display2 = num -> System.out.print(num);
        // method reference
        //list.forEach(display2);
       // list.forEach(n -> System.out.print(n + ", "));

        list.forEach(System.out::println);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
            if(list.get(i)%2 == 0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

        Consumer<Integer> display3 = num -> {
            System.out.println(num);
            if(num%2 == 0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };
        list.forEach(display3);
    }
}