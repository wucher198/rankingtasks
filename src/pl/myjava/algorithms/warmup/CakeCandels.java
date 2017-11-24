package pl.myjava.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by anonim on 13.07.17.
 */
public class CakeCandels {
    static int birthdayCakeCandles(int n, int[] ar) {
        int tollest = Arrays.stream(ar).reduce(ar[0], (a, b) -> a > b ? a : b);
        long number = Arrays.stream(ar).filter(a -> a == tollest).count();

        return (int) number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
