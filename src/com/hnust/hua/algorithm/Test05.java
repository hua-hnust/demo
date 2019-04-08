package com.hnust.hua.algorithm;

/** 题目：计算有序数组之中两个数之和等于某个值
 * Created by Administrator on 2019/3/11.
 */
public class Test05 {

    public static void main(String[] args) {
        int n= 30;
        int[] array = {1,3,7,9,13,14,16,17,21,24,27,29,35};
        search(n,array);
    }

    private static void search(int number, int[] array) {
        int midIndex = 0;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number / 2) {
                midIndex = i - 1;
                break;
            }
        }
        if (midIndex != -1) {
            int smallerIndex = midIndex; // 记录较小加数在数组中的下标
            int biggerIndex = midIndex + 1; // 记录较大加数在数组中的下标

            do {
                if (array[smallerIndex] + array[biggerIndex] > number) {
                    smallerIndex--;
                } else if (array[smallerIndex] + array[biggerIndex] < number) {
                    biggerIndex++;
                } else {
                    // 匹配成功
                    System.out.println("arry[" + smallerIndex + "] 和 arry[" + biggerIndex
                            + "] 匹配，即  " + array[smallerIndex] + " + " + array[biggerIndex]
                            + " = " + number);
                    result = true;

                    //可能还会有，取更大和更小的数做计算
                    smallerIndex--;
                    biggerIndex++;
                }
            } while ((smallerIndex >= 0) && (biggerIndex < array.length - 1));
        }
        if (!result) {
            System.out.println("无匹配");
        }
    }
}
