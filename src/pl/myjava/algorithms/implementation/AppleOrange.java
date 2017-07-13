package pl.myjava.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anonim on 13.07.17.
 */
public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];

        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }

        int[] orange = new int[n];

        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        System.out.println(Arrays.stream(apple).filter(ap -> {
            int place = a + ap;

            return place >= s && place <= t;
        }).count());

        System.out.println(Arrays.stream(orange).filter(or -> {
            int place = b + or;

            return place >= s && place <= t;
        }).count());
    }
}
