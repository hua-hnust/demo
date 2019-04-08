package com.hnust.hua.algorithm;

/** 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *  小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *  这是一个菲波拉契数列问题
 * Created by Administrator on 2019/3/11.
 */
public class Test01 {
    // 月份 若大于46（考虑类型的溢出）
    static Integer month = 42; // 注意：month > 0

    public static void main(String[] args) {

        Integer pair = f(month);
        System.out.println("答：经过" + month + "个月后，兔子的总数为" + pair + "对。");

        Integer p2 = f2();
        System.out.println("答：经过" + month + "个月后，兔子的总数为" + p2 + "对。");

        Integer p3 = f3();
        System.out.println("答：经过" + month + "个月后，兔子的总数为" + p3 + "对。");
    }

    //递归算法 （很耗时）
    private static Integer f(Integer month){
        if (month ==1 || month == 2) {
            return 1;
        }else {
            return f(month - 1) + f(month - 2);
        }
    }

    //动态规划算法
    private static Integer f2(){
        int f1 = 1, f2 = 1, f;

        int[] data = new int[month+1];

        for (int i = 1; i <= month; i++) {
            if (i==1){
                data[1] = 1;
            }else if (i ==2){
                data[2] = 1;
            }
            else {
                data[i] = data[i-1] + data[i-2];
            }
        }
        return data[month];
    }

    //动态规划算法
    private static Integer f3(){
        int f1=1,f2=1,f;
        for(int i=3;i<= month;i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
        }
        return f2;
    }
}
