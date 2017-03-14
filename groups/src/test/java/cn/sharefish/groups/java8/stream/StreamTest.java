package cn.sharefish.groups.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1","C3");

        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
        long time2 = System.currentTimeMillis();
        
        
        System.out.println(time2-time1);
    }
}
