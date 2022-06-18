package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int result = 0;
        for (int i = 0; i < 7; i++) {
            if (i <= 4) {
                if (hours[i] <= 8) result = result + hours[i] * 10;
                else if (hours[i] > 8) result = result + 80 + (hours[i] - 8) * 15;
            } else if (i > 4) {
                if (hours[i] <= 8) result = result + hours[i] * 20;
                else if (hours[i] > 8) result = result + 160 + (hours[i] - 8) * 30;
            }
        }
        return result;
    }
}