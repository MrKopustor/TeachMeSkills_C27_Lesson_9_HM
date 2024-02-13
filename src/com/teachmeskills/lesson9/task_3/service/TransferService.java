package com.teachmeskills.lesson9.task_3.service;


import com.teachmeskills.lesson9.task_3.constant.ICurrencyCodeConst;
import com.teachmeskills.lesson9.task_3.constant.ICurrencyExchangeConst;
import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;

public class TransferService {
    public static void transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double amount) {

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

                double newCardToBalance = cardTo.getCurrentBalance() + amount;
                cardTo.setCurrentBalance(newCardToBalance);
            }
        }
    }
}
