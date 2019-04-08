package com.hnust.hua.algorithm;

/** 题目：编写一个程序，有1，2,3,4个数字，
 *  能组成多少个互不相同且无重复数字的三位数？都是多少？
 * Created by Administrator on 2019/3/13.
 */
public class Test07 {
    public static void main(String [] args) {
        int i, j, k;
        int m=0;
        for(i=1;i<=4;i++)
            for(j=1;j<=4;j++)
                for(k=1;k<=4;k++){
                    if(i!=j&&k!=j&&i!=k){
                        System.out.println(""+i+j+k);
                        m++;
                    }
                }
        System.out.println("能组成："+m+"个");
    }
}
