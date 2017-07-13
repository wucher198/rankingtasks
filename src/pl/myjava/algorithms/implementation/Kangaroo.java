package pl.myjava.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean meet = false;

        if (x1 < x2 && v1 != v2) {
            while (x1 < x2) {
                x1 += v1;
                x2 += v2;
            }
        } else if (x1 > x2 && v1 != v2) {
            while (x1 > x2) {
                x1 += v1;
                x2 += v2;
            }
        }

        if (x1 == x2) {
            meet = true;
        }

        return meet ? "YES" : "NO0";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
