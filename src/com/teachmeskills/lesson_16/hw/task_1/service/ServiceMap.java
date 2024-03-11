package com.teachmeskills.lesson_16.hw.task_1.service;

import com.teachmeskills.lesson_16.hw.task_1.model.product.Product;

import java.util.*;

import static com.teachmeskills.lesson_16.hw.task_1.factory.FactoryClient.factoryClient;
import static com.teachmeskills.lesson_16.hw.task_1.factory.FactoryProduct.factoryProduct;

public class ServiceMap {
    public static void serviceMap() {

        Map<String, List<Product>> map = new HashMap<>();

        for (int i = 0; i < factoryClient().size(); i++) {
            map.put(factoryClient().get(i).getPassport(), factoryProduct().get(i));
        }

        for (Map.Entry<String, List<Product>> p : map.entrySet()) {
            System.out.println("Key -> " + p.getKey() + " Value -> " + p.getValue());
        }

        System.out.println("------------------");

        map.forEach((k, v) -> System.out.println("Key -> " + k + ", Value -> " + v));

        System.out.println("------------------");

        Iterator<Map.Entry<String, List<Product>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Product>> entry = iterator.next();
            System.out.println("Key -> " + entry.getKey() + " Value -> " + entry.getValue());
        }

        System.out.println("------------------");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println("------------------");

        Collection<List<Product>> values = map.values();
        System.out.println(values);
    }
}
