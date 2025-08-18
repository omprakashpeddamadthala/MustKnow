package com.mustknow.general.programs;

import java.util.ArrayList;
import java.util.List;

public class evenNumbers {

    public static void main(String[] args) {

        System.out.println(printEvenNumbersFrom1to100());
    }

    private static List<Integer> printEvenNumbersFrom1to100() {
        List<Integer> numbers =new ArrayList<>();
        for(int i=0 ;i<=100;i++){
            if(i%2==0){
                numbers.add( i );
            }
        }
        return numbers;
    }
}
