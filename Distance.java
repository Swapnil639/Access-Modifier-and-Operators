package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double distance;
        System.out.println("Enter number:");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        distance = Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }
}
