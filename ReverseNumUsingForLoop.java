package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int rem,rev=0;
        for (int i = 0; i <100; i++) {
            while (a>0) {
                rem = a % 10;
                rev = rev * 10 + rem;
                a = a / 10;
            }

        }
        System.out.print(rev);
    }
}
