package com.vignesh.First_Java_Program;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter temperature in celsius: ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
