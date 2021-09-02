package com.company;

import java.sql.SQLOutput;

public class Main {

    private static final int x = 10;

    public static void main(String[] args) {

        myMethod(x);
    }

    static void myMethod(int n) {
        int num1 = 0;
        int counter = 0;
        int num2 = 1;

        while (counter < n) {
            System.out.printf(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
