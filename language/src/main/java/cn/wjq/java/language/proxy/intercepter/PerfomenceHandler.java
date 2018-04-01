package cn.wjq.java.language.proxy.intercepter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by sks on 2018/1/7.
 */
public class PerfomenceHandler<T> implements InvocationHandler {

    private T object;

    public PerfomenceHandler(T object){
        this.object =object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        AOP aop = method.getAnnotation(AOP.class);
        if(aop!=null){
            System.out.println("before invoke method.");
//            Object result = method.invoke(proxy, args);
            Object result = method.invoke(object, args);
            System.out.println("end invoke method.");
            return result;
        }
        else {
            Object result = method.invoke(proxy, args);
            return result;
        }

    }
}
