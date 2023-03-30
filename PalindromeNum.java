package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp = a;
        int rem, rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(rev);
        if (rev == a) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("not palindrome");
        }
    }
}
