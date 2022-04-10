package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteV = 126; //Задание №1
        short shortV = 256; //Задание №1
        int intV = 10_000_000; // Задание №1-2
        long longV = 1_000_000_000_000_000_000L; // Задание №1-2
        float floatV = 100.066_123_455f; // Задание №1-2
        double doubleV = 15_500_088.443_311_2201; // Задание №1-2
        char charV = 'B'; //Задание №1
        boolean booleanV = true; //Задание №1

        char symbol1 = '\u00a9'; // Задание №3
        char symbol2 = 181; // Задание №3
        char symbol3 = 174; // Задание №3

        System.out.println("Значение типа byte = " + byteV +
                '\n' + "Значение типа short = " + shortV +
                '\n' + "Значение типа int = " + intV +
                '\n' + "Значение типа long = " + longV +
                '\n' + "Значение типа float = " + floatV +
                '\n' + "Значение типа double = " + doubleV +
                '\n' + "Значение типа char = " + charV +
                '\n' + "Значение типа boolean = " + booleanV +
                '\n' + "Symbols" +
                '\n' + "Символ 1 = " + symbol1 +
                '\n' + "Символ 2 = " + symbol2 +
                '\n' + "Символ 3 = " + symbol3);
    }
}
