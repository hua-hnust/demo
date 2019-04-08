package com.hnust.hua.algorithm;

/**  矩阵转置
 * Created by Administrator on 2019/4/8.
 */
public class Test18 {
    public static void main(String[] args) {
        double[][] testMatrix = {{22,1,34,26},{11,5,32,6},{7,2,4,9}};
        double[][] matriC = Test18.transpose(testMatrix,3,4);

        System.out.println("转置前：");
        myPrint(testMatrix);

        System.out.println("转置后:");
        myPrint(matriC);
    }

    public static double[][] transpose(double[][] matrix,int line,int list){
        double[][] matrixC = new double[list][line];
        for (int i=0;i<line;i++){
            for (int j=0;j<list;j++){
                matrixC[j][i] = matrix[i][j];
            }
        }
        return matrixC;
    }

    public static void myPrint(double[][] temp){
        for (int i=0;i<temp.length;i++){
            for (int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
