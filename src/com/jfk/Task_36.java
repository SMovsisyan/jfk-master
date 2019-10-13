package com.jfk;


public class Task_36  {

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        double d = 40;
        if ( a == c + b + d || b == a + c + d || c == a + b + d || d == a + b + c ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}