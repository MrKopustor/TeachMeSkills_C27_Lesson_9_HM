package com.teachmeskills.lesson9.task_2.run;

import static com.teachmeskills.lesson9.task_2.Utils.matrixOutput;
import static com.teachmeskills.lesson9.task_2.fabric.MatrixOperations.matrixMultiplication;

public class Runner {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        matrixOutput(array1);
        matrixOutput(array2);
        matrixOutput(matrixMultiplication(array1, array2));
    }
}
