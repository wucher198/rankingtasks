package pl.myjava.algorithms.implementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfProgrammer {

    static String solve(int year){
        return getNumberOfDayInOctober(year) + ".09." + year;
    }

    private static int getNumberOfDayInOctober(int year) {
        int result = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;

        if ((year >= 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) || (year < 1918 && year % 4 == 0)) {
            result += 1;
        }

        if (year == 1918) {
            result -= 13;
        }

        return 256 - result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
