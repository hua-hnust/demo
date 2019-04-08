package com.hnust.hua.algorithm;

/**   数字反转
 * Created by Administrator on 2019/4/4.
 */
public class Test15 {
    public static void main(String[] args) {
        System.out.println(Test15.reverse(123));
        System.out.println(Test15.reverse(-321));
        System.out.println(Test15.reverse(360));
    }

    private static int reverse(int x) {
        long a = 0;
        int b =0;
        if(x>=0){
            b=(x+"").length();//正数
        }
        else{
            b=(x+"").length()-1;//负数多了一个符号位
        }
        while (x!=0){
            for(int i=0;i<b;i++){
                int a1 = x%10;//当前最后一位数字
                x=(x-a1)/10;//把最后一位数字剔除掉的新数字
                a += (int) (a1*Math.pow(10,b-i-1));
            }
        }
        if((a>Math.pow(2,31)-1)||(a<(-1)*Math.pow(2,31))){
            return 0;
        }
        return (int) a;
    }
}
