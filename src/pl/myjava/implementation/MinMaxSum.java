package pl.myjava.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// IN: 942381765 627450398 954173620 583762094 236817490
// OUT: 2390411747 3107767877

// IN: 769082435 210437958 673982045 375809214 380564127
// OUT: 1640793344 2199437821

// Check if this solution work:
// Get first number and summ it with all another 3 in the array
// Then get second number and summ it with all next 3 in the array but dont use first number

public class MinMaxSum {
	private static final int NOTD = 10;
	private static final int NON = 5;
	private static final int NTS = 4;
	private static final String MAX = "max";
	private static final String MIN = "min";
	
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		long[] numbers = new long[NON];
//		
//		for (int count = 0; count < NON; count++) {
//			numbers[count] = in.nextInt();
//		}
		
		long[][] aLotOfNumbers = generateNumbers();
		
		for (long[] numbers : aLotOfNumbers) {
			System.out.println(Arrays.toString(numbers));
			Map<String, Long> faster = algorithm(numbers);
			Map<String, Long> all = testAllPosibilities(numbers);
			
			System.out.println(faster);
			System.out.println(all);
			System.out.println(faster.equals(all));
		}
	}

	// For now not working
	private static Map<String, Long> algorithm(long[] numbers) {
		long max = 0;
		long min = 0;
		
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
		
//		System.out.println(min + " " + max);
		Map<String, Long> result = new HashMap<>();
		result.put(MAX, max);
		result.put(MIN, min);
		
		return result;
	}
	
	public static Map<String, Long> testAllPosibilities(long[] numbers) {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		
		long[] numbersToSum = new long[NTS];
		
		for (int first = 0; first < NON; first++) {
			for (int second = 0; second < NON; second++) {
				if (second != first) {
					for (int third = 0; third < NON; third++) {
						if (second != first && third !=  first && third != second) {
							for (int fourth = 0; fourth < NON; fourth++) {
								if (second != first && third != first && third != second && fourth != first && fourth != second && fourth != third) {
									long sum = numbers[first] + numbers[second] + numbers[third] + numbers[fourth];
									
//									System.out.println("**********************");
//									System.out.println(first + "\t" + second + "\t" + third + "\t" + fourth);
//									System.out.println(numbers[first] + "\t" + numbers[second] + "\t" + numbers[third] + "\t" + numbers[fourth]);
//									System.out.println(sum);
								
									if (sum > max) {
										max = sum;
									} else if (sum < min) {
										min = sum;
									}
								}
							}
						}
					}
				}
			}
		}
		
//		System.out.println(min + " " + max);
		Map<String, Long> result = new HashMap<>();
		result.put(MAX, max);
		result.put(MIN, min);
		
		return result;
	}
	
	public static long[][] generateNumbers() {
		long[][] result = new long[NOTD][NON];
		
		for (int outer = 0; outer < result.length; outer++) {
			for (int count = 0; count < NON; count++) {
				result[outer][count] = (long) (Math.random() * 999999);
			}
		}
		
		return result;
	}
}
