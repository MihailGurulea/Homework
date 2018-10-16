package com.itemsold;

public class Demo {
    public static void main(String[] args) {
        ItemSold itemSold = new ItemSold(1,"Cage for Elephants", 2000);
        PetSold elephant = new PetSold(2,"Elephant", 400000, true,false,true);

        System.out.println(itemSold.toString());
        System.out.println(elephant.toString());

    }
}
