package com.mustknow.general.programs;

public class sumNatural {
    public static void main(String[] args) {
        System.out.println(sumNatural(10));
    }

    public static Integer sumNatural(Integer number){
        return (number *(number+1))/2;
    }
}
