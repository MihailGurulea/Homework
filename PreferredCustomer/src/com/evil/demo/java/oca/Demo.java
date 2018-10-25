package com.evil.demo.java.oca;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Mihail", "Alba Iulia Str. 97/1", "0687 88880");
        Customer customer = new Customer("Dinu Bechet", "Riscanova, hui znaet ce strada", "07911111", 12345, true);

        System.out.println(person.toString());
        System.out.println(customer.toString());

        PreferredCustomer preferredCustomer = new PreferredCustomer("Mihaita", "Buiucani", "123456", 3322,true,3500);

        System.out.println(preferredCustomer.toString());
        preferredCustomer.setAmountOfTheCustomersPurchases(1200);
        System.out.println(preferredCustomer.toString());



    }
}
