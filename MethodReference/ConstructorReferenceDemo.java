package MethodReference;

public class ConstructorReferenceDemo {
    
    public static void main(String[] args) {
        StudentService studentService = (n, a) -> new Student(n, a);
        Student st1 = studentService.creaStudent("Ricardo", 25);
        System.out.println(st1.getName());

        // Constructor Reference
        StudentService studentService2 = Student::new;
        Student st2 = studentService2.creaStudent("Ricardo", 25);
        System.out.println(st2.getName());
        
    }
    
}
