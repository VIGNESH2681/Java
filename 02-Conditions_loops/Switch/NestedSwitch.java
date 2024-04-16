package com.vignesh.Conditions_loops.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String department = in.next();

        switch(EmpId){
            case 1:
                System.out.println("Vignesh");
                break;
            case 2:
                System.out.println("Dinesh");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }

        // better way to write
        switch (EmpId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
