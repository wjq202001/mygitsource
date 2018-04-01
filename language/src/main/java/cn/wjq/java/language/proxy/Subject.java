package cn.wjq.java.language.proxy;

import cn.wjq.java.language.proxy.intercepter.AOP;

/**
 * Created by sks on 2018/1/5.
 */
public interface Subject {

    @AOP
    public void send(String message);

    public void get(String message);
}
