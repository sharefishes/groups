package cn.sharefish.groups.java8;

import java.util.List;

public class StackTest {

    
    public static void main(String[] args) {
        String a="aaaa";
        String b="bbbb";
        String c="cccc";
        Stack<String> stack = new Stack<String>();
        stack.put(c);
        stack.put(b);
        stack.put(a);
        List<String> list = stack.list();
        list.forEach(tmp->{System.out.println(tmp);});            
    }
}

