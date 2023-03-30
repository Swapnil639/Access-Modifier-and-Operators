package com.bridgelabz;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=scanner.nextInt();
        if (a==1){
            System.out.println("One");
        } else if (a==10) {
            System.out.println("Ten");
        } else if (a==100) {
            System.out.println("Hundred");
        } else if (a==1000) {
            System.out.println("Thousand");
        }else {
            System.out.println("Invalid number");
        }
    }
}
