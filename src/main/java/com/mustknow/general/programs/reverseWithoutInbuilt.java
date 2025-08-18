package com.mustknow.general.programs;

public class reverseWithoutInbuilt {

    public static void main(String[] args) {
        String input = "Om Prakash";
        System.out.println(reverseWithoutInbuilt(input));
    }

    public static String reverseWithoutInbuilt(String input){
        char ch[] = input.toCharArray();
        String rev ="";
        for(int i=ch.length-1;i>=0;i--){
            rev =rev + ch[i];
        }
        return rev;
    }
}
