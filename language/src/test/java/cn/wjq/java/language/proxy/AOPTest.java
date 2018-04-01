package cn.wjq.java.language.proxy;

import cn.wjq.java.language.proxy.intercepter.PerfomenceHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by sks on 2018/1/7.
 */

public class AOPTest {

    @Test
    public void TestAOP(){
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new PerfomenceHandler<Subject>(subject);

        Subject proxySubject = (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
                RealSubject.class.getInterfaces(),invocationHandler);

        proxySubject.send("Lao ju");
    }
}
