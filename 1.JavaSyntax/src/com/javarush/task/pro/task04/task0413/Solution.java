package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        String eight = "8";
        for(int a = 0; a<10;a++) {
            System.out.println(eight);
            eight = eight.concat("8");
        }

    }
}