package com.scaler.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello");
//        File file=new File("abc.txt");
//        FileReader reader=new FileReader(file);//.FileNotFoundException occurs here, hence after this noting will execute.
//        System.out.println("Hi");
//        reader.read();
//        System.out.println("bye");

        //Above code was a basic understanding of exception

        readFromFile("abc.txt");
    }

    public static void readFromFile(String fileName) throws  IOException{
        File file=null;
        FileReader reader=null;
        try {
            System.out.println("Hello");
            file = new File("abc.txt");
            reader = new FileReader(file);
            reader.read(); //here exception occurs
            System.out.println("Hi");
        } catch (FileNotFoundException e) {
            System.out.println("Exception has occured, we are on it");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block");
//            reader.close();
        }
        }

}
