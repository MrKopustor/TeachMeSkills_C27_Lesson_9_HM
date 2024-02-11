package com.teachmeskills.lesson9.task_3.card;

public abstract sealed class BaseCard permits BelCard, MasterCard, VisaCard {

    public String cardNumber;
    public double amount;
    public int cvc;
    public int id;

    public BaseCard(String cardNumber, double amount, int cvc, int id) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.cvc = cvc;
        this.id = id;
    }

    public abstract void doTransfer(long idCardFrom, long idCardTo, double amount);

    public abstract void checkCardBalanceBeforeTransfer();
}
