package ru.vsu.cs.vvp2023.g91.kravtsovid.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первый момент времени в формате 'часы минуты секунды': ");
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();
        System.out.print("Введите второй момент времени в формате 'часы минуты секунды': ");
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int s2 = scan.nextInt();
        int result = (((h2 + 24) * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1)) % 86400;
        System.out.print("Разница во времени - ");
        System.out.print(result);
        System.out.print(" секунд.");
    }
}