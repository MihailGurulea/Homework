package com.evil.demo.java.oca;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingListAgreement;

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingListAgreement) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingListAgreement = mailingListAgreement;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingListAgreement() {
        return mailingListAgreement;
    }

    public void setMailingListAgreement(boolean mailingListAgreement) {
        this.mailingListAgreement = mailingListAgreement;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerNumber=" + customerNumber +
                ", mailingListAgreement=" + mailingListAgreement +
                '}';
    }
}
