package com.teachmeskills.lesson9.task_3.fabric;

import com.teachmeskills.lesson9.task_3.client.Client;

public class ClientFabric {

    public static void CreateClient() {

        Client client1 = new Client("Ron", "Fleming", "МР1129338",
                "04.07.1989", "address 1 ", CardFabric.createCards());
        Client client2 = new Client("Anna", "Roust", "BM7678383",
                "23.01.2004", "address 4 ", CardFabric.createCards());
        Client client3 = new Client("Alex", "Bulof", "DP0066600",
                "19.10.1976", "address 3 ", CardFabric.createCards());
    }

}
