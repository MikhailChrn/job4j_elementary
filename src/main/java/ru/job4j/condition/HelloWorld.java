package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0 && number % 5 == 0) {
            result = "Hello, World!!!";
        } else if (number % 3 == 0) {
            result = "Hello";
        } else if (number % 5 == 0) {
            result = "World";
        } else {
            result = "Operation not support";
        }
        return result;
    }
}
