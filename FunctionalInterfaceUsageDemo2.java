import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import FunctionalInterfaceUsage.Student;

public class FunctionalInterfaceUsageDemo2 {

    static List<Student> students = List.of(
        new Student("Dara", "M", 18),
        new Student("Thida", "F", 18),
        new Student("Seyha", "M", 16),
        new Student("Cheata", "F", 18),
        new Student("Dalin", "F", 17),
        new Student("Mina", "F", 17),
        new Student("Milin", "F", 17)
    );

    public static void main(String[] args){
        
        //Comparator<Student> sortByAge = ( o1, o2) -> o2.getAge() - o1.getAge();

        students.stream()
        .filter(st -> st.getGender() == "F")
        .sorted(( o1, o2) -> o2.getAge() - o1.getAge())     // .sorted(sortByAge)
        .limit(3)
        .forEach(s -> System.out.println(s.getName() +", "+ s.getAge()));

        Map<String, List<Student>> groubByGender = students.stream()
        .collect(Collectors.groupingBy(p -> p.getGender()));
        
        Map<Integer, List<Student>> groupByAge = students.stream()
        .collect(Collectors.groupingBy(p -> p.getAge()));

        Map<Integer, Long> groubByCount = students.stream()
        .collect(Collectors.groupingBy(p -> p.getAge(), Collectors.counting()));
        
        // Group student who can vote and cannot vote
        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(st -> st.getAge() > 17));
        System.out.println(map);
        System.out.println(groubByCount);
        System.out.println(groupByAge);
        System.out.println(groubByGender);
    }
}
