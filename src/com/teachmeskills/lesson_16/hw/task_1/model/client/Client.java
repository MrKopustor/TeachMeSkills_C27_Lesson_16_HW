package com.teachmeskills.lesson_16.hw.task_1.model.client;

public class Client {
    private int age;
    private String name;
    private String passport;
    private String dateRegistration;

    public Client(String name, int age, String passport, String dateRegistration) {
        this.age = age;
        this.name = name;
        this.passport = passport;
        this.dateRegistration = dateRegistration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", dateRegistration='" + dateRegistration + '\'' +
                '}';
    }
}
