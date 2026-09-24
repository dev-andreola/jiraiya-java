package br.com.devan.intro;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // PRIMITIVE DATA TYPES -----------
        // Basic data types that directly store simple values in a fixed amount of memory space.

        // boolean - 1 bit
        boolean isAdmin = true;
        boolean isLoggedIn = false;

        // byte - 1 byte
        byte ageInMonths = 12;
        byte balance = -100;

        // char - 2 bytes
        char gender = 'M';
        char symbol = '\u00BC'; // ¼ (Unicode)
        char letter = 87; // W (ASCII)

        // short - 2 bytes
        short year = 2026;
        short distance = 30000;

        // int - 4 bytes
        int age = 26;
        int temperature = -10;
        int population = 1500000;

        // float - 4 bytes
        float height = 1.75f;
        float weight = 68.5f;

        // long - 8 bytes
        long distanceToMoon = 384400000L;
        long fileSize = 5000000000L;

        // double - 8 bytes
        double price = 19.99;
        double pi = 3.141592653589793;
        double temperatureCelsius = -12.75;

        // CASTING -----------
        // The process of converting a value from one data type to another.
        // It is not really recommended

        int earthAge = (int) 10000000000L; // 1410065408 - does not fit
        float earnings = (float) 2500.0D; // 2500.0 - it fits

        // STRING -----------
        // Not primitive

        String name = "Vitor";
    }
}
