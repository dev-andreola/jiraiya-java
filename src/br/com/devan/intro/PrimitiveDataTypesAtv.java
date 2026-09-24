package br.com.devan.intro;

/*
Create variables for the fields between <> and print the following message:

I, <name>, residing in <country>,
confirm that I received the salary of $<salary> at <date>.
*/

public class PrimitiveDataTypesAtv {
    public static void main(String[] args) {
        String name = "Vitor";
        String country = "Brazil";
        double salary = 450.43;
        String date = "09/24/2026";

        System.out.println("I, " + name + ", residing in " + country +
                ", confirm that I received the salary of $"
                + salary + " on " + date + ".");
    }
}