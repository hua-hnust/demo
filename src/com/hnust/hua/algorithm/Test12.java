package com.hnust.hua.algorithm;

/**  字符串截取
 * Created by Administrator on 2019/3/27.
 */
public class Test12 {

    public static void main(String[] args) {
        String str1 = "huhh  nskjd kj dsjkdkjassb  kjdkajsn  dnkjasbskb  kasbdkjbsajk  * - 'ds sjoi'";
        String str2 = "hello world!";

        System.out.println(str1.substring(0,20));
        //如果大于20再截取
        System.out.println(str2.length()>20?str2.substring(0,20):str2);
    }
}
