package com.teachmeskills.lesson9.task_3.domain.client;

import com.teachmeskills.lesson9.task_3.domain.address.ClientAddress;
import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;

/**
 * Class Client
 * describes class
 */
public class Client {

    private String name;
    private String surname;
    private String numberPassport;
    private String dateBirth;
    private ClientAddress address;
    private BaseCard[] cards;

    public Client(String name, String surname, String numberPassport, String dateBirth, ClientAddress address, BaseCard[] cards) {
        this.name = name;
        this.surname = surname;
        this.numberPassport = numberPassport;
        this.dateBirth = dateBirth;
        this.address = address;
        this.cards = cards;
    }

    public void showInformationClient(){
        System.out.println(
                getName() + " " + getSurname() + "\n" + "Cards in stock: " + showCardLength()
        );
    }

    public BaseCard[] getCards() {
        return cards;
    }
    public int showCardLength(){
        return getCards().length;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public ClientAddress getAddress() {
        return address;
    }

    public void setAddress(ClientAddress address) {
        this.address = address;
    }

    public BaseCard[] getCads() {
        return cards;
    }

    public void setCads(BaseCard[] cads) {
        this.cards = cards;
    }
}
