package com.vignesh.First_Java_Program;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    static boolean isPrime(int n){
        if(n<=1){
            System.out.println("Neither prime nor composite");
            return false;
        }
        int c=2;
        while(c * c <= n){
            if(n%c==0){
                System.out.println("Not Prime");
                return false;
            }
            c = c + 1;
            // c++;
        }
        System.out.println("Prime");
        return c*c>n;
    }
}
