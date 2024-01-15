package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double digit1 = scanner.nextDouble();
        double digit2 = scanner.nextDouble();
        if (digit1 == digit2) {
            System.out.println("числа равны");
        } else System.out.println("числа не равны");
    }
}
