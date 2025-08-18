package com.mustknow.general.programs;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }

    private static int factorialOfNumber(int number) {
        int fact =1;
        for (int i = 1; i <=number ; i++) {
            fact =fact* i;
        }
        return fact;


    }
}
