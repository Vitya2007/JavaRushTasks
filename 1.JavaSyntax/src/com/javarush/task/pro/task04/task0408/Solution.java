package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int x = 0;
        while (scanner.hasNextInt()) {
            x = scanner.nextInt();
            if (max < x && x % 2 == 0) {
                max = x;
            }
        }
        System.out.println(max);

    }
}