package cn.wjq.java.language.proxy;

import java.io.Console;

/**
 * Created by sks on 2018/1/5.
 */
public class RealSubject implements Subject {
    public void send(String message) {
        System.out.println("this is the send message:" + message);
    }

    public void get(String message) {
        System.out.println("this is the get message:" + message);
    }
}
