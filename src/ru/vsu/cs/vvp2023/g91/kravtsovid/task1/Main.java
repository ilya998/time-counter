package ru.vsu.cs.vvp2023.g91.kravtsovid.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void numb(Scanner scn, int d, String n) {
        try {
            global.temp = scn.nextInt();
            if (global.temp > d) {
                System.out.println(n + " число выходит за допустимый предел. Пожалуйста вводите только числа от 0 до " + d + ".");
            } else {
                global.a -= 1;
            }
        } catch (InputMismatchException e) {
            String err = scn.next();
            System.out.println('"' + err + '"' + " не является допустимым числом. Пожалуйста вводите только числа от 0 до " + d + ".");
        }
    }

    public static void main(String[] args) {
        while (global.a != 0) {
            Scanner scan = new Scanner(System.in);
            global.a = 3;
            System.out.print("Введите первый момент времени в формате 'часы минуты секунды': ");
            numb(scan,24, "Первое");
            global.h1 = global.temp;
            numb(scan,60, "Второе");
            global.m1 = global.temp;
            numb(scan,60, "Третье");
            global.s1 = global.temp;
        }
        global.a = 3;
        while (global.a != 0) {
            global.a = 3;
            System.out.print("Введите второй момент времени в формате 'часы минуты секунды': ");
            Scanner scan1 = new Scanner(System.in);
            numb(scan1,24, "Первое");
            global.h2 = global.temp;
            numb(scan1,60, "Второе");
            global.m2 = global.temp;
            numb(scan1,60, "Третье");
            global.s2 = global.temp;
        }
        int result = (((global.h2 + 24) * 3600 + global.m2 * 60 + global.s2) - (global.h1 * 3600 + global.m1 * 60 + global.s1)) % 86400;
        System.out.print("Разница во времени - " + result + " секунд.");
    }
}