package com.scaler.designpatterns.adapter.thirdparty.icicibank;

//1.4 This is suppose the ICICI Bank class with all Methods of ICICI bank.
public class ICICIBank {
//Note: Here we have used different name for sending money, also the parameters are shuffled,
//    because different banks can have different way of implementing the same methods
//    Similarly we have done in Yes bank class

    public void makePayment(String from, String to, int amount){
        System.out.println("transfering money via ICICI bank");
    }
}
