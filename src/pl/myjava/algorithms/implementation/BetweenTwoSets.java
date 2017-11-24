package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b){
        int pointer = Arrays.stream(a).max().getAsInt();
        int end = Arrays.stream(b).min().getAsInt();
        int count = 0;

        while (pointer <= end) {
            final int tmpPointer = pointer;
            boolean ifASatisfied = Arrays.stream(a).filter(element -> tmpPointer % element == 0).count() == a.length;
            boolean ifBSatisfied = Arrays.stream(b).filter(element -> element % tmpPointer == 0).count() == b.length;

            if (ifASatisfied && ifBSatisfied) {
                count++;
            }

            pointer++;
        }

        return count++;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
