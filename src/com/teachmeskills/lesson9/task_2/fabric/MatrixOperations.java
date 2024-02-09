package com.teachmeskills.lesson9.task_2.fabric;

public class MatrixOperations {

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
}
