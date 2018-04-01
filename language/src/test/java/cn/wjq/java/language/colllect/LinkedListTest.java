package cn.wjq.java.language.colllect;

import org.junit.Test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by sks on 2018/2/23.
 */
public class LinkedListTest {
    @Test
    public void RevertLinkedList(){

        LinkedList<Integer> ls = this.getLinkList();
        int midCount = (ls.size()-1) / 2;
        for (int i=0,j=ls.size()-1;i<= midCount;i++,j--){
            int item = ls.get(i);
            ls.set(i, ls.get(j));
            ls.set(j,item);
        }
        printLs(ls);
    }

    private void printLs(LinkedList<Integer> ls) {
        for (int item :
                ls) {
            System.out.println(item);
        }
    }

    private LinkedList getLinkList(){
        LinkedList<Integer> ls = new LinkedList();
        ls.add(0,1);
        ls.add(1,2);
        ls.add(2,3);
        ls.add(3,4);
        ls.add(4,5);
        return ls;
    }

    @Test
    public void RevertTest_1(){
        LinkedList<Integer> ls = this.getLinkList();
        for (int i=0;i<ls.size()-1;i++) {
            Integer last = ls.removeLast();
            ls.add(i,last);
        }
        printLs(ls);
    }



}
