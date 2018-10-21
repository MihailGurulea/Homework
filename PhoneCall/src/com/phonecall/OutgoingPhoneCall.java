package com.phonecall;

public class OutgoingPhoneCall extends PhoneCall {
    private double timeOfTheCall;

    public OutgoingPhoneCall(String phoneNumber, double timeOfTheCall) {
        super(phoneNumber);
        this.timeOfTheCall = timeOfTheCall;
        priceOfTheCall = 0.04;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getPriceOfTheCall(){
        return priceOfTheCall;
    }

    public void getInformationAboutTheCall(){
        System.out.println("Phone Number: " + getPhoneNumber() + "\nRate per minute: "
                + getPriceOfTheCall() +  "\nNuber of minutes: " + this.timeOfTheCall +
                "\nPrice of the call: " + (timeOfTheCall * getPriceOfTheCall()));
    }
}
