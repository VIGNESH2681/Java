package com.vignesh.Conditions_loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
//        int max = a;

//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        //another method
//        int max = 0;
//        if(a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }

        // another method using build in functions
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
