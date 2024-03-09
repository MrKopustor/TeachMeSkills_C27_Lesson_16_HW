package com.teachmeskills.lesson_16.hw.task_1.factory;

import com.teachmeskills.lesson_16.hw.task_1.client.Client;

import java.util.ArrayList;
import java.util.List;

public class FactoryClient {
    public static List<Client> factoryClient() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Oleg", 29, "BM9892987", "12.03.2024"));
        clients.add(new Client("Alex", 12, "MM9393922", "12.03.2024"));
        clients.add(new Client("Artem", 18, "AS9991928", "12.03.2024"));

        return clients;
    }
}
