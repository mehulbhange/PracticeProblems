package com.bridgelabz;

import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            boolean isRepeated = false;
            for (int j = 0; j < array.length; j++){
                if(i != j && array[i] == array[j]){
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated){
                System.out.print(array[i]+" ");
            }
        }
    }
}
