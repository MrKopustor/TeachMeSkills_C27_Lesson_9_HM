package com.teachmeskills.lesson9.task_2.operation;

public class MatrixOperation {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] matrixM = new int[a.length][b[0].length];
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[0].length; j++) {
                matrixM[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    matrixM[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return matrixM;
    }

    //TODO сделать метод на проверку матриц, можно их умножать или нет. Проверка if
//    public static void checkValid() {
//        if (a[0].length != b.length) {
//            System.out.println("Умножение матриц невозможно");
//            return;
//        }
//    }


}
