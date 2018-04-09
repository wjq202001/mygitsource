package cn.wjq.java.language.algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wang Juqiang on 2018/4/9.
 */
public class Clockwise {
    private int[][] clockwise(int[][] a){
        if(a==null || a[0]==null){
            return a;
        }
        int m = a.length, n = a[0].length;

        int i=0,j=0;
        while(i<m/2 && j<n/2){
            int temp = a[i][j];
            for(int k=i;k<m-i-1;k++){
                // left
                a[k][j]=a[k+1][j];
            }
            // bottom
            for(int k=j;k<m-j-1;k++){
                a[m-i-1][k]=a[m-i-1][k+1];
            }
            // right
            for(int k=m-i-1;k>i;k--){
                a[k][n-j-1]=a[k-1][n-j-1];
            }
            // top
            for(int k=n-j-1;k>j;k--){
                a[i][k]=a[i][k-1];
            }
            a[i][j+1]=temp;
            i++;
            j++;
        }
        return a;
    }

    @Test
    public void test(){
        int[][] a = new int[][]{
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}
        };
        int[][] b = clockwise(a);
        Assert.assertEquals(2, b[0][0]);
    }
}
