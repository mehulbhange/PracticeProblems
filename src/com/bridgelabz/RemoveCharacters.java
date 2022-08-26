package com.bridgelabz;

import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            int tmp = (int)str.charAt(i);
            if((tmp > 96 && tmp < 123) || (tmp > 64 && tmp < 91)){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
