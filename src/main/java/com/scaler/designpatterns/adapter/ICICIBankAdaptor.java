package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.icicibank.ICICIBank;
import com.scaler.designpatterns.adapter.thirdparty.yesbank.YesBank;

//1.5 This is a adaptor/helper class for ICICI bank which will help us use the ICICI bank methods.
public class ICICIBankAdaptor implements BankAPi{
    private ICICIBank iciciBank=new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
