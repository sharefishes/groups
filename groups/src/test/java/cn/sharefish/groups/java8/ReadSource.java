package cn.sharefish.groups.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ReadSource {

    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("aaaaa");
        set.add("bbbbb");
        set.add("ccccc");
            
        Stream<String> stream = set.stream();
    }
}
