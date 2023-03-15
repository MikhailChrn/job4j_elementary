package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (Math.abs(number) <= 1) {
            prime = false;
        }
        if (Math.abs(number) == 2 || Math.abs(number) == 3) {
            return prime;
        }
        for (int n = 2; n < Math.abs(number); n++) {
            if (Math.abs(number) % n == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
