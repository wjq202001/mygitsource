package cn.wjq.java.language.multithread;

/**
 * Created by sks on 2017/11/25.
 */
//继承Thread类，并重写Run方法
public class MyThread extends Thread {
    public MyThread(){

    }
    public MyThread(Runnable runnable){
        super(runnable);
    }
    @Override
    public void run(){
        System.out.println("This is my first thread. Thread id is " + Thread.currentThread().getId());
    }
}
