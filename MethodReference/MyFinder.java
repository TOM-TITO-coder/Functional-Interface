package MethodReference;

public class MyFinder implements Finder{
    @Override
    public int find(String s1, String s2) {
        return s1.indexOf(s2);
    }
}
