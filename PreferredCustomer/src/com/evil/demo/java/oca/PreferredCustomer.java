package com.evil.demo.java.oca;

public class PreferredCustomer extends Customer {
    private double amountOfTheCustomersPurchases;
    private int customersDiscountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingListAgreement, double amountOfTheCustomersPurchases) {
        super(name, address, phoneNumber, customerNumber, mailingListAgreement);
        this.amountOfTheCustomersPurchases = amountOfTheCustomersPurchases;
        setCustomersDiscountLevel(amountOfTheCustomersPurchases);
    }

    public double getAmountOfTheCustomersPurchases() {
        return amountOfTheCustomersPurchases;
    }

    public void setAmountOfTheCustomersPurchases(double amountOfTheCustomersPurchases) {
        this.amountOfTheCustomersPurchases = amountOfTheCustomersPurchases;
        setCustomersDiscountLevel(amountOfTheCustomersPurchases);
    }

    public int getCustomersDiscountLevel() {
        return customersDiscountLevel;
    }

    private void setCustomersDiscountLevel(double amountOfTheCustomersPurchases) {
        if (amountOfTheCustomersPurchases >= 500 && amountOfTheCustomersPurchases < 1000) {
            this.customersDiscountLevel = 5;
        } else if (amountOfTheCustomersPurchases >= 1000 && amountOfTheCustomersPurchases < 1500) {
            this.customersDiscountLevel = 6;
        } else if (amountOfTheCustomersPurchases >= 1500 && amountOfTheCustomersPurchases < 2000) {
            this.customersDiscountLevel = 7;
        } else if (amountOfTheCustomersPurchases >= 2000) {
            this.customersDiscountLevel = 10;
        }
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" + super.toString() + ", customerNumber=" + getCustomerNumber() +
                ", mailingListAgreement= " + isMailingListAgreement() +
                ", amountOfTheCustomersPurchases= " + amountOfTheCustomersPurchases +
                ", customersDiscountLevel= " + customersDiscountLevel + "% " +
                '}';
    }
}
