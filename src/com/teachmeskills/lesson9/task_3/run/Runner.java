package com.teachmeskills.lesson9.task_3.run;

import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;
import com.teachmeskills.lesson9.task_3.domain.card.BelCard;
import com.teachmeskills.lesson9.task_3.domain.card.VisaCard;

import java.util.Scanner;

import static com.teachmeskills.lesson9.task_3.service.TransferService.transferFromCardToCard;

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

        transferFromCardToCard(idCardFrom,idCardWhere,transferAmount);
        scanner.close();
    }
}
