package com.phonecall;

import java.util.ArrayList;
import java.util.List;

public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("0 (222) 333 4444");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("0 (333) 444 5555", 10.5);

        incomingPhoneCall.getInformationAboutTheCall();
        outgoingPhoneCall.getInformationAboutTheCall();

        System.out.println();

        List<PhoneCall> list = new ArrayList<>();
        list.add(incomingPhoneCall);
        list.add(outgoingPhoneCall);

        for(PhoneCall p : list){
            p.getInformationAboutTheCall();
        }
    }
}
