package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int number = scanner.nextInt();
                numbers[i] = number;
            }
            if (N % 2 == 0) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            } else {

                for (int j = 0; j < N; j++) {
                    System.out.println(numbers[j]);
                }
            }

        }
    }

}

