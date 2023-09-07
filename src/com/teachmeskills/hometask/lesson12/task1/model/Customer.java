package com.teachmeskills.hometask.lesson12.task1.model;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private long id;
    private Date registrationDate;
    private String name;
    private int age;
    private ArrayList<Order> orders;

    public Customer(long id, Date registrationDate, String name, int age, ArrayList<Order> orders) {
        this.id = id;
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", registrationDate=" + registrationDate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}
