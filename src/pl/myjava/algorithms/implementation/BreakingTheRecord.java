package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class BreakingTheRecord {
    static int[] getRecord(int[] s){
    	final int[] result = new int[2];
        final int[] maxMin = new int[2];
        
        maxMin[0] = s[0];
        maxMin[1] = s[0];

        Arrays.stream(s).skip(1).forEach(score -> {
        	if (score > maxMin[0]) {
        		maxMin[0] = score;
        		result[0]++;
        	} else if (score < maxMin[1]) {
        		maxMin[1] = score;
        		result[1]++;
        	}
        });

        return result;
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
