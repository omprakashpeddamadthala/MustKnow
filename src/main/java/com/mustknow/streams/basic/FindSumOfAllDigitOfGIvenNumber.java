package com.mustknow.streams.basic;

public class FindSumOfAllDigitOfGIvenNumber {

    public static void main(String[] args) {

        Integer number = 12345;
        int sum =String.valueOf( number ).chars().map( Character ::getNumericValue ).sum();
        System.out.println(sum);
    }
}
