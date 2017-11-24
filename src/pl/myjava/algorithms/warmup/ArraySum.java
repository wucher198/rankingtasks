package pl.myjava.algorithms.warmup;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Read size
        int size = in.nextInt();
        int sum = 0;
        
        for (int count = 0; count < size; count++) {
            sum += in.nextInt();
        }
        
        System.out.println(sum);
    }
}
