package com.teachmeskills.lesson9.task_3.card;

public final class BelCard extends BaseCard {

    public BelCard(String cardNumber, double amount, int cvc, int id) {
        super(cardNumber, amount, cvc, id);
    }

    @Override
    public void doTransfer(long idCardFrom, long idCardTo, double amount) {

    }

    @Override
    public void checkCardBalanceBeforeTransfer() {

    }
}
