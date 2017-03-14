package cn.sharefish.groups.java8;

import java.util.ArrayList;
import java.util.List;

public class Queen<T extends Object> {
    int last = 0;
    
    List<T> pool = new ArrayList<T>();
    
    public T pop(){
        if(last == 0){
            return null;
        }
        T tt  = pool.get(0);
        pool.remove(0);
        last--;
        return tt;
    }
    
    public int push(T tt){
        pool.add(tt);
        return ++last;        
    }
    
    public List<T> list(){
        return pool;
    }
    
}
