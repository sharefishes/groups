package cn.sharefish.groups.java8;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    int top = 0;
    List<T> pool = new ArrayList<T>();

    public T pop() {
        if(top==0){
            return null;
        }
        T topObj = pool.get(top - 1);
        pool.remove(top - 1);
        top = top - 1;
        return topObj;
    }

    public T put(T tt) {
        pool.add(tt);
        top++;
        return tt;
    }

    public List<T> list() {
        List<T> tmp = new ArrayList<T>();
        pool.forEach(o->tmp.add(0, o));
        return tmp;
    }

    public int getTop() {
        return top;
    }
    
    public boolean isEmpty(){
        return top==0;
    }

}
