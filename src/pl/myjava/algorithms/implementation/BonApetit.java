package pl.myjava.algorithms.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BonApetit {
    static String bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i != k) {
                sum += ar[i];
            }
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        System.out.println(bonAppetit(n, k, b, ar));
    }
}
