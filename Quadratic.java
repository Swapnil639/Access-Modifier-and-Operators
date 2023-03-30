package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three number :");
        double a=scanner.nextInt();
        double b=scanner.nextInt();
        double c=scanner.nextInt();

        double delta=(b*b)-(4*a*c);
        System.out.println(delta);

        double root1=(-b + Math.sqrt(delta))/(2*a);
        System.out.println(root1);
        double root2=(-b - Math.sqrt(delta))/(2*a);
        System.out.println(root2);
    }
}
