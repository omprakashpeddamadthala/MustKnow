package com.mustknow.real.overload;

public class OverloadDemo {

    static void getNumber(Integer a, Integer b)
    {
        System.out.println("Integer,Integer");
    }

    static void getNumber(Long a, Long b)
    {
        System.out.println("Long,Long");
    }

    static void getNumber(long a, long b)
    {
        System.out.println("long,long");
    }

   static void getNumber(int  a, int b)
    {
        System.out.println("int,int");
    }

    static void getNumber(byte  a, byte b)
    {
        System.out.println("byte,byte");
    }

   static void getNumber(int... nums)
    {
        System.out.println("varargs");
    }

    //extact match int int
    // promotion on any primitive
    //wrapper big wrapper
    //varags

    public static void main(String... args) {
        getNumber(3, 5);
    }
}