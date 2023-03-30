package com.bridgelabz;

import java.util.Scanner;

public class NaturalNumUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=0;
        for (int i = a; i >0; i--) {
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
