package com.itemsold;

public class ItemSold {
    private int invoiceNumber;
    private String discription;
    private double price;

    public ItemSold(int invoiceNumber, String discription, double price) {
        this.invoiceNumber = invoiceNumber;
        this.discription = discription;
        this.price = price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemSold{" +
                "invoiceNumber=" + invoiceNumber +
                ", discription='" + discription + '\'' +
                ", price=" + price +
                '}';
    }
}
