package com.mustknow.general.programs;

import java.util.ArrayList;
import java.util.List;

public class oddNumbers {
    public static void main(String[] args) {
        System.out.println(printOddNumberFrom1to100());
    }

    private static List<Integer> printOddNumberFrom1to100() {
        List<Integer> numbers = new ArrayList<>();
        for(int i =0;i<=100 ;i++){
            if(i%2!=0){
                numbers.add( i );
            }
        }
        return numbers;
    }
}
