package com.phonecall;

public abstract class PhoneCall {
    String phoneNumber;
    double priceOfTheCall;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.priceOfTheCall = 0.0;
    }

    public void setPriceOfTheCall(double priceOfTheCall) {
        this.priceOfTheCall = priceOfTheCall;
    }

    abstract String getPhoneNumber();

    abstract double getPriceOfTheCall();

    abstract void getInformationAboutTheCall();
}
