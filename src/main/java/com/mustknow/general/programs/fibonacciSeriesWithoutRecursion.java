package com.mustknow.general.programs;

import java.util.ArrayList;
import java.util.List;

public class fibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {

            System.out.print(fibonacci(5));

    }

    public static List<Integer> fibonacci(int number){
        List<Integer> list = new ArrayList<>();

        int a =0;
        int b =1 ;

        for (int i = 0; i <=number ; i++) {
            list.add( a );
            int sum =a+b;
            a =b;
            b =sum;
        }

        return list;
    }
}
