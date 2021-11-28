package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyTest {

    private static int x = 2;
    private static int y = 3;
    static int mySum = MyMethod.printAsumB(x,y);

    public static void main(String[] args) {
        if(mySum==5){
            System.out.println("wszyskto się zgadza");
        }else{
            System.out.println("błąd");
        }
    }
}
