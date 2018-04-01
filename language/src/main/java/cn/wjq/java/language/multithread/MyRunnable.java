package cn.wjq.java.language.multithread;

/**
 * Created by sks on 2017/11/25.
 */
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This is my runable class. thread id is " + Thread.currentThread().getId());
    }
}
