package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secret2 = scanner.nextLine();
        if (secret.equalsIgnoreCase(secret2)) {

            System.out.println("доступ разрешен");
        } else {

            System.out.println("доступ запрещен");
        }
    }
}
