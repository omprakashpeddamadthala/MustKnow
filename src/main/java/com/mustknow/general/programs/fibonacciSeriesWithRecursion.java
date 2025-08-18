package com.mustknow.general.programs;

public class fibonacciSeriesWithRecursion {

    public static void main(String[] args) {
        int n = 5; // print series up to 5th term
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

