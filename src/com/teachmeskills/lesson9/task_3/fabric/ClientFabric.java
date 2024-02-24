package com.teachmeskills.lesson9.task_3.fabric;

import com.teachmeskills.lesson9.task_3.domain.address.ClientAddress;
import com.teachmeskills.lesson9.task_3.domain.client.Client;

/**
 * Class ClientFabric
 * creates a client
 */
public class ClientFabric {

    public static Client createClient() {

        ClientAddress addressAnna = new ClientAddress(
                "Poland",
                "Warsaw",
                "Zbożowa ",
                34,
                4179);

        Client client1 = new Client(
                "Anna",
                "Roust",
                "BM7678383",
                "23.01.2004",
                addressAnna,
                CardFabric.createCards());

        return client1;
    }
}
