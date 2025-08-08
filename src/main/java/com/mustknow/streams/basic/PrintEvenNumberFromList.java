package com.mustknow.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumberFromList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 8, 2, 7, 1, 3, 5, 11, 92, 12, 45, 12, 1, 23, 4, 5 );

       List<Integer> evenNubers = numbers.stream().filter( integer -> integer%2==0 )
                .collect( Collectors.toList() );
        System.out.println(evenNubers);

    }
}
