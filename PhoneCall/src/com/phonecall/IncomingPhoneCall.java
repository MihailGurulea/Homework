package com.phonecall;

public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phone){
        super(phone);
        setPriceOfTheCall(0.02);
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getPriceOfTheCall(){
        return priceOfTheCall;
    }

    public void getInformationAboutTheCall(){
        System.out.println("Phone Number: " + getPhoneNumber() + "\nRate: "
                + getPriceOfTheCall() +  "\nPrice of the call: " + getPriceOfTheCall() + "\n");
    }
}
