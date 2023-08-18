package Java_stream_api;

import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        //find sum

        Integer total = list.stream().reduce(0, (a, b) -> a+b);
        System.out.println(total);

    }
}
