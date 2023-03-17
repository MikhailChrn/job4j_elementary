package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int n = 1; n < data.length; n++) {
            if (data[n] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

