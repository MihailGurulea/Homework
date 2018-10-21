package com.books;

import java.util.ArrayList;
import java.util.List;

public class BookArray {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Fiction Book 1!");
        Fiction fiction2 = new Fiction("Fiction Book 2!");
        Fiction fiction3 = new Fiction("Fiction Book 3!");
        Fiction fiction4 = new Fiction("Fiction Book 4!");
        Fiction fiction5 = new Fiction("Fiction Book 5!");

        NonFiction nonFiction = new NonFiction("Non Fiction Book 1!");
        NonFiction nonFiction2 = new NonFiction("Non Fiction Book 2!");
        NonFiction nonFiction3 = new NonFiction("Non Fiction Book 3!");
        NonFiction nonFiction4 = new NonFiction("Non Fiction Book 4!");
        NonFiction nonFiction5 = new NonFiction("Non Fiction Book 5!");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(fiction);
        listOfBooks.add(fiction2);
        listOfBooks.add(fiction3);
        listOfBooks.add(fiction4);
        listOfBooks.add(fiction5);
        listOfBooks.add(nonFiction);
        listOfBooks.add(nonFiction2);
        listOfBooks.add(nonFiction3);
        listOfBooks.add(nonFiction4);
        listOfBooks.add(nonFiction5);

        for (Book b : listOfBooks){
            System.out.println(b.getTitle() + ", " + b.getPrice());
        }



    }
}
