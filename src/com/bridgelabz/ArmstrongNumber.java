package com.bridgelabz;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(isArmstrong(num))
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong number");
    }
    public static boolean isArmstrong(int num){
        int actualNumber = num;
        int sum = 0;

        while (num > 0){
            int tmp = num % 10;
            sum += (tmp*tmp*tmp);
            num = num / 10;
        }
        return actualNumber == sum;
    }
}
