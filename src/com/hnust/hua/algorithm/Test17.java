package com.hnust.hua.algorithm;

/**  打印 2+22+222+2222+22222
 * Created by Administrator on 2019/4/8.
 */
public class Test17 {
    public static void main(String[] args){
        int a=0,sum=0;
        for(int i=0;i<=5;i++){
            a=(a*10)+2;
            sum+=a;
        }
        System.out.println("sum="+sum);
    }
}
