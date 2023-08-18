package Java_stream_api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Dara", 20, List.of("Java", "Python", "C++")),
            new Student("Thida", 21, List.of("Nextjs", "Python", "C++", "java")),
            new Student("Cheata", 22, List.of("C#", "SQL", "C++")),
            new Student("Seyha", 23, List.of("JavaScript", "Python", "C++"))
        );

        // find all subjects [Java, Python, C++, Nextjs, C#, SQL, JavaScript]
        // List<List<String>> collect = students.stream()
        //         .map(st ->st.getSubjects())
        //         .collect(Collectors.toList());
        
        List<String> collect = students.stream()
                .flatMap(stu -> stu.getSubjects().stream())
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println(collect);

         
    }
}
