package pl.myjava.implementation;

import java.util.Scanner;

// IN: 942381765 627450398 954173620 583762094 236817490
// OUT: 2390411747 3107767877

// IN: 769082435 210437958 673982045 375809214 380564127
// OUT: 1640793344 2199437821

// Check if this solution work:
// Get first number and summ it with all another 3 in the array
// Then get second number and summ it with all next 3 in the array but dont use first number

public class MinMaxSum {
	private static final int NON = 5;
	private static final int NTS = 4;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] numbers = new long[NON];
		long max = 0;
		long min = 0;
		
		for (int count = 0; count < NON; count++) {
			numbers[count] = in.nextInt();
		}
		
		for (int count = 0; count < NTS; count++) {
			max += numbers[count];
		}
		
		long tmp = max;
		min = max;
		
		for (int count = NTS; count < NON; count++) {
			tmp += numbers[count];
			tmp -= numbers[count - NTS];
			
			if (tmp > max) {
				max = tmp;
			} else if (tmp < min) {
				min = tmp;
			}
		}
		
		System.out.println(min + " " + max);
	}
}
