package cn.wjq.java.language;

/**
 * Created by sks on 2018/2/8.
 */
public class SubClass extends BaseClass {
    private Integer sub1 = initSub1();

    private Integer initSub1(){
        System.out.println("initsub1");
        return 1;
    }

    public SubClass(){
        System.out.println("sub class constructor");
    }
}
