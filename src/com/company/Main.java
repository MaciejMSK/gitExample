package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        myMethod(x);
    }

    static void myMethod(int n) {
        int num1 = 0;
        int counter = 0;
        int num2 = 1;

        while (counter > n) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
