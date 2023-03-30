package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        //March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter month number");
        int m=scanner.nextInt();
        System.out.println("Enter number");
        int d=scanner.nextInt();

        boolean isSpring=(m==3 && d>=20 && d<=31)||(m==4 && d>=1 && d<=30)||(m==5 && d>=1 && d<=31)||(m==6 && d>=1 && d<=20);
        System.out.println(isSpring);
    }
}
