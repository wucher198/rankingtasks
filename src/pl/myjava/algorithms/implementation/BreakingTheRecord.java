package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class BreakingTheRecord {
    static int[] getRecord(int[] s){
        final int[] records = new int[2];

        Arrays.stream(s).forEach(score -> {

        });

        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
