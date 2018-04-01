package cn.wjq.java.language.colllect;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sks on 2018/1/15.
 */
public class List_Test {

    @Test
    public void Merge(){

    }

    @Test
    // 带重复
    public void Union(){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        List<String> list2 = new ArrayList<String>();
        list2.add("B");
        list2.add("C");

        list.addAll(list2);

        Assert.assertEquals(4,list.size());
    }

    @Test
    // 带重复
    public void Union_Unique(){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        List<String> list2 = new ArrayList<String>();
        list2.add("B");
        list2.add("C");

        list.removeAll(list2); // 先移除
        list.addAll(list2); // 再添加

        Assert.assertEquals(3,list.size());
    }

    @Test
    // 带重复
    public void Intersection(){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        List<String> list2 = new ArrayList<String>();
        list2.add("B");
        list2.add("C");

        list.retainAll(list2); // 保留list2中有的元素

        Assert.assertEquals(1,list.size());
    }
}
