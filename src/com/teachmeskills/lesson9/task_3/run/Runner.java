package com.teachmeskills.lesson9.task_3.run;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of the card from which you wil perform the transaction");
        int idCardFrom = scanner.nextInt();
        System.out.println("Enter the id of the card you will be sending funds");
        int idCardWhere = scanner.nextInt();
        System.out.println("Enter the amount of the transfer");
        double transferAmount = scanner.nextDouble();


        System.out.println(idCardFrom);
        System.out.println(idCardWhere);
        System.out.println(transferAmount);


        scanner.close();
    }
}
