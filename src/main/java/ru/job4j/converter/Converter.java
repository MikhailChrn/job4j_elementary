package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEvroValue = 2.0F;
        float outEvroValue = Converter.rubleToEuro(in);
        boolean passedEvroCase = expectedEvroValue == outEvroValue;
        System.out.println("140 rubles are 2.0 evro. Test result : " + passedEvroCase);
        float expectedDollarValue = 2.3333333F;
        float outDollarValue = Converter.rubleToDollar(in);
        boolean passedDollarCase = expectedDollarValue == outDollarValue;
        System.out.println("140 rubles are 2.33 dollar. Test result : " + passedDollarCase);
    }
}
