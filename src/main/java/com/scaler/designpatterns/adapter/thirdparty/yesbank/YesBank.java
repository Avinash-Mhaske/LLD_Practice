package com.scaler.designpatterns.adapter.thirdparty.yesbank;

//1.3 This is suppose the yes Bank class with all Methods of Yes bank
public class YesBank {
//Note: Here we have used different name for sending money, also the parameters are shuffled,
//    because different banks can have different way of implementing the same methods
//    Similarly we have done in ICICI bank class

    public void transferMoney(int amount, String from, String to){
        System.out.println("transfering money via yes bank");
    }
}
