package com.company;


public class Main {

    public static void main(String[] args) {
        int x = 10, y = 11;

        int dayOfWeek = 5;
        if (dayOfWeek == 1)
            System.out.println("Satuarday");
        else if (dayOfWeek == 2)
            System.out.println("Sunday");
        else if (dayOfWeek == 3)
            System.out.println("Monday");
        else if (dayOfWeek == 4)
            System.out.println("Thursday");
        else if (dayOfWeek == 5)
            System.out.println("Wednesday");
        else if (dayOfWeek == 6)
            System.out.println("Tuesday");
        else if (dayOfWeek == 7)
            System.out.println("Friday");
        else
            System.out.println(" this number is not in weekdays");
    }
}