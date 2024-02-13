package com.teachmeskills.lesson9.task_3.domain.card;

public abstract sealed class BaseCard permits BelCard, MasterCard, VisaCard {

    private static int counter;

    protected int cvc;
    protected int currencyCode;
    protected long id;
    protected double currentBalance;
    protected double commissionPercentage;
    protected long cardNumber;

    public BaseCard(long cardNumber,
                    long id,
                    int cvc,
                    double currentBalance,
                    int currencyCode) {
        this.cvc = cvc;
        this.currencyCode = currencyCode;
        this.id = id;
        this.currentBalance = currentBalance;
        this.cardNumber = cardNumber;
    }

    public BaseCard() {
        this.id = ++counter;
    }

    abstract public double getTransferLimit();

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        BaseCard.counter = counter;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
