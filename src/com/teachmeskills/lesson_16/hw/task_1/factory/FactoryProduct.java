package com.teachmeskills.lesson_16.hw.task_1.factory;

import com.teachmeskills.lesson_16.hw.task_1.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class FactoryProduct {
    public static List<List<Product>> factoryProduct() {
        List<Product> l1 = new ArrayList<>();
        l1.add(new Product(60.0, "Zenit ET"));

        List<Product> l2 = new ArrayList<>();
        l2.add(new Product(12356.75, "new PC"));

        List<Product> l3 = new ArrayList<>();
        l3.add(new Product(8.5, "Chicken"));
        l3.add(new Product(2.67, "Mars"));
        l3.add(new Product(2.3, "Milk"));

        List<List<Product>> listProduct = new ArrayList<>();
        listProduct.add(l1);
        listProduct.add(l2);
        listProduct.add(l3);

        return listProduct;
    }
}
