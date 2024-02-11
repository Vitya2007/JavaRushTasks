package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        int[] number = {6,42,3,7,16,10,20};
        int number1 = 0;
        for (int i = 0; i < number.length; i++) {
            number1 = number[i] + number1;
        }
        System.out.println(number1);
    }
}