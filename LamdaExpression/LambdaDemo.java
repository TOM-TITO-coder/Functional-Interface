package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo {
    public static void main(String[] args) {

       Calculator calc = new MyCalculator(); 
       Calculator calc1 = (n1,n2) -> n1*n2*10;   // lamda object
    }

    static class MyCalculator implements Calculator{
        @Override
        public int calculate(int a, int b) {
            return a*b;
        }
    }

    void test1(){
         // MyPrinter printer = new MyPrinter() {
        //     @Override
        //     public void print(String text) {
        //         System.out.println(text);
        //     }
        // };

        MyPrinter printer = (text) -> System.out.println(text);

        printer.print("Hello world!");

        Info myInfo = () -> System.out.println("Company Information.");
        myInfo.showInfo();

        Comparator<Integer> compareByNumber = (p1, p2) -> p2 - p1;

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(12);
        list1.add(34);
        System.out.println(list1);
        System.out.println("===============");

        Collections.sort(list1, compareByNumber);

        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Mike");
        list2.add("Tom");
        list2.add("Nick");

        System.out.println(list2);

        Collections.sort(list2, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list2);

        //Map<String, Long> priceMap = new HashMap<>();
        var priceMap = new HashMap<String, Long>();

        priceMap.put("Apple", 100L);

        Calculator calc = (a, b) -> {
            a = a*2;
            System.out.println(a+"*"+b+"=?");
            return a*b;
        };

        System.out.println(calc.calculate(3, 5));
    }
}
