package com.teachmeskills.lesson9.task_3.card;

public final class MasterCard extends BaseCard {

    public MasterCard(String cardNumber, double amount, int cvc, int id) {
        super(cardNumber, amount, cvc, id);
    }

    @Override
    public void doTransfer(long idCardFrom, long idCardTo, double amout) {

    }

    @Override
    public void checkCardBalanceBeforeTransfer() {

    }
}
