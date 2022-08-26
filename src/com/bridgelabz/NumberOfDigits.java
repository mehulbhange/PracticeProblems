package com.bridgelabz;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int digits = 0;

        while (num > 0){
            digits++;
            num = num / 10;
        }

        System.out.println("Number of digits : "+ digits);
    }
}
