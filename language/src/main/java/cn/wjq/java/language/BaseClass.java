package cn.wjq.java.language;

/**
 * Created by sks on 2018/2/8.
 */
public class BaseClass {
    private Integer base1 = initBase1();

    private Integer initBase1(){
        System.out.println("base1 init");
        return 1;
    }

    public BaseClass(){
        System.out.println("base 1 constuctor");
    }
}
