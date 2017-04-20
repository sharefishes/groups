package cn.sharefish.groups.java8.model.filter;

/**
 * 
 * 过滤器
 * 责任链
 *  new A(new B( new C))
 *  A B C 实现共同的接口，有共同的标准方法
 *  
 *  链式调用 有共同的返回结果，或者void。
 *  
 *  
 * 
 * @author yangjunshuai
 *
 */
public interface Filter {

    
    
    public void doFilter();
    
    
}
