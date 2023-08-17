package MethodReference;

import LamdaExpression.MyPrinter;

public class MethodReferenceDemo {
    public static void main(String[] args){
        Finder finder = new MyFinder();
        String text = "Welcome to Cambodia";
        int index = finder.find(text, "to");
        System.out.println(index);

        Finder finder1 = FindText::getIndexFromString;           // static methd reference 
        int indexFound = finder1.find("Dara is a student", "is");
        System.out.println(indexFound);

        Finder finder2 = (text1, text2) -> text1.indexOf(text2) + 10;
        System.out.println(finder2.find("abcs", "b"));

        MyPrinter myPrinter = s -> System.out.println(s);
        myPrinter.print("Hello");

        MyFinder2 myFinder2 = new MyFinder2();
        Finder finderNew = myFinder2::find1;
        System.out.println(finderNew.find("Hello", "l"));
        
        MyPrinter myPrinter1 = System.out::println;
        myPrinter1.print("Hello");
        myPrinter1.print("Hello");
        
        // Parameter type must be the same as the method reference
        Finder finder3 = String::indexOf;

        int index1 = finder3.find("Hello", "l");
        System.out.println(index1);
    }
}
