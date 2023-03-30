package com.bridgelabz;

import java.util.Scanner;

public class OperatorProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three number :");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int operator1=a+b*c;
        System.out.println(operator1);
        int operator2=c+a/b;
        System.out.println(operator2);
        int operator3=a%b+c;
        System.out.println(operator3);
        int operator4=a*b+c;
        System.out.println(operator4);
    }
}
