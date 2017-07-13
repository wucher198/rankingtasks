package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class GradingStudents {
    static int[] solve(int[] grades){
        return Arrays.stream(grades).map(GradingStudents::roundGrade).toArray();
    }

    private static int roundGrade(int grade) {
        int result = grade;

        if (grade >= 38) {
            int rest = 5 - (grade % 5);

            if (rest < 3) {
                result = grade + rest;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];

        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }

        int[] result = solve(grades);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }

        System.out.println("");


    }
}
