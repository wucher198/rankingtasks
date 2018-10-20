package pl.myjava.algorithms.implementation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        int result = 0;
        final List<Integer> intAr = new ArrayList<>();
        IntStream.of(ar).forEach(number -> intAr.add(number));

        Map<Integer, Long> count = intAr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result = count.entrySet().stream().max((e1, e2) -> (int) (e1.getValue() - e2.getValue())).get().getKey();
        
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
