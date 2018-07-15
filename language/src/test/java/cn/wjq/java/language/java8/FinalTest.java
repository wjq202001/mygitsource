package cn.wjq.java.language.java8;

import org.junit.Test;

/**
 * Created by Wang Juqiang on 2018/7/15.
 */
public class FinalTest {

    @Test
    public void test() {
        FinalMyClass myClass1 = new FinalMyClass();
        FinalMyClass myClass2 = new FinalMyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.i); // final同一个实例中成员变量的值不会再次变化
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);// static多个实例共享同一个值，一旦初始化，所有实例都是用的这个值
        System.out.println(myClass2.j);

    }


}
