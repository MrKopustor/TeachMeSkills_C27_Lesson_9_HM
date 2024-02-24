package com.teachmeskills.lesson9.task_3.util;

import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;

import java.util.Scanner;

import static com.teachmeskills.lesson9.task_3.fabric.ClientFabric.createClient;
import static com.teachmeskills.lesson9.task_3.service.TransferService.searchCard;
import static com.teachmeskills.lesson9.task_3.service.TransferService.transferFromCardToCard;

/**
 * Class DataHandling
 * There is inputData method that accepts values from the console
 * Calls method transferFromCardToCard
 */
public class DataHandling {
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of the card from which you wil perform the transaction");
        int idCardFrom = scanner.nextInt();
        BaseCard CardFrom = searchCard(createClient().getCads(), idCardFrom);

        System.out.println("Enter the id of the card you will be sending funds");
        int idCardTo = scanner.nextInt();
        BaseCard CardTo = searchCard(createClient().getCads(), idCardTo);

        System.out.println("Enter the amount of the transfer");
        double transferAmount = scanner.nextDouble();

        transferFromCardToCard(CardFrom, CardTo, transferAmount);
    }
}
