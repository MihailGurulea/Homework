package com.books;

public abstract class Book {
    String title;
    double price;

    public Book(String title) {
        this.title = title;
        this.price = 0;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
