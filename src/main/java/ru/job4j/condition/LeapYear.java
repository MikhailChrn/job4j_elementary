package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
