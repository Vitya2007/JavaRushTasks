package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int  min2 = Integer.MAX_VALUE;
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number<min) {
                min2 = min;
                min = number;

            } else if(number>min && number<min2) {
                min2 = number;
            }
        }
        System.out.println(min2);



    }
}