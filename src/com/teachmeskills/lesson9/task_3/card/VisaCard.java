package com.teachmeskills.lesson9.task_3.card;

public final class VisaCard extends BaseCard {

    public VisaCard(String cardNumber, double amount, int cvc, int id) {
        super(cardNumber, amount, cvc, id);
    }

    @Override
    public void doTransfer(long idCardFrom, long idCardTo, double amount) {

    }

    @Override
    public void checkCardBalanceBeforeTransfer() {

    }
}
