package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        String eight = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(eight);
            eight = eight.concat("8");
        }
    }
}