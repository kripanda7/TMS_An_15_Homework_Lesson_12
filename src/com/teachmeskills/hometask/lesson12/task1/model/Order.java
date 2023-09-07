package com.teachmeskills.hometask.lesson12.task1.model;

public class Order {
    private long id;
    private double price;
    private String description;

    public Order(long id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
