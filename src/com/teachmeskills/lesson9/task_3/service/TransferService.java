package com.teachmeskills.lesson9.task_3.service;

import com.teachmeskills.lesson9.task_3.constant.ICurrencyCodeConst;
import com.teachmeskills.lesson9.task_3.constant.ICurrencyExchangeConst;
import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;
import static com.teachmeskills.lesson9.task_3.fabric.ClientFabric.createClient;

/**
 * Class TransferService
 * Contains 2 methods
 * Method searchCard, checks if such a card is available
 * Method transferFromCardToCard
 * performs Card-to-Card Transfer and displays information about cards
 */
public class TransferService {

    public static BaseCard searchCard(BaseCard[] arr, int idCard) {
        BaseCard foundCard = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == idCard) {
                foundCard = arr[i];
                break;
            }
        }
        if (foundCard == null) {
            System.out.println("Card with ID no. " + idCard + ", not found!");
        }
        return foundCard;
    }

    public static void transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double amount) {

        createClient().showInformationClient();
        System.out.println("Current cards information: ");
        cardFrom.showBaseCardInfo();
        cardTo.showBaseCardInfo();

        if (amount > cardFrom.getTransferLimit()) {
            System.out.println("You're over the limit.");
        } else {
            double newCardFromBalance = cardFrom.getCurrentBalance() - amount - (amount * cardFrom.getCommissionPercentage());
            cardFrom.setCurrentBalance(newCardFromBalance);

            if (cardFrom.getCurrencyCode() == ICurrencyCodeConst.BYN_CURRENCY_CODE
                    && !(cardTo.getCurrencyCode() == ICurrencyCodeConst.BYN_CURRENCY_CODE)) {
                amount *= ICurrencyExchangeConst.BYN_TO_USD;
            } else if (cardFrom.getCurrencyCode() == ICurrencyCodeConst.USD_CURRENCY_CODE
                    && !(cardTo.getCurrencyCode() == ICurrencyCodeConst.USD_CURRENCY_CODE)) {
                amount *= ICurrencyExchangeConst.USD_TO_BYN;
            }

            double newCardToBalance = cardTo.getCurrentBalance() + amount;
            cardTo.setCurrentBalance(newCardToBalance);

            System.out.println("Information about current cards after transfer:");
            cardFrom.showBaseCardInfo();
            cardTo.showBaseCardInfo();
        }
    }
}
