package com.hnust.hua.algorithm;

import java.util.Scanner;

/**  根据输入的日期打印是当年的第几天
 * Created by Administrator on 2019/4/8.
 */
public class Test19 {
    public static void main(String[] args){
        int daysCount = 0;
        //列出一年中每个月的天数，然后判断输入的是几月，是不是闰年
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner read = new Scanner(System.in);
        System.out.print("请输入年月日，格式如：1997/01/01:");
        String dateStr = read.next();
        String[] dateInt = dateStr.split("/");
        int year = Integer.parseInt(dateInt[0]);
        int month = Integer.parseInt(dateInt[1]);
        int day = Integer.parseInt(dateInt[2]);
        for (int i =0;i<month-1;i++){
            daysCount += days[i];
        }
        daysCount +=day;
        if ((year%4==0 && year%100==0) || year%400==0 && month>2){
            daysCount++;
        }
        System.out.println(month+"月"+day+"是"+year+"年的第"+daysCount+"天");
    }
}
