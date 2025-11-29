package com.scaler.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        func(sc);
    }

    public static void func(Scanner scanner) {
        try {
            int a = scanner.nextInt();//try to pass non integer for mismatch exception
            int b = scanner.nextInt();// pass this as 0 for Arithmetic exception
            int c = a / b;
            System.out.println(c);
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");//for this to occur change the sc to null in func method call in main method.
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException");
        } catch (InputMismatchException exception) {
            System.out.println("InputMismatchException");
        } catch (Exception exception){
            System.out.println("Exception");
        }
    }
}
