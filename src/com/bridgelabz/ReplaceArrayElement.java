package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int[] copyArray = array.clone();
        Arrays.sort(copyArray);

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if( array[i] == copyArray[j]){
                    array[i] = j+1;
                    break;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
