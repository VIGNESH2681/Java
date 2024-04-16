package com.vignesh.Conditions_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q : print numbers from 1 to 5
        for(int num = 1; num <= 5; num += 1){
            System.out.println(num);
        }

        //print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int i = 1 ; i <= n; i++){
//            System.out.println("Hello World");
//        }

        //while loop
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num += 1;
        }

        //do while loop
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n <= 5);

        int a = 1;
        do {
            System.out.println("Hello World");
        } while (a != 1);
    }
}
