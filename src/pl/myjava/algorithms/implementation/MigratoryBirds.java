package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap();
        
        Arrays.stream(ar).collect(Collectors.groupingBy(Function.identity()), accumulator, combiner)
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
