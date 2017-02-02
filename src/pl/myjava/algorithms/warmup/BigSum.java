package pl.myjava.algorithms.warmup;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        BigDecimal result = new BigDecimal(0);
        
        for (int count = 0; count < size; count++) {
            if (in.hasNextInt()) {
                result.add(new BigDecimal(in.nextInt()));
            }
        }
        
        System.out.println(result);
    }
}
