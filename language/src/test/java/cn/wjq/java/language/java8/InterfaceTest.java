package cn.wjq.java.language.java8;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wang Juqiang on 2018/7/15.
 */
public class InterfaceTest {
    interface MyInterface{
        default String getName(){
            return "Laoju";
        }
        String func();
        public static String getSName(){
            return "SLaoju";
        }
    }
    public class DerivedClass implements MyInterface{

        @Override
        public String func() {
            return "Fun";
        }
    }

    @Test
    public void funTest(){
        MyInterface myInterface = new DerivedClass();
        String r =myInterface.func();
        Assert.assertEquals("Fun",r);

        String l = myInterface.getName();
        Assert.assertEquals("Laoju",l);

        String s = MyInterface.getSName();
        Assert.assertEquals("SLaoju",s);
    }

}
