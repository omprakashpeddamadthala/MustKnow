package com.mustknow.streams.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumberFromListOfIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 8, 2, 7, 1, 3, 5, 11, 92, 12, 45, 12, 1, 23, 4, 5 );

        int secondLargestNumber =numbers.stream()
                .distinct()
                .sorted( Comparator.reverseOrder() )
                .skip( 1 ).findFirst().get();

        System.out.println(secondLargestNumber);
    }
}
