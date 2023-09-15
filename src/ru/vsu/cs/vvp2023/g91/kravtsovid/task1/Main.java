package ru.vsu.cs.vvp2023.g91.kravtsovid.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int h1 = 0;
        int m1 = 0;
        int s1 = 0;
        while (a != 0) {
            System.out.print("Введите первый момент времени в формате 'часы минуты секунды': ");
            Scanner scan = new Scanner(System.in);
            try {
                h1 = scan.nextInt();
                if (h1 > 24) {
                    System.out.println("Количество часов выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 24.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество часов выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 24.");
            }
            try {
                m1 = scan.nextInt();
                if (m1 > 60) {
                    System.out.println("Количество минут выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 60.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество минут выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 60.");
            }
            try {
                s1 = scan.nextInt();
                if (s1 > 60) {
                    System.out.println("Количество секунд выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 60.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество секунд выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 60.");
            }
        }
        a = 3;
        int h2 = 0;
        int m2 = 0;
        int s2 = 0;
        while (a != 0) {
            System.out.print("Введите второй момент времени в формате 'часы минуты секунды': ");
            Scanner scan = new Scanner(System.in);
            try {
                h2 = scan.nextInt();
                if (h2 > 24) {
                    System.out.println("Количество часов выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 24.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество часов выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 24.");
            }
            try {
                m2 = scan.nextInt();
                if (m2 > 60) {
                    System.out.println("Количество минут выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 60.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество минут выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 60.");
            }
            try {
                s2 = scan.nextInt();
                if (s2 > 60) {
                    System.out.println("Количество секунд выходит за допустимый предел. Пожалуйста вводите только числа от 0 до 60.");
                } else {
                    a = a - 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Количество секунд выходит за допустимый предел либо вы использовали буквы. Пожалуйста вводите только числа от 0 до 60.");
            }
        }
        int result = (((h2 + 24) * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1)) % 86400;
        System.out.print("Разница во времени - ");
        System.out.print(result);
        System.out.print(" секунд.");
    }
}

