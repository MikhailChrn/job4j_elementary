package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int a1, int a2, int a3) {
        int max = max(a1, a2);
        return max > a3 ? max : a3;
    }

    public static int max(int b1, int b2, int b3, int b4) {
        int max = max(b1, b2, b3);
        return max > b4 ? max : b4;
    }
}
