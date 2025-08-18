package com.mustknow.real.abstarctqa;

public class AbstractQueations {

    public static void main(String[] args) {
        //  A a1 = new A(); compile time error
        A a2 = new B(); //print A B
       // B b1 =new A() ;; compile time error
        B b2 = new B();; //print A B

    }

}
