package pl.myjava.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] numbers = new int[size];
		
		for (int count = 0; count < size; count++) {
			numbers[count] = in.nextInt();
		}
		
		Arrays.stream(countFraction(size, numbers))
			.forEach(fraction -> System.out.printf("%d", fraction));
	}
	
	public static double[] countFraction(int size, int[] numbers) {
		double[] result = {0, 0, 0};
		
		for (int count = 0; count < size; count++) {
			if (numbers[count] > 0) {
				result[0]++;
			} else if (numbers[count] < 0) {
				result[1]++;
			} else {
				result[2]++;
			}
		}
		
		result[0]/=size;
		result[1]/=size;
		result[2]/=size;
		
		return result;
	}
}
