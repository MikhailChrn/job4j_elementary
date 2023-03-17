package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean reference = data[0];
        for (int n = 1; n < data.length; n++) {
            if (data[n] != reference) {
                result = false;
                break;
            }
        }
        return result;
    }
}

