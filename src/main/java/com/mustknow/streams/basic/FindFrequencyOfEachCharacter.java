package com.mustknow.streams.basic;


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FindFrequencyOfEachCharacter {

    public static void main(String[] args) {
        String input ="Hello World";

        Map<Character, Long> countMap =input.chars()
                .mapToObj( ch->(char) ch )
                .collect( Collectors.groupingBy( Function.identity(),Collectors.counting()) );

        System.out.println(countMap);


    }
}
