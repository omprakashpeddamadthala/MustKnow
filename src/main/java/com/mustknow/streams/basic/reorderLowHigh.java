package com.mustknow.streams.basic;

import java.util.*;


public class reorderLowHigh {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 3, 6, 8, 9, 12);
        List<Integer> reordered = reorderLowHigh(numbers);
        System.out.println(reordered);
    }

    static List<Integer> reorderLowHigh(List<Integer> input) {
        List<Integer> sortedAscOrder = new ArrayList<>( input );
        Collections.sort( sortedAscOrder );
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = sortedAscOrder.size() - 1;

        while (left <= right) {
            if (left == right) {
                result.add( sortedAscOrder.get( left ) );
            } else {
                result.add( sortedAscOrder.get( left ) );
                result.add( sortedAscOrder.get( right ) );
            }

            left++;
            right--;
        }
        return result;
    }
}
