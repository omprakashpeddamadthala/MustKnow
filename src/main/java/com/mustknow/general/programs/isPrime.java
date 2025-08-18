package com.mustknow.general.programs;

public class isPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(Integer number){
        if(number<=1) return false;
        for (int i = 2; i <= Math.sqrt( number ) ; i++) {
            if(number %i ==0) return false;
        }
        return true;
    }
}
