package com.mustknow.general.programs;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
