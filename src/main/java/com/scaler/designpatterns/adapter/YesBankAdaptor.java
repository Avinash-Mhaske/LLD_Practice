package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.yesbank.YesBank;
//1.5 This is a adaptor/helper class for Yes bank which will help us use the yesbank methods.
public class YesBankAdaptor implements BankAPi{
    private YesBank yesBank=new YesBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(amount, from, to);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
