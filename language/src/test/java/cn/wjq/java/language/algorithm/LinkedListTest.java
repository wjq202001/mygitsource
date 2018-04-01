package cn.wjq.java.language.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by sks on 2018/2/23.
 */
public class LinkedListTest {
    private class Node<E>{
        E value;
        Node<E> next;

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public Node<Integer> initList(Collection<Integer> collection){
        Node<Integer> head = null;
        Node<Integer> current = head;
        Node<Integer> next = head;
        if(collection!=null){
            for (Integer item :
                    collection) {
                if(current==null){
                    current = new Node<>();
                    current.setNext(null);
                    current.setValue(item);
                    head = current;
                }else {
                    next = new Node<>();
                    next.setValue(item);
                    next.setNext(null);
                    current.setNext(next);
                    current = next;
                }
            }
        }
        return head;
    }

    @Test
    public void InitLinkTest(){
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        Node<Integer> head = initList(ls);

    }

    public Node<Integer> revertList(Node<Integer> head){
        if(head==null || head.getNext()==null){
            return head;
        }


        Node<Integer> reHead = revertList(head.getNext());
       // Node<Integer> current = head;
        //reHead.setNext(head);
        head.getNext().setNext(head);
        //reHead = head;
        head.next = null;
        return reHead;
    }

    @Test
    public void revertListTest(){
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        Node<Integer> head = initList(ls);

        head = revertList(head);
    }
}
