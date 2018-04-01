package cn.wjq.java.language.algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wang Juqiang on 2018/3/24.
 */
//https://leetcode.com/problems/add-two-numbers/description/
public class LinkedListAddTest {

    /**
     * Definition for singly-linked list.
     **/
    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    class Solution {
        private ListNode revertList(ListNode l){
            if(l==null){
                return null;
            }
            else{
                if(l.next==null){
                    return l;
                }
                ListNode p = null;
                while(l.next!=null){

                    if(l.next.next==null){ // l.next is the last node
                        ListNode nextL = l.next;
                        l.next.next=l;
                        l.next = p;
                        return  nextL;
                    }
                    else{// l.next is not the last node
                        ListNode nextL = l.next;
                        ListNode nextP = l;
                        l.next = p;
                        p = nextP;
                        l=nextL;
                    }
                }
            }
            return l;
        }
        private int getNumber(ListNode l){
            StringBuilder num1Builder = new StringBuilder();
            while(l!=null){
                num1Builder.append(l.val);
                l = l.next;
            }
            return Integer.parseInt(num1Builder.toString());
        }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode revertedL1 = revertList(l1);
            ListNode revertedL2 = revertList(l2);
            int i1 = getNumber(revertedL1);
            int i2 = getNumber(revertedL2);;
            Integer result = i1+i2;

            String s =  result.toString();
            ListNode ln = null;
            for(int i=0;i<s.length();i++){
                int d = 1;
                for(int j=1;j<s.length()-i;j++){
                    d *=10;
                }
                int val = result / d;
                result -= val * d;
                ListNode node = new ListNode(val);
                node.next = ln;
                ln=node;
            }
            return ln;
        }
    }

    @Test
    public void test(){
        Solution solution = new Solution();
        ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node.next=node1;
        node1.next = node2;

        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        node3.next=node4;
        node4.next = node5;
        ListNode n =solution.addTwoNumbers(node,node3);

        Assert.assertNotNull(n);
    }
}
