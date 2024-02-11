package com.teachmeskills.lesson9.task_2.util;

import java.util.Arrays;

public class Utils {

    public static void matrixOutput(int[][] m){
        System.out.println("Matrix: ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println();
    }
}
