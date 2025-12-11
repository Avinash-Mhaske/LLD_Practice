package com.scaler.zaLLD2designPattern.SOLID;

public class Client {
    public static void main(String[] args) {
        Bird b =new Owl();
        ((Owl) b).fly();
    }
}
