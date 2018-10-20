package pl.myjava.algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

        /*
         * Complete the pageCount function below.
         */
        static int pageCount(int n, int p) {
            if (p == 1) {
                return 0;
            } else if (p == n) {
                return 0;
            } else if (n % 2 == 1 && p == n -1) {
                return 0;
            } else if (n % 2 == 0 && (p == n - 1 || p == n -2)) {
                return 1;
            }

            int fromFirst = p / 2;
            int fromEnd = (n - p) / 2;

            return fromFirst > fromEnd ? fromEnd : fromFirst;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int p = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int result = pageCount(n, p);

            System.out.println(result);
            scanner.close();
        }
}
