package ru.vsu.cs.vvp2023.g91.kravtsovid.task1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int input_number;
    public static boolean check_numb_input(Scanner scn, int diapason, String number_count) {
        try {
            input_number = scn.nextInt();
            if (input_number > diapason) {
                System.out.println(number_count + " число выходит за допустимый предел. Пожалуйста вводите только числа от 0 до " + diapason + ".");
                return false;
            } else {
                return true;
            }
        } catch (InputMismatchException e) {
            String err = scn.next();
            System.out.println('"' + err + '"' + " не является допустимым числом. Пожалуйста вводите только числа от 0 до " + diapason + ".");
            return false;
        }
    }

    public static Map<String, Integer> scan_day_time(String time_period_number) {
        int right_input_counter = 3;
        int hour, minute, second;
        Map<String, Integer> time_map = new HashMap<>();
        while (right_input_counter != 0) {
            Scanner scan = new Scanner(System.in);
            right_input_counter = 3;
            System.out.print("Введите " + time_period_number + " момент времени в формате 'часы минуты секунды': ");
            if (check_numb_input(scan,24, "Первое")) {
                hour = input_number;
                time_map.put("hour", hour);
                right_input_counter -= 1;
            }
            if (check_numb_input(scan,60, "Второе")) {
                minute = input_number;
                time_map.put("minute", minute);
                right_input_counter -= 1;
            }
            if (check_numb_input(scan,60, "Третье")) {
                second = input_number;
                time_map.put("second", second);
                right_input_counter -= 1;
            }
        }
        return time_map;
    }

    public static void main(String[] args) {
        Map<String, Integer> time_map1 = scan_day_time("первый");
        Map<String, Integer> time_map2 = scan_day_time("второй");
        int time_moment1 = ((time_map2.get("hour") + 24) * 3600 + time_map2.get("minute") * 60 + time_map2.get("second"));
        int time_moment2 = (time_map1.get("hour") * 3600 + time_map2.get("minute") * 60 + time_map2.get("second"));
        int result = (time_moment1 - time_moment2) % 86400;
        System.out.print("Разница во времени - " + result + " секунд.");
    }

}