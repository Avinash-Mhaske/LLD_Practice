package com.scaler.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedUncheckedEx {
    public static void main(String[] args) throws IOException {//main method should not have throws (not a good practice)
        System.out.println("Hello");
        File file=new File("abc.txt");
        FileReader reader=new FileReader(file);//Java warns here that FileReader may throw exception due to various reasons.
        System.out.println("Hi");
        reader.read();
        System.out.println("bye");
    }
}
