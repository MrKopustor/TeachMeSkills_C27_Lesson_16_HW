package com.teachmeskills.lesson_16.hw.task_1.launcher;

public class Product {
    private double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
