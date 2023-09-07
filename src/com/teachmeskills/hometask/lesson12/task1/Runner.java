package com.teachmeskills.hometask.lesson12.task1;

import com.teachmeskills.hometask.lesson12.task1.model.Customer;
import com.teachmeskills.hometask.lesson12.task1.model.Order;

import java.util.*;

import static com.teachmeskills.hometask.lesson12.task1.constants.Constants.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Order> orders1 = new ArrayList<>();
        orders1.add(new Order(1, 300, "Description 1"));
        orders1.add(new Order(2, 245.80, "Description 2"));
        orders1.add(new Order(3, 863.45, "Description 3"));
        Customer customer1 = new Customer(1, new Date(), "Customer 1", 30, orders1);

        ArrayList<Order> orders2 = new ArrayList<>();
        orders2.add(new Order(4, 300, "Description 4"));
        orders2.add(new Order(5, 245.80, "Description 5"));
        orders2.add(new Order(6, 863.45, "Description 6"));
        Customer customer2 = new Customer(2, new Date(), "Customer 2", 30, orders2);

        ArrayList<Order> orders3 = new ArrayList<>();
        orders3.add(new Order(7, 300, "Description 7"));
        orders3.add(new Order(8, 245.80, "Description 8"));
        Customer customer3 = new Customer(3, new Date(), "Customer 3", 30, orders3);

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put(PASSPORT_NUMBER_CUSTOMER_1, customer1);
        customerMap.put(PASSPORT_NUMBER_CUSTOMER_2, customer2);
        customerMap.put(PASSPORT_NUMBER_CUSTOMER_3, customer3);

        System.out.println("Output with EntrySet");

        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Output with iterator");

        Iterator<Map.Entry<String, Customer>> iterator = customerMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Customer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Keys: " + customerMap.keySet());
        System.out.println("-------------------------------------------------------");
        System.out.println("Values: " + customerMap.values());
    }
}
