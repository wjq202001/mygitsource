package cn.wjq.java.language.multithread;


/**
 * Created by sks on 2017/11/25.
 */
public class MyThreadEntry {
    public static void main(String[] args){
        Runnable runnable  = new MyRunnable();
        MyThread myThread = new MyThread(runnable);
        System.out.println("Main thread Id is:"+Thread.currentThread().getId());
        myThread.start(); // 执行thread.start新起一个线程

        myThread.run(); // 执行thread.run在主线程中执行
    }
}
