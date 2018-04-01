package cn.wjq.java.language.colllect;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sks on 2018/2/11.
 */
public class ArraysTest {
    @Test
    public void asListTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        list.add(4);
        Assert.assertEquals(4,list.size());
    }
}
