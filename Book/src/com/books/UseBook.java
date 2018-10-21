package com.books;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Some Fiction Book Title");
        NonFiction nonFiction = new NonFiction("Some Non Fiction Book Title");

        System.out.println("Fiction book: ");
        System.out.println(fiction.getTitle());
        System.out.println(fiction.getPrice());

        System.out.println("Non Fiction book: ");
        System.out.println(nonFiction.getTitle());
        System.out.println(nonFiction.getPrice());
    }
}
