package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String word = scanner.nextLine();

            if (word.equals("ENTER")) {
                break;
            }
            int digit = Integer.parseInt(word);
            sum += digit;

        }
        System.out.println(sum);
    }
}