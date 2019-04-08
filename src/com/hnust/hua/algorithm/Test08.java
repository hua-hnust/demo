package com.hnust.hua.algorithm;

/** 题目：八皇后问题
 * Created by Administrator on 2019/3/13.
 */
public class Test08 {

    public static void main(String[] args) {
        Empress a = new Empress();
        a.find(0);
        System.out.println("八皇后问题共有：" + a.num + "种可能");
    }
}

class Empress {
    public int num = 0;     //存储方案结果
    private int[][] arry = new int[8][8];    //棋盘，放皇后

    public boolean rule(int arry[][], int k, int j) {    //判断节点是否合适
        for (int i = 0; i < 8; i++) {       //行列冲突
            if (arry[i][j] == 1)
                return false;
        }
        for (int i = k - 1, m = j - 1; i >= 0 && m >= 0; i--, m--) {    //左对角线
            if (arry[i][m] == 1)
                return false;
        }
        for (int i = k - 1, m = j + 1; i >= 0 && m <= 7; i--, m++) {    //右对角线
            if (arry[i][m] == 1)
                return false;
        }
        return true;
    }


    public void find(int i) {    //寻找皇后节点
        if (i > 7) {    //八皇后解
            num++;
            print();
            return;
        }
        for (int m = 0; m < 8; m++) {      //深度优先,递归算法
            if (rule(arry, i, m)) {
                arry[i][m] = 1;
                find(i + 1);
                arry[i][m] = 0;
            }
        }
    }

    public void print() {      //打印方法结果
        System.out.print("方案" + num + ":");
        for (int i = 0; i < 8; i++) {
            for (int m = 0; m < 8; m++) {
                if (arry[i][m] == 1) {
                    System.out.print(" 皇后" + (i + 1) + "在第" + i + "行，第" + m + "列\t");

                }
            }
        }
        System.out.println();
    }
}

