package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        return result;
    }
}