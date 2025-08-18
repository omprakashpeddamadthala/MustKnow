package com.mustknow.general.programs;

public class checkPositiveNegative {
    public static void main(String[] args) {
        int number = -50;
        System.out.println(checkPositiveNegative(number));
    }

    static String checkPositiveNegative(Integer number){
        return (number >= 0) ? "positive number" :  "negative number ";
    }


}
