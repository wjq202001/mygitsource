package cn.wjq.java.language.multithread;

/**
 * Created by sks on 2017/11/25.
 */
public class MyRunnableEntry {
    public static void main(String[] args){
        Runnable myRunnable = new MyRunnable();
        // runnable 的调度还是依靠Thread类来进行，我们可以理解为Runnable就是一个任务，这个任务是要交给一个线程来执行的。
        // Thread类本质上也实现runnable接口进行调度的只不过实现时将内部包含的Runnable target。 通过继承Thread来调度和实现Runnable接口来调度的区别
        //Thread thread = new Thread(myRunnable);
        Thread thread = new Thread();
        thread.start();
    }
}
