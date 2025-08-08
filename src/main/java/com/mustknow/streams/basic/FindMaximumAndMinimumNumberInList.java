package com.mustknow.streams.basic;

import java.util.Arrays;
import java.util.List;

public class FindMaximumAndMinimumNumberInList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 8, 2, 7, 1, 3, 5, 11, 92, 12, 45, 12, 1, 23, 4, 5 );

        int max = numbers.stream().mapToInt( num -> num.intValue() ).max().getAsInt();
        System.out.println( max );

        int min = numbers.stream().mapToInt( num -> num.intValue() ).min().getAsInt();
        System.out.println( min );
    }
}
