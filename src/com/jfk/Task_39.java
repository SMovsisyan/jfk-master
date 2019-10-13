package com.jfk;


public class Task_39 {

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 40;
        double d = 80;
        if ( a < b && b < c  && c < d ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}