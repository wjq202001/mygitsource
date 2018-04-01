package cn.wjq.java.language.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wang Juqiang on 2018/3/25.
 */
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Page3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int length=0;
            if(s.length()>0){
                char[] arr = s.toCharArray();
                Set<Character> set = new HashSet();
                for(int i=0;i<arr.length;i++){

                    set.add(arr[i]);
                    for(int j=i+1;j<arr.length;j++){
                        if(set.contains(arr[j])){
                            if(length<set.size()){
                                length=set.size();
                            }
                            set.clear();
                            break;
                        }
                        else{
                            set.add(arr[j]);
                        }
                    }
                }
            }
            return length;
        }
    }
}
