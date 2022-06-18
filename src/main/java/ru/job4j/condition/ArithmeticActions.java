package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result;
        if (rsl - right == left) result = "added";
        else if (rsl + right == left) result = "subtracted";
        else if (rsl > left && rsl / right == left) result = "multiplied";
        else if (rsl < left && rsl * right == left) result = "divided";
        else result = "none";
        return result;
    }
}
